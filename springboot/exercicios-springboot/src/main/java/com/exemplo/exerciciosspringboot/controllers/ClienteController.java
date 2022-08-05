package com.exemplo.exerciciosspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.exerciciosspringboot.models.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(1, "Anônimo", "125.125.125-45");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId( @PathVariable int id) {
		return new Cliente(id, "Maria", "333.666.999-12");
	}
	
	@GetMapping
	public Cliente obterClientePorIdDefault(
			@RequestParam (name="id") int id) {
		return new Cliente(id, "Default", "111.111.111-11");
	}

}
