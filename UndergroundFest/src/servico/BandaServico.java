package servico;

import java.math.BigDecimal;
import java.util.List;

import dominio.Banda;


public interface BandaServico {
	
	public void inserirBanda(Banda x) throws ServicoException;
	public void excluir(Banda x);
	public Banda buscar(int id);
	public List<Banda> buscarTodos();
	
	public static List<Banda> buscarBandaPorFaixaDePreco(BigDecimal precoMinimo, BigDecimal precoMaximo) {
		// TODO Auto-generated method stub
		return null;
	}
	void inserirAtualizar(Banda x);

}
