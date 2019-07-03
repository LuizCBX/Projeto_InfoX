package br.com.infox.dal;

import java.sql.*;

public class ConnectionModule {
	
	// Criando variáveis de apoio
	Connection con = ConnectionModule.conector(); // Conecta com o banco
	PreparedStatement pst = null; //executa
	ResultSet rs = null;// Resultado do banco

	// a classe abaixo cria um método de conexão com retorno
	public static Connection conector() {
		
		//Criando uma variavel para receber a conexão
		java.sql.Connection conexao = null;
		String driver = "com.mysql.jdbc.Driver";
		
		// variável que recebe as informações do banco. Caminho, banco, ssl
		String url = "jdbc:mysql://10.26.45.103:3306/dbinfox?useSSL=false";
		
		//autenticação
		String user = "admin";
		String password = "123@Senac";
		
		//tratamento de exceções
		try {
			Class.forName(driver);//usar o driver
			conexao = DriverManager.getConnection(url, user, password);
			return conexao;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
