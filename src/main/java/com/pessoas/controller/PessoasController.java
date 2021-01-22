package com.pessoas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pessoas.model.Pessoas;
import com.pessoas.service.PessoasService;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {

	@Autowired
	private PessoasService pessoasService;
		 
	/* injeção de dependencia chama uma outra classe sem precisar de instancia-la. O spring cuida disso: @Autowired
	 * sem o autowired: Classe classe = new Classe().
	 *  Com a anotação: @Autowired Classe */
	
	@RequestMapping(value ="/consulta/{id}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Pessoas findById(@PathVariable("id") String id) {
		
		return pessoasService.findById(id);
		
	}
}
