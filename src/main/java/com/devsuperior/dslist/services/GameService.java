package com.devsuperior.dslist.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.DTO.GameDTO;
import com.devsuperior.dslist.DTO.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

import jakarta.transaction.Transactional;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository; 
	
	@Transactional
	public GameDTO findByID(Long Id) {
		
		Game result = gameRepository.findById(Id).get();
		return new GameDTO(result);
		
	}
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		
		return result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());
		
	}

}
