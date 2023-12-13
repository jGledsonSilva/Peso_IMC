package br.edu.ifce.Peso_IMC.service;

import java.util.List;

import br.edu.ifce.Peso_IMC.model.Pessoa;

public interface PessoaService {
	
	Pessoa salvar(Pessoa c);
	
	Pessoa buscarPessoaPorId (Long id);

	List<Pessoa> countBySituacao(String s);

	List<Pessoa> buscarTodos();
	
	Pessoa editar (Long id , Pessoa newinfo);
	
	Pessoa editar(Pessoa pessoa);
	
	void excluir(Long id);
}
