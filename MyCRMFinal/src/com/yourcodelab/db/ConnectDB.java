package com.yourcodelab.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private String driver =  "com.microsoft.sqlserver.jdbc.SQLServerDriver" ;
    private String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MyCRM";
	private String usuario = "ThiagoSouza";
	private String senha = "jugative";//jugative5
	public Connection con;
	public Connection getConexao() throws SQLException {// throws MyClassException
		try {
			Connection con;
			Class.forName(driver);
			//System.setProperty("com.microsoft.sqlserver.jdbc.SQLServerDriver", driver);
			con = DriverManager.getConnection(caminho,usuario,senha);
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			/*MyClassException obj = new MyClassException("Erro em ClassNotFoundException");
			obj.setClasse(getClass().getName());
			obj.setMensagem(e.getMessage());
			obj.setMetodo("getConexao");
			throw obj;*/
			//return null;
			System.out.println("Não deu certo");
			return null;
		}
	}
	
	/*private Connection con;
	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	// Classe de conexão com Banco de Dados
	public ConnectDB(){
		// Melhoria futura: colocar essas informações em arquivo *.properties
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/your_jdbc";
		username = "root";
		password = "";
	}
	
	public Connection getConnection() throws IOException, ClassNotFoundException, SQLException{
		Class.forName(driver) ;
		this.con = DriverManager.getConnection(url, username, password);
		
		return this.con;
	}*/
}
