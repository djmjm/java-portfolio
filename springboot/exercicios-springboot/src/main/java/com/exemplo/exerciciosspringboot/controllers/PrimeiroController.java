package com.exemplo.exerciciosspringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@RequestMapping(
	method = RequestMethod.GET,
	path = { "/ola", "saudacao" }
	)
	public String olar() {
		return "Olá Spring Boot!";
	}
}
