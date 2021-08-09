package com.gft.mygamelist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.gft.mygamelist.entities.Game;
import com.gft.mygamelist.entities.Plataform;
import com.gft.mygamelist.repositories.GameRepository;




@Controller
@RequestMapping("/home")
public class IndexController {
	 
	@Autowired
	private GameRepository gameRepository;
	
	
	@GetMapping
	public String home(Model model) {
		List<Game> games = gameRepository.findAll();
		model.addAttribute("games", games);
		return "home";
	}
		
	@GetMapping("/{plataform}")
	public String perPlataform(@PathVariable("plataform")String plataform,Model model) {
		List<Game> games = gameRepository.findByPlataform(Plataform.valueOf(plataform.toUpperCase()));
		model.addAttribute("games", games);
		model.addAttribute("plataform", plataform);
		return "home";
	}
	
	@GetMapping("/game/form")
	public String comeBack () {
		return "redirect:/game/form";
	}
	}

