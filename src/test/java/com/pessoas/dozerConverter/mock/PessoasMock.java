package com.pessoas.dozerConverter.mock;

import java.util.ArrayList;
import java.util.List;

import com.pessoas.data.model.Pessoas;
import com.pessoas.data.vo.PessoasVO;

public class PessoasMock {
	
	 public Pessoas mockEntity() {
	    	return mockEntity(0);
	    }
	    
	    public PessoasVO mockVO() {
	    	return mockVO(0);
	    }
	    
	    public List<Pessoas> mockEntityList() {
	        List<Pessoas> pessoas = new ArrayList<Pessoas>();
	        for (int i = 0; i < 5; i++) {
	            pessoas.add(mockEntity(i));
	        }
	        return pessoas;
	    }

	    public List<PessoasVO> mockVOList() {
	        List<PessoasVO> pessoasVO = new ArrayList<>();
	        for (int i = 0; i < 5; i++) {
	            pessoasVO.add(mockVO(i));
	        }
	        return pessoasVO;
	    }
	    
	    private Pessoas mockEntity(Integer numero) {
	    	Pessoas pessoas = new Pessoas();
	    	pessoas.setEndereco("Endereco Teste" + numero);
	    	pessoas.setPrimeiroNome("Primeiro nome teste" + numero);
	    	pessoas.setSexo(((numero % 2)==0) ? "Masculino" : "Feminino");
	    	pessoas.setId(numero.longValue());
	    	pessoas.setUltimoNome("Ultimo nome teste" + numero);
	        return pessoas;
	    }

	    private PessoasVO mockVO(Integer numero) {
	    	PessoasVO pessoasVO = new PessoasVO();
	    	pessoasVO.setEndereco("Endereco Teste" + numero);
	        pessoasVO.setPrimeiroNome("Primeiro nome teste" + numero);
	        pessoasVO.setSexo(((numero % 2)==0) ? "Masculino" : "Feminino");
	        pessoasVO.setId(numero.longValue());
	        pessoasVO.setUltimoNome("Ultimo nome teste" + numero);
	        return pessoasVO;
	    }

}
