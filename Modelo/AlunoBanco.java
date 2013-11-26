/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

// Importa as classes Connection, SQLException e Statement do pacote java.sql
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AlunoBanco {
	// Cria um metodo estatico sem retorno para cadastrar alunos no sistema
	public static void Insert(Aluno A) throws SQLException {
		try {
			// Armazena uma nova conexão com o banco de dados
			Connection conexao = Conexao.conectar();
			// Prepara a conexao para executar uma instrução SQL
			Statement state = conexao.createStatement();
			// Cria uma String para armazenar a instrução SQL a ser executada
			String sql = "insert into aluno(matricula,nomeAluno,email,sexo,RG,endereco,telefone,classe)values(null,'"
					+ A.getNome()
					+ "','"
					+ A.getEmail()
					+ "','"
					+ A.getSexo()
					+ "','"
					+ A.getRG()
					+ "','"
					+ A.getEndereco()
					+ "','"
					+ A.getTelefone() + "','" + A.getClasse() + "');";
			// Executa a conexao SQL
			state.execute(sql);
			// Fecha o state
			state.close();
			// Fecha a conexao
			conexao.close();
		} catch (SQLException se) {
			// Cria uma nova exceção de SQL caso exista um erro
			throw new SQLException("Erro ao cadastrar o aluno: "
					+ se.getMessage());
		}
	}

	// Cria um método estático sem retorno para excluir alunos do sistema
	public static void Delete(Aluno A) throws SQLException {
		try {
			Connection conexao = Conexao.conectar();
			Statement state = conexao.createStatement();
			String sql = "delete from aluno where matricula="
					+ A.getMatricula() + ";";
			state.execute(sql);
			state.close();
			conexao.close();
		} catch (SQLException se) {
			throw new SQLException("Erro ao excluir o aluno: "
					+ se.getMessage());
		}
	}

	// Cria um método estático sem retorna para atualizar alunos do sistema
	public static void Update(Aluno A) throws SQLException {
		try {
			Connection conexao = Conexao.conectar();
			Statement state = conexao.createStatement();
			String sql = "update aluno set nomeAluno='" + A.getNome()
					+ "',email='" + A.getEmail() + "',sexo='" + A.getSexo()
					+ "',RG='" + A.getRG() + "',endereco='" + A.getEndereco()
					+ "',telefone='" + A.getTelefone() + "',classe="
					+ A.getClasse() + " where RG='" + A.getRG() + "';";
			state.execute(sql);
			state.close();
			conexao.close();
		} catch (SQLException se) {
			throw new SQLException("Erro ao atualizar o aluno: "
					+ se.getMessage());
		}
	}
}
