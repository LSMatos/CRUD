/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

// Importa as classes Connection, SQLException e Statement e ResultSet do pacote java.sql
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// // Importa a classe ArrayList do pacote java.util
import java.util.ArrayList;

public class LoginBanco {
	public static ArrayList<Login> buscarLogin() throws SQLException {
		ArrayList<Login> LAUX = new ArrayList<Login>();
		try {
			// Armazena uma nova conexão com o banco de dados
			Connection conexao = Conexao.conectar();
			// Prepara a conexao para executar uma instrução SQL
			Statement state = conexao.createStatement();
			// Cria uma String para armazenar a instrução SQL a ser executada
			String sql = "select * from login";
			// Executa a ação SQL e armazena o retorno no ResultSet
			ResultSet rs = state.executeQuery(sql);
			// Enquanto existirem resultados retornado, cria novos objetos Login
			// e seta as informações em seus atributos
			while (rs.next()) {
				Login l = new Login();
				l.setLogin(rs.getString("login"));
				l.setSenha(rs.getString("senha"));
				// Adiciona o objeto Login ao ArrayList
				LAUX.add(l);
			}
		} catch (SQLException se) {
			// Cria uma nova exce�ao de SQL caso exista um erro
			throw new SQLException("Erro ao localizar os dados: "
					+ se.getMessage());
		} finally {
			// Retorna o ArrayList
			return LAUX;
		}
	}
}
