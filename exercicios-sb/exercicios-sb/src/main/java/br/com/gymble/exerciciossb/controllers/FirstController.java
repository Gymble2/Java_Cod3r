package br.com.gymble.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping(path = "/ola")
	public String ola() {
		return "Olá Spring Boot!";
	}
	
	@PostMapping(path = "/saudacao")
	public String saudacao() {
		return "Olá Spring Boot (POST)!";
	}
}
