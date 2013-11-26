/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

// Import off class Connection, SQLException e DriverManager off package java.sql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	// Cria tres Strings staticas e finais para armazenar o endereçoo do banco e
	// seu usuario e senha
	private static final String URL = "jdbc:postgresql://localhost:5432/Put the name of your bank here";
	private static final String USER = "";
	private static final String Password = " ";

	// Cria uma metodo estatico com retorno Connection para cria uma nova
	// conexao com o banco de dados
	public static Connection conectar() throws SQLException {
		try {
			// Retorna uma nova conexao
			return DriverManager.getConnection(URL, USER, Password);
		} catch (SQLException se) {
			// Cria uma nova exceção de SQL caso exista um erro
			throw new SQLException("Erro ao conectar o banco de dados: "
					+ se.getMessage());
		}
	}
}
