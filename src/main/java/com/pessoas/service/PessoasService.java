package com.pessoas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoas.data.model.Pessoas;
import com.pessoas.exception.ResourceNotFoundException;
import com.pessoas.repository.PessoasRepository;


@Service //spring cuida da injeção de dependencia. Quando eu precisar de usar essa classe em outro lugar eu nao precisarei
//dar um new nela
public class PessoasService {

	@Autowired
	PessoasRepository pessoasRepository;


	
	public Pessoas execute(Pessoas pessoas) {
		/* O controller chama o execute que é o metodo que contem a logica que vai até a base de dados e 
		 * depois o resultado é retornado para o controller que é enviado para o JSon para o client
		 * */
		return pessoasRepository.save(pessoas);
	}
	
	public List<Pessoas> findAll (){			
		return pessoasRepository.findAll();
	}
	
	public Pessoas findById(Long id) {
				
		return  pessoasRepository.findById(id).
				orElseThrow(()->new ResourceNotFoundException("Não foi encontrados registros para esse id"));
	}
	

	public Pessoas executeUpdate(Pessoas p) {
		
		Pessoas pessoa = pessoasRepository.findById(p.getId()).
				orElseThrow(()->new ResourceNotFoundException("Não foi encontrados registros para esse id"));
				
		pessoa.setPrimeiroNome(p.getPrimeiroNome());
		pessoa.setUltimoNome(p.getUltimoNome());
		pessoa.setEndereco(p.getEndereco());
		pessoa.setSexo(p.getSexo());
		return pessoasRepository.save(pessoa);
	}
	
	
	public void delete (Long id) {
		
		Pessoas pessoa = pessoasRepository.findById(id).
				orElseThrow(()->new ResourceNotFoundException("Não foi encontrados registros para esse id"));
		pessoasRepository.delete(pessoa);
	}
	
}
