package com.gft.mygamelist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gft.mygamelist.entities.Game;
import com.gft.mygamelist.repositories.GameRepository;

import com.gft.mygamelist.services.NewGameRequest;

@Controller
@RequestMapping("game")
public class GameController {

	@Autowired
	private GameRepository gameRepository;

	@GetMapping("form")
	public String form(NewGameRequest request) {
		return "game/form";
	}

	@PostMapping("new")
	public String neww(NewGameRequest request) {
		Game game = request.toGame();
		gameRepository.save(game);
		return "redirect:/home";
	}

	@RequestMapping("edit")
	public String edit(@RequestParam Long id, Model model) {
		model.addAttribute("game", gameRepository.getById(id));
		return "game/edit";
	}

	@RequestMapping("/remove")
	public String delete(@RequestParam Long id) {
		gameRepository.deleteById(id);
		return "redirect:/home";
	}

	@RequestMapping(value = "/game", method = RequestMethod.POST)
    public String saveGame(Game game) {
        gameRepository.save(game);
        return "redirect:/home";
	}
}
