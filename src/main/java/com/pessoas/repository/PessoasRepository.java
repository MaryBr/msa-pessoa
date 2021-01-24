package com.pessoas.repository;

import org.springframework.stereotype.Repository;

import com.pessoas.data.model.Pessoas;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas, Long>{
		
	
}
