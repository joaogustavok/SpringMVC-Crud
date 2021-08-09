package com.gft.mygamelist.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.mygamelist.entities.Game;
import com.gft.mygamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public Game getGame(Long id) { 
		Optional<Game> game = gameRepository.findById(id);
		return game.get();
	}
	

}
