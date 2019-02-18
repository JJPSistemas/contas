package com.jjparrilla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjparrilla.model.Juridica;
import com.jjparrilla.repository.JuridicaRepository;

@RestController
@RequestMapping(value="/api")
public class JuridicaController {
	
	@Autowired
	private JuridicaRepository juridicasRepository;
	
	@GetMapping("/juridicas")
	public List<Juridica> listaJuridicas(){
		return juridicasRepository.findAll();
	}
	
	@GetMapping("/juridica/{id}")
	public Juridica listaJuridicasEspecifica(@PathVariable(value="id") long id){
		return juridicasRepository.findById(id);
	}
	
	@PostMapping("/juridica")
	public Juridica salvaJuridica(@RequestBody Juridica juridica) {
		return juridicasRepository.save(juridica);
	}
	
	@DeleteMapping("/juridica")
	public void deletaJuridica(@RequestBody Juridica juridica) {
		juridicasRepository.delete(juridica);
	}
	
	@PutMapping("/juridica")
	public Juridica atualizaJuridica(@RequestBody Juridica juridica) {
		return juridicasRepository.save(juridica);
	}

}
