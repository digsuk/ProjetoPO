/*---------------------------------------------
 * Autor: Jonathan Moura
 * Data: 14/05/2018
 *---------------------------------------------
 * Descri��o: Classe de cadastro de 
 * 			  funcion�rio.
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/

package negocio;

import java.sql.ResultSet;

import entidades.Funcionario;
import excecoes.CPFNaoEncontradoException;
import interfaces.IRepositorioFuncionario;

public class CadastroFuncionario {
	private IRepositorioFuncionario repositorio;
	
	public CadastroFuncionario(IRepositorioFuncionario repositorio){
		this.repositorio = repositorio;
	}
	
	public void inserir(Funcionario funcionario){
		repositorio.inserir(funcionario);
	}
	public Funcionario procurar(String identificador) throws CPFNaoEncontradoException{
		return repositorio.procurar(identificador);
	}
	public void remover(String identificador){
		repositorio.remover(identificador);
	}
	public void atualizar(Funcionario funcionario){
		repositorio.atualizar(funcionario);
	}
	public ResultSet listar(){
		return repositorio.listar();
	}
	public ResultSet listar(String identificador){
		return repositorio.listar(identificador);
	}
	
}