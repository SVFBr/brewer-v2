package com.svfbr.brewer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstiloController {

	@RequestMapping("/estilos/novo")
	public String novo() {
		return "estilo/CadastroEstilo";
	}
	
}
