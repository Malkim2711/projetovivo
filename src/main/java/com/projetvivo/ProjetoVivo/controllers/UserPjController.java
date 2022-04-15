package com.projetvivo.ProjetoVivo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetvivo.ProjetoVivo.entities.Userpessoajuridica;
import com.projetvivo.ProjetoVivo.repositories.UserPessoaJuridicaRepository;


@RestController
@RequestMapping(value = "/usersjuridica")
public class UserPjController {

	@Autowired
	private UserPessoaJuridicaRepository repository;
	
	@GetMapping
	public List<Userpessoajuridica> findAll() {
		return repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Userpessoajuridica findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Userpessoajuridica insert(@RequestBody Userpessoajuridica user) {
		return repository.save(user);
	}
}

