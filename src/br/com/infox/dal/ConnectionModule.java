package br.com.infox.dal;

import java.sql.*;

public class ConnectionModule {
	
	// Criando vari�veis de apoio
	Connection con = ConnectionModule.conector(); // Conecta com o banco
	PreparedStatement pst = null; //executa
	ResultSet rs = null;// Resultado do banco

	// a classe abaixo cria um m�todo de conex�o com retorno
	public static Connection conector() {
		
		//Criando uma variavel para receber a conex�o
		java.sql.Connection conexao = null;
		String driver = "com.mysql.jdbc.Driver";
		
		// vari�vel que recebe as informa��es do banco. Caminho, banco, ssl
		String url = "jdbc:mysql://10.26.45.103:3306/dbinfox?useSSL=false";
		
		//autentica��o
		String user = "admin";
		String password = "123@Senac";
		
		//tratamento de exce��es
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
