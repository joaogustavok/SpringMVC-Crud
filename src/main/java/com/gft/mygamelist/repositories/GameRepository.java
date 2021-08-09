package com.gft.mygamelist.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.mygamelist.entities.Game;
import com.gft.mygamelist.entities.Plataform;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

	List<Game> findByPlataform(Plataform plataform);
	
	
}
