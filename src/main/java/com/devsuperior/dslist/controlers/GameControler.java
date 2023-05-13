package com.devsuperior.dslist.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.DTO.GameDTO;
import com.devsuperior.dslist.DTO.GameListDTO;
import com.devsuperior.dslist.DTO.GameMinDTO;
import com.devsuperior.dslist.DTO.ReplacementDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;

import jakarta.persistence.PostLoad;

@RestController
@RequestMapping(value = "/games")
public class GameControler {

	@Autowired
	private GameService gameService;
	
	@Autowired
	private GameListService gameListService;

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
	@GetMapping(value = "/list")
	public List<GameListDTO> listAll() {
		var result = gameListService.findAll();
		return result;
		
	}
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
		var result = gameService.findByList(listId);
		return result;
		
	}
	
	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable Long listId,@RequestBody ReplacementDTO body) {
		
		gameService.move(listId,body.getSourceIndex(),body.getDestinationIndex());
	}
	

}
