package com.pessoas.dozerConverter;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class dozerConverter {

	public static Mapper mapper= DozerBeanMapperBuilder.buildDefault();
	
	public static <O,D> D parseObject(O origin, Class<D> destination) {
		return mapper.map(origin, destination);
		
	}
	
	
	public static <O,D> List <D> parseListObject(List<O> origin, Class<D> destination) {
		List<D> destinationObjects = new ArrayList<D>();
		
		for(Object O : origin) 
		{
			destinationObjects.add(mapper.map(O, destination));		
		}
		return destinationObjects;
		
	}
}
