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

import com.jjparrilla.model.Conta;
import com.jjparrilla.repository.ContaRepository;

@RestController
@RequestMapping(value="/api")
public class ContaController {
	
	@Autowired
	private ContaRepository contasRepository;
		
	@GetMapping("/contas")
	public List<Conta> listaContas(){
		return contasRepository.findAll();
	}
	
	@GetMapping("/conta/{id}")
	public Conta listaContasEspecifico(@PathVariable(value="id") long id){
		return contasRepository.findById(id);
	}
	
	@PostMapping("/conta")
	public Conta salvaConta(@RequestBody Conta conta) {
		return contasRepository.save(conta);
	}
	
	@DeleteMapping("/conta")
	public void deletaConta(@RequestBody Conta conta) {
		contasRepository.delete(conta);
	}
	
	@PutMapping("/conta")
	public Conta atualizaConta(@RequestBody Conta conta) {
		return contasRepository.save(conta);
	}

}
