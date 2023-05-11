package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.devsuperior.dslist.entities.GameList;

@Component
public interface GameListRepository extends JpaRepository<GameList,Long> {
	

}
