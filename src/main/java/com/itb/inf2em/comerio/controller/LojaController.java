package com.itb.inf2em.comerio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2em.comerio.model.Produto;

@Controller
@RequestMapping("/comerio/produto")
public class LojaController {
	
	@GetMapping("/Listar")
	public String listarProdutos() {
		
		Produto produto;
		
		produto = new Produto();
		
		produto.setNome("Televisor Samsung 75");
		produto.setCofigoBarras("43");
		produto.setPreco(1455.56);
		produto.setId(null);
		
		
		
		return "protudos";
	}

}
