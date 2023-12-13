package br.edu.ifce.Peso_IMC.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifce.Peso_IMC.exceptions.PessoaNotFoundException;
import br.edu.ifce.Peso_IMC.model.Pessoa;
import br.edu.ifce.Peso_IMC.repository.PessoaRepository;
import br.edu.ifce.Peso_IMC.service.PessoaService;

@Service
public class PessoaServiceImpl  implements PessoaService{
	@Autowired
	PessoaRepository pessoa;
	
	@Override
	public Pessoa salvar(Pessoa c) {
		return pessoa.save(c);
	}

	@Override
	public Pessoa buscarPessoaPorId(Long id) {
		return pessoa.findById(id).orElseThrow(() -> new PessoaNotFoundException(id));
	}

	@Override
	public List<Pessoa> countBySituacao(String s) {
		return pessoa.countBySituacao(s);
	}

	@Override
	public List<Pessoa> buscarTodos() {
		return pessoa.findAll();
	}

	@Override
	public Pessoa editar(Long id, Pessoa newinfo) {
		Pessoa c = buscarPessoaPorId(id);
		c.setCpf(newinfo.getCpf());
		c.setNome(newinfo.getNome());
		c.setPeso(newinfo.getPeso());
		c.setAltura(newinfo.getAltura());
		c.setDtNascimento(newinfo.getDtNascimento());
		c.setImc(newinfo.getImc());
		c.setSituacao(newinfo.getSituacao());
		return pessoa.save(c);
	}

	@Override
	public Pessoa editar(Pessoa newinfo) {
		return pessoa.save(newinfo);
	}

	@Override
	public void excluir(Long id) {
		pessoa.deleteById(id);
		
	}
	
}
