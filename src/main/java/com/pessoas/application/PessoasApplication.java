package com.pessoas.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.pessoas.controller", "com.pessoas.service"})
@SpringBootApplication
public class PessoasApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(PessoasApplication.class, args);
		System.out.println("Microservico pessoas está iniciado.");
	}

}
