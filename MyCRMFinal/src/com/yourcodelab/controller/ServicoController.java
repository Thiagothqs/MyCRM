package com.yourcodelab.controller;

import java.io.IOException;
import java.security.Provider.Service;
import java.sql.SQLException;
import java.util.List;

import com.yourcodelab.dao.ServicoDAO;
import com.yourcodelab.model.OrdemServico;
import com.yourcodelab.model.Servico;

public class ServicoController {
	private ServicoDAO dao = new ServicoDAO();
	
	public void inserir(Servico servico) throws ClassNotFoundException, IOException, SQLException {
		if(servico != null) {
			dao.inserir(servico);
		}
	}
	
	public List<Servico> listaServico() throws ClassNotFoundException, IOException, SQLException{
		List<Servico> listaServico = null;
		listaServico = dao.listaServico();
		return listaServico;
	}
	
	public void ordemServico(OrdemServico os) throws ClassNotFoundException, IOException, SQLException {
		if(os != null) {
			dao.ordemServico(os);
		}
	}
}
