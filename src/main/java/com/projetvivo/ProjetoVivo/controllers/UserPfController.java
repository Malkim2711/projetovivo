package com.projetvivo.ProjetoVivo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.projetvivo.ProjetoVivo.entities.Userpessoafisica;
import com.projetvivo.ProjetoVivo.repositories.UserPessoaFisicaRepository;


@RestController
@RequestMapping(value = "/usersfisica")
public class UserPfController {

	@Autowired
	private UserPessoaFisicaRepository repository;
	
	@GetMapping
	public List<Userpessoafisica> findAll() {
		return repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Userpessoafisica findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Userpessoafisica insert(@RequestBody Userpessoafisica user) {
		return repository.save(user);
	}
	
	
	
	}
		
	


