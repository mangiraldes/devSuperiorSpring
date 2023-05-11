package com.devsuperior.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.DTO.GameListDTO;
import com.devsuperior.dslist.DTO.GameMinDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;


@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;	
	
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		
		return result.stream().map(x -> new GameListDTO(x)).collect(Collectors.toList());
		
	}

}
