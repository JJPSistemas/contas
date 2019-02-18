package com.jjparrilla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jjparrilla.model.Juridica;

public interface JuridicaRepository extends JpaRepository<Juridica, Long> {
	
    Juridica findById(long id);

}
