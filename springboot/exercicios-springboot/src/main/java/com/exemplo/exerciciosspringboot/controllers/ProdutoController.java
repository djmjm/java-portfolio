package com.exemplo.exerciciosspringboot.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.exerciciosspringboot.models.entities.Produto;
import com.exemplo.exerciciosspringboot.models.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@RequestMapping(method = { 
			RequestMethod.POST, 
			RequestMethod.PUT } 
	)
	public  @ResponseBody Produto novoProduto(Produto produto
			) {
		
		produtoRepository.save(produto);
		
		return produto;
	}
	
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Produto> obterProdutoPorId(
			@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	@GetMapping(path="/pagina/{id}/{offset}")
	public Iterable<Produto> 
	obterProdutosPorPagina(
			@PathVariable int id,
			@PathVariable int offset){
		offset =  Math.min(
						5, 
					Math.max(
						offset, 
						1
					) 
				);
		PageRequest page = PageRequest.of(
				id,
				offset
				)
		;
		return produtoRepository.findAll(page);
	}
	
	@PutMapping(path="/alterar")
	public Produto alterarProduto(Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@DeleteMapping(path="{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
	/*
	@PostMapping
	public  @ResponseBody Produto novoProduto(
			@RequestParam String nome,
			@RequestParam double preco,
			@RequestParam double desconto
			) {
		Produto produto = 
				new Produto(nome, preco, desconto);
		
		produtoRepository.save(produto);
		
		return produto;
	}
	*/
}
