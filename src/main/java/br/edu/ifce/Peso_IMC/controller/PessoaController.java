package br.edu.ifce.Peso_IMC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifce.Peso_IMC.model.Pessoa;
import br.edu.ifce.Peso_IMC.serviceImpl.PessoaServiceImpl;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	PessoaServiceImpl pessoa;
	
	@GetMapping("/listar")
	String listAll(ModelMap model){
		model.addAttribute("pessoa",pessoa.buscarTodos());
		return "/pessoa/lista";
	}
	
	@GetMapping("/cadastrar")
	String salvar(ModelMap model){
		model.addAttribute("pessoa",new Pessoa());
		return "/pessoa/cadastro";
	}
	
	
	@PostMapping("/salvar")
	String salvar(Pessoa c) { 
				pessoa.salvar(c);
				return "redirect:/pessoa/listar";
	}
	
	@GetMapping("/editar/{id}")
	String preEditar(@PathVariable("id") Long id, ModelMap model){
		model.addAttribute("pessoa",pessoa.buscarPessoaPorId(id));
		return "/pessoa/cadastro";
	}
	
	@GetMapping("/excluir/{id}")
	String excluir(@PathVariable("id") Long id, ModelMap model){
		pessoa.excluir(id);
		return "redirect:/pessoa/listar";
	}
	
	@PostMapping("/editar")
	String editar(Pessoa c) { 
				pessoa.editar(c);
				return "redirect:/pessoa/listar";
	}
	
	

}
