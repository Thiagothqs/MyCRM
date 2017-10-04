package com.yourcodelab.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yourcodelab.controller.ServicoController;
import com.yourcodelab.model.Servico;

/**
 * Servlet implementation class InserirServicoServlet
 */
@WebServlet("/InserirServicoServlet")
public class InserirServicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirServicoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServicoController control = new ServicoController();
		
		String nome = request.getParameter("nome");
		String tempo = request.getParameter("tempo");
		String valor = request.getParameter("valor");
		String descricao = request.getParameter("descricao");
		
		Servico servico=new Servico(nome, tempo, valor, descricao);
		
		try {
			control.inserir(servico);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
