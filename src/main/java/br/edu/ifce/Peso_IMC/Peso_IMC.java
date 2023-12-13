package br.edu.ifce.Peso_IMC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifce.Peso_IMC.serviceImpl.PessoaServiceImpl;

@SpringBootApplication
public class Peso_IMC implements CommandLineRunner {
	@Autowired
	PessoaServiceImpl Pessoa;
	
	public static void main(String[] args) {
		SpringApplication.run(Peso_IMC.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		
	}

}
