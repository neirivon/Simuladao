package servico;

import java.util.List;

import dominio.Espetaculo;

public interface EspetaculoServico {
	
	public void inserirEspetaculo(Espetaculo x) throws ServicoException;
	public void excluir(Espetaculo x);
	public Espetaculo buscar(int id);
	public List<Espetaculo> buscarTodos();
	
	public static List<Espetaculo> buscarEspetaculoPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	void inserirAtualizar(Espetaculo x);

}
