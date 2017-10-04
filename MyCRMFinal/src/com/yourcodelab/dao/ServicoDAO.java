package com.yourcodelab.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yourcodelab.model.OrdemServico;
import com.yourcodelab.model.Servico;

public class ServicoDAO extends GenericDAO {
	private PreparedStatement ps;
	private String INSERIR = "INSERT INTO TBSERVICO(NOME, TEMPO, VALOR, DESCRICAO) VALUES (?, ?, ?, ?);";
	private String SQL_SELECT = "SELECT NOME, TEMPO, VALOR, DESCRICAO FROM TBSERVICO;";//FALTA ID
	private String ORDEMSERVICO = "INSERT INTO TBORDEMSERVICO(CLIENTE, SERVICO, DATA, HORA, STATUS) VALUES (?, ?, ?, ?, ?);";
	
	public void inserir(Servico servico) throws ClassNotFoundException, IOException, SQLException {
		openConnection();
		
		ps=connect.prepareStatement(INSERIR);
		ps.setString(1, servico.getNome());
		ps.setString(2, servico.getTempo());
		ps.setString(3, servico.getValor());
		ps.setString(4, servico.getDescricao());
		
		ps.execute();
		
		closeConnection();
	}
	
	public List<Servico> listaServico() throws ClassNotFoundException, IOException, SQLException{
		List<Servico> listaServico = new ArrayList<Servico>();
		
		openConnection();
		
		ps = connect.prepareStatement(SQL_SELECT); //FALTA ID
		
		ResultSet rs = ps.executeQuery();
		if(rs != null) {
			while(rs.next()) {
				Servico servico = new Servico(rs.getString("nome"), rs.getString("tempo"), rs.getString("valor"), rs.getString("descricao"));
				listaServico.add(servico);
			}
		}
		
		closeConnection();
		return listaServico;
	}
	
	public void ordemServico(OrdemServico os) throws ClassNotFoundException, IOException, SQLException {
		openConnection();
		
		ps = connect.prepareStatement(ORDEMSERVICO);
		ps.setString(1, os.getCliente());
		ps.setString(2, os.getServico());
		ps.setString(3, os.getData());
		ps.setString(4, os.getHora());
		ps.setString(5, os.getStatus());
		
		ps.execute();
		
		closeConnection();
	}
}
