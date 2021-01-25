package com.pessoas.dozerConverter;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import com.pessoas.data.model.Pessoas;
import com.pessoas.data.vo.PessoasVO;
import com.pessoas.dozerConverter.mock.PessoasMock;

public class DozerConverterTest {
	
	  PessoasMock inputObject;

	    @Before
	    public void setUp() {
	        inputObject = new PessoasMock();
	    }

	    @Test
	    public void parseEntityToVOTest() {
	        PessoasVO output = dozerConverter.parseObject(inputObject.mockEntity(), PessoasVO.class);
	        Assert.assertEquals(Long.valueOf(0L), output.getId());
	        Assert.assertEquals("First Name Test0", output.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test0", output.getUltimoNome());
	        Assert.assertEquals("Addres Test0", output.getEndereco());
	        Assert.assertEquals("Male", output.getSexo());
	    }

	    @Test
	    public void parseEntityListToVOListTest() {
	        List<PessoasVO> outputList = dozerConverter.parseListObject(inputObject.mockEntityList(), PessoasVO.class);
	        PessoasVO outputZero = outputList.get(0);
	        
	        Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
	        Assert.assertEquals("First Name Test0", outputZero.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test0", outputZero.getUltimoNome());
	        Assert.assertEquals("Addres Test0", outputZero.getEndereco());
	        Assert.assertEquals("Male", outputZero.getSexo());
	        
	        PessoasVO outputSeven = outputList.get(2);
	        
	        Assert.assertEquals(Long.valueOf(7L), outputSeven.getId());
	        Assert.assertEquals("First Name Test2", outputSeven.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test2", outputSeven.getUltimoNome());
	        Assert.assertEquals("Addres Test2", outputSeven.getEndereco());
	        Assert.assertEquals("Female", outputSeven.getSexo());
	        
	        PessoasVO outputTwelve = outputList.get(3);
	        
	        Assert.assertEquals(Long.valueOf(12L), outputTwelve.getId());
	        Assert.assertEquals("First Name Test3", outputTwelve.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test3", outputTwelve.getUltimoNome());
	        Assert.assertEquals("Addres Test3", outputTwelve.getEndereco());
	        Assert.assertEquals("Male", outputTwelve.getSexo());
	    }

	    @Test
	    public void parseVOToEntityTest() {
	        Pessoas output = dozerConverter.parseObject(inputObject.mockVO(), Pessoas.class);
	        Assert.assertEquals(Long.valueOf(0L), output.getId());
	        Assert.assertEquals("First Name Test0", output.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test0", output.getUltimoNome());
	        Assert.assertEquals("Addres Test0", output.getEndereco());
	        Assert.assertEquals("Male", output.getSexo());
	    }

	    @Test
	    public void parserVOListToEntityListTest() {
	        List<Pessoas> outputList = dozerConverter.parseListObject(inputObject.mockVOList(), Pessoas.class);
	        Pessoas outputZero = outputList.get(0);
	        
	        Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
	        Assert.assertEquals("First Name Test0", outputZero.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test0", outputZero.getUltimoNome());
	        Assert.assertEquals("Addres Test0", outputZero.getEndereco());
	        Assert.assertEquals("Male", outputZero.getSexo());
	        
	        Pessoas outputSeven = outputList.get(2);
	        
	        Assert.assertEquals(Long.valueOf(7L), outputSeven.getId());
	        Assert.assertEquals("First Name Test2", outputSeven.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test2", outputSeven.getUltimoNome());
	        Assert.assertEquals("Addres Test2", outputSeven.getEndereco());
	        Assert.assertEquals("Female", outputSeven.getSexo());
	        
	       
	    }

}
