package com.devsuperior.dslist.DTO;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GameListDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GameListDTO(GameList list) {
		this.id = list.getId();
		this.name = list.getName();
		
		
		
		
		
	}
	
	
	
	
}
