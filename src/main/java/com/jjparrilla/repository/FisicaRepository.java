package com.jjparrilla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jjparrilla.model.Fisica;

public interface FisicaRepository extends JpaRepository<Fisica, Long> {
	
	Fisica findById(long id);

}
