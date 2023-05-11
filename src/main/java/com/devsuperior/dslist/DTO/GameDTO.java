package com.devsuperior.dslist.DTO;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.Game;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameDTO {
	
	private Long id;	
	private String title;	
	private Integer year;	
	private String imgUrl;
	private String shortDescription;
	private String genre;
	private String platforms;	
	private String longDescription;
	private Double score;

	public GameDTO() {
		super();
	}
	public GameDTO(Game entity) {
		super();
		BeanUtils.copyProperties(entity, this);		
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

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlatforms() {
		return platforms;
	}
	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getShortDescription() {
		return shortDescription;
	}

	
	
	
}
