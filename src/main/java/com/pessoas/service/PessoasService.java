package com.pessoas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.pessoas.model.Pessoas;

@Service //spring cuida da injeção de dependencia. Quando eu precisar de usar essa classe em outro lugar eu nao precisarei
//dar um new nela
public class PessoasService {

	private final AtomicLong count = new AtomicLong();
	
	public Pessoas findById(String id) {
		Pessoas pessoas = new Pessoas();
		
		pessoas.setId(count.incrementAndGet());
		pessoas.setPrimeiroNome("Marina");
		pessoas.setUltimoNome("Neri");
		pessoas.setEndereco("xxxxx - xxxx");
		pessoas.setSexo("Feminino");
		
		return  pessoas;
	}
	
	
	public List<Pessoas> findAll (){
		/*metodo que retorna todas as pessoas cadastradas*/
		
		List<Pessoas> pessoas = new ArrayList<>();
		
		for(int i =0; i<4; i++) {
			//mockPessoas
			Pessoas pessoa = mockPessoa(i);
			pessoas.add(pessoa);
		}
		
		return pessoas;
	}


	private Pessoas mockPessoa(int i) {
		
		Pessoas pessoas = new Pessoas();
		
		pessoas.setId(count.getAndIncrement());
		pessoas.setPrimeiroNome("Nome " + +i);
		pessoas.setUltimoNome("Sobrenome");
		pessoas.setEndereco("xxxxx - Brasil");
		pessoas.setSexo("Feminino");
		
		return pessoas;
	}
}
