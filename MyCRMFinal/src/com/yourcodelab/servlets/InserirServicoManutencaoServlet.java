package com.yourcodelab.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yourcodelab.controller.ClienteController;
import com.yourcodelab.controller.ServicoController;
import com.yourcodelab.model.Cliente;
import com.yourcodelab.model.OrdemServico;
import com.yourcodelab.model.Servico;

/**
 * Servlet implementation class InserirServicoManutencaoServlet
 */
@WebServlet("/InserirServicoManutencaoServlet")
public class InserirServicoManutencaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirServicoManutencaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClienteController cc = new ClienteController();
		List<Cliente> listaClientes = cc.listarTodos();
		request.setAttribute("listaFuncao", listaClientes);
		
		ServicoController sc = new ServicoController();
		List<Servico> listaServicos;
		try {
			listaServicos = sc.listaServico();
			request.setAttribute("listaServicos", listaServicos);
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		String nextPage = "/quadrofuncionario.jsp";//     /servico/servicodemanutencao
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cliente = request.getParameter("cliente");
		String servico = request.getParameter("servico");
		String data = request.getParameter("data");
		String hora = request.getParameter("hora");
		String status = request.getParameter("status");
		
		OrdemServico os = new OrdemServico(cliente, servico, data, hora, status);
		
		ServicoController sc = new ServicoController();
		try {
			sc.ordemServico(os);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
