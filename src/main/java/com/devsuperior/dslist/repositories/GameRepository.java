package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.devsuperior.dslist.entities.Game;

@Component
public interface GameRepository extends JpaRepository<Game,Long> {
	

}
