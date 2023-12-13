package br.edu.ifce.Peso_IMC.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.ifce.Peso_IMC.model.Pessoa;

public interface PessoaRepository  extends JpaRepository<Pessoa,Long>{
	
	@Query("select e from Pessoa e  where e.cpf =:cpf ")
	Pessoa findbymail(String cpf);
	
	@Query("select e from Pessoa e")
	List<Pessoa> findAllPessoa();
	
	@Query("select e from Pessoa e where e.dtNascimento  > :d")
	List<Pessoa> findAllByDtNascimento(Date d);

	@Query("select count(e) from Pessoa e where e.situacao = :situacao")
	List<Pessoa> countBySituacao(String situacao);
}
