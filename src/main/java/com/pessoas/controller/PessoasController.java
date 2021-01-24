package com.pessoas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoas.data.vo.PessoasVO;
import com.pessoas.service.PessoasService;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {

	@Autowired
	private PessoasService pessoasService;
		 
	/* injeção de dependencia chama uma outra classe sem precisar de instancia-la. O spring cuida disso: @Autowired
	 * sem o autowired: Classe classe = new Classe().
	 *  Com a anotação: @Autowired Classe */
	
	@GetMapping(value ="/consulta/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)//method=RequestMethod.GET = @GetMapping
	public PessoasVO findById(@PathVariable("id") Long id) {		
		return pessoasService.findById(id);
		
	}
	
	@GetMapping(value ="/consultaTodos")
	public List<PessoasVO> findAll() {
		return pessoasService.findAll();		
	}
	
	//utilizando o verbo post
	@PostMapping(value ="/consultaExecute")
	public PessoasVO execute(@RequestBody PessoasVO pessoas ){//requestbody corpo da requisição
		return pessoasService.execute(pessoas);		
	}
	
	@PutMapping(value ="/consultaExecuteUpdate")
	public PessoasVO executeUpdate(@RequestBody PessoasVO pessoas ){//requestbody corpo da requisição
		return pessoasService.executeUpdate(pessoas);		
	}
	
	@DeleteMapping(value ="/consultaDelete")
	public ResponseEntity delete(@PathVariable("id") Long id){
		pessoasService.delete(id);
		
		return ResponseEntity.ok().build();
	}
}
