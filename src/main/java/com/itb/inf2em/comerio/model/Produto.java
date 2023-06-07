package com.itb.inf2em.comerio.model;

public class Produto {
	
	private Long id;
	private String nome;
	private String descricao;
	private String cofigoBarras;
	private double preco;
	
	//public: Acesso liberado para todas as classes.
	//private:acesso liberado apenas dentro da própria classe, ou seja, apenas
	//os métodos da referida classe tem acesso.
	//Métodos setter's - Atribuir dados aos atributos
	//Métodos getter's - recuperar dados dos atributo 
	public void setId (Long id) {
		this.id = id;
	}
	public long getid() {
		return id;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setDescricao () {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getCofigoBarras() {
		return cofigoBarras;
	}
	public void setCofigoBarras(String cofigoBarras) {
		this.cofigoBarras = cofigoBarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Long getId() {
		return id;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}