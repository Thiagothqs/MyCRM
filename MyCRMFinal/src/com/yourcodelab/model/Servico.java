package com.yourcodelab.model;

public class Servico {
	private String nome;
	private String tempo;
	private String valor;
	private String descricao;
	
	public Servico(String nome, String tempo, String valor, String descricao) {
		super();
		this.nome = nome;
		this.tempo = tempo;
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public Servico() {
		
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
