package com.edgard.dslistSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edgard.dslistSpring.dto.GameDTO;
import com.edgard.dslistSpring.dto.GameMinDTO;
import com.edgard.dslistSpring.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		var result = gameService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		var result = gameService.findById(id);
		return result;
	}
}
