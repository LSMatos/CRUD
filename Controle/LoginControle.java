/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

// Importa as classes Login e LoginBanco do pacote Modelo.
import Modelo.Login;
import Modelo.LoginBanco;
// Importa a classe SQLException do pacote java.sql
import java.sql.SQLException;
// Importa a classe ArrayList do pacote java.util
import java.util.ArrayList;

public class LoginControle {
	// Cria um metodo com retorno ArrayList para executar a função buscarLogin
	// da classe LoginBanco
	public ArrayList<Login> buscarLoginSenha() throws SQLException,
			ClassNotFoundException {
		return LoginBanco.buscarLogin();
	}
}
