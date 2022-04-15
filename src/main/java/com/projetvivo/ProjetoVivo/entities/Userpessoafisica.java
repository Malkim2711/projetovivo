package com.projetvivo.ProjetoVivo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_userpessoafisica")
public class Userpessoafisica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String nome;
	private Long cpf;
	private String email; 
	private String password;
	private String endereco;
	private Long numendereco;
	private String bairro;
	private String cidade;
	private String estado;
	private Long ddd; 
	private Long telefone; 
	
	


	public Userpessoafisica () {
	
	}


	public Long getNumendereco() {
		return numendereco;
	}


	public void setNumendereco(Long numendereco) {
		this.numendereco = numendereco;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	public Long getTelefone() {
		return telefone;
	}


	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}


	public Long getCpf() {
		return cpf;
	}


	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

	public Long getDdd() {
		return ddd;
	}


	public void setDdd(Long ddd) {
		this.ddd = ddd;
	}


	public List<Userpessoafisica> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
