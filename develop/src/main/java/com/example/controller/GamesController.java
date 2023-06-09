package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class GamesController {

	@RequestMapping("/")
	public String main(Model model) {
		return "index";
	}
	
	@RequestMapping("memoryGame")
	public String memoryGame(Model model) {
		return "memoryGame";
	}

	@RequestMapping("slotMachine")
	public String slotMachine(Model model) {
		return "slotMachine";
	}
}
