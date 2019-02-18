package com.jjparrilla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jjparrilla.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {
	
	Conta findById(long id);

}
