package com.pessoas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value ="/consultaTodos", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pessoas> findAll() {
		return pessoasService.findAll();		
	}
	
	//utilizando o verbo post
	@RequestMapping(value ="/consultaExecute", method=RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)//produz e consome JSON
	public Pessoas execute(@RequestBody Pessoas pessoas ){//requestbody corpo da requisição
		return pessoasService.execute(pessoas);		
	}
	
	@RequestMapping(value ="/consultaExecuteUpdate", method=RequestMethod.PUT, //
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)//produz e consome JSON
	public Pessoas executeUpdate(@RequestBody Pessoas pessoas ){//requestbody corpo da requisição
		return pessoasService.executeUpdate(pessoas);		
	}
	
	@RequestMapping(value ="/consultaDelete", method=RequestMethod.DELETE, //
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)//produz e consome JSON
	public void delete(@PathVariable("id") String id){//requestbody corpo da requisição
		pessoasService.delete(id);
	}
}
