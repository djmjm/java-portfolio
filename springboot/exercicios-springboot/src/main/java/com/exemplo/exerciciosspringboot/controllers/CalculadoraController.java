package com.exemplo.exerciciosspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	final String label = "Resultado operação é ->> ";
	
	@GetMapping("/somar/{a}/{b}")
	public String somar(
			@PathVariable Integer a,
			@PathVariable Integer b) {
		a += b; return label + a.toString();
	}
	
	@GetMapping("/subtrair")
	public String subtrair(
			@RequestParam(name="a") Integer a,
			@RequestParam(name="b") Integer b) {
		a -= b; return label + a.toString();
	}
}
