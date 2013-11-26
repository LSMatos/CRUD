/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

// Importa as classes Aluno e AlunoBanco do pacote Modelo.
import Modelo.Aluno;
import Modelo.AlunoBanco;
// Importa a classe SQLException do pacote java.sql
import java.sql.SQLException;

public class AlunoControle {
	// Cria um metodo sem retorna para executar a função cadastrar da classe
	// AlunoBanco
	public void cadastrarAluno(Aluno A) throws SQLException,
			ClassNotFoundException {
		AlunoBanco.Insert(A);
	}

	// Cria um metodo sem retorna para executar a função atualizar da classe
	// AlunoBanco
	public void atualizarAluno(Aluno A) throws SQLException,
			ClassNotFoundException {
		AlunoBanco.Update(A);
	}

	// Cria um metodo sem retorna para executar a função excluir da classe
	// AlunoBanco
	public void excluirAluno(Aluno A) throws SQLException,
			ClassNotFoundException {
		AlunoBanco.Delete(A);
	}

}
