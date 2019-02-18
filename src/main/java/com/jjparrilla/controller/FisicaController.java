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

import com.jjparrilla.model.Fisica;
import com.jjparrilla.repository.FisicaRepository;

@RestController
@RequestMapping(value="/api")
public class FisicaController {
	
	@Autowired
	private FisicaRepository fisicasRepository;
	
	@GetMapping("/fisicas")
	public List<Fisica> listaFisicas(){
		return fisicasRepository.findAll();
	}
	
	@GetMapping("/fisica/{id}")
	public Fisica listaFisicasEspecifica(@PathVariable(value="id") long id){
		return fisicasRepository.findById(id);
	}
	
	@PostMapping("/fisica")
	public Fisica salvaFisica(@RequestBody Fisica fisica) {
		return fisicasRepository.save(fisica);
	}
	
	@DeleteMapping("/fisicas")
	public void deletaFisica(@RequestBody Fisica fisica) {
		fisicasRepository.delete(fisica);
	}
	
	@PutMapping("/fisica")
	public Fisica atualizaFisica(@RequestBody Fisica fisica) {
		return fisicasRepository.save(fisica);
	}

}
