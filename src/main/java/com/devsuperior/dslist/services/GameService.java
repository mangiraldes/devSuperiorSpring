package com.devsuperior.dslist.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.DTO.GameDTO;
import com.devsuperior.dslist.DTO.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;

import jakarta.transaction.Transactional;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository; 
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional
	public GameDTO findByID(Long Id) {
		
		Game result = gameRepository.findById(Id).get();
		return new GameDTO(result);
		
	}
	
	@Transactional
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		
		return result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());
		
	}
	@Transactional
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		
		return result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());
		
	}

	@Transactional
	public void move(Long listId,int sourceIndex,int destinationIndex){
		List<GameMinProjection> list= gameRepository.searchByList(listId);
		
		GameMinProjection gameMinProjection; 
		gameMinProjection = list.remove(sourceIndex);
		
		list.add(destinationIndex,gameMinProjection);
		
		int min = sourceIndex < destinationIndex ?sourceIndex:destinationIndex;
		int max = sourceIndex > destinationIndex ?sourceIndex:destinationIndex;
		
		for(int i = min; i <= max; i++) {
				
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(),i);
			
			
		}
		
		
		
		
		
	}

}
