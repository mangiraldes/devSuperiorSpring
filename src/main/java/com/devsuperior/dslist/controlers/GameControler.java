package com.devsuperior.dslist.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.DTO.GameDTO;
import com.devsuperior.dslist.DTO.GameMinDTO;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameControler {

	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameMinDTO> findAll() {
		var result = gameService.findAll();
		return result;

	}

	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		var result = gameService.findByID(id);
		return result;
		
	}
	
	

}
