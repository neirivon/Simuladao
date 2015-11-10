package dao;

import java.util.List;
import dominio.Espetaculo;

public interface EspetaculoDao {

	public void inserirAtualizar(Espetaculo x);
	public void excluir(Espetaculo x);
	public Espetaculo buscar(int id);
	public List<Espetaculo> buscarTodos();
}
