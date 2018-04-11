package com.svfbr.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.svfbr.brewer.model.Cliente;

@Controller
public class ClientesController {

	@RequestMapping("clientes/novo")
	public String novo() {
		return "cliente/CadastroCliente";
	}

	public String cadastrar(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			model.addAttribute("mensagem", "Erro no formulário");
			return "cliente/CadastroCliente";
		}
		attributes.addFlashAttribute("mensagem", "Cliente salvo com sucesso!");
		System.out.println(" >>> Cliente " + cliente.toString());
		return "redirect:/clientes/novo";
	}

}
