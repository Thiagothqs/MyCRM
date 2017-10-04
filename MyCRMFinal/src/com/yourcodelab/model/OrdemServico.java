package com.yourcodelab.model;

public class OrdemServico {
	private Integer id;
	private String cliente;
	private String servico;
	private String data;
	private String hora;
	private String status;
	
	public OrdemServico(String cliente, String servico, String data, String hora, String status) {
		this.cliente = cliente;
		this.servico = servico;
		this.data = data;
		this.hora = hora;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
