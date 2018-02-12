package br.com.treinaweb.jee.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Karen 12 de fev de 2018
 */
public class ConexaoUtils {

	public static Connection criarConexao()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		System.out.println("Criando conexão-");
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String stringConexao = "jdbc:mysql://127.0.0.1:3306/tw_java_intermediario?user=root";
		Connection conn = DriverManager.getConnection(stringConexao);
		return conn;
	}

	public static void fecharConexao(Connection conn) throws SQLException {
		if (conn != null)
			conn.close();
	}

}
