package dao;

import java.math.BigDecimal;
import java.util.List;

import dominio.Banda;

public interface BandaDao {
	
	public void inserirAtualizar(Banda x);
	public void excluir(Banda x);
	public Banda buscar(int id);
	public List<Banda> buscarTodos();
	public List<Banda> buscarBandaPorFaixaDePreco(BigDecimal preco);
}
