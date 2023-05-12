package com.devsuperior.dslist.DTO;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {
	private Long id;	
	private String title;	
	private Integer year;	
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
	}

	public GameMinDTO() {
		super();
	}
	public GameMinDTO(GameMinProjection projection) {
		super();
		this.id = projection.getId();
		this.year = projection.getYear();
		this.title = projection.getTitle();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();		
		
	}
	public GameMinDTO(Game entity) {
		super();
		this.id = entity.getId();
		this.year = entity.getYear();
		this.title = entity.getTitle();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();		
		
		
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	
	
	
}
