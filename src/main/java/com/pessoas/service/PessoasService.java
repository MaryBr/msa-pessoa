package com.pessoas.service;

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
}
