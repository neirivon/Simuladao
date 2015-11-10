package servico.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import dao.BandaDao;
import dao.DaoFactory;
import dao.jpa.EM;
import dominio.Banda;
import servico.BandaServico;
import servico.ServicoException;

public class BandaServicoImpl implements BandaServico {
	
	private BandaDao dao;
	
	public BandaServicoImpl() {
		dao = DaoFactory.criarBandaDao();
	}
	
	@Override
	public void inserirAtualizar(Banda x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().begin();
	}

	@Override
	public void excluir(Banda x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public Banda buscar(int id) {
		return dao.buscar(id);
	}

	@Override
	public List<Banda> buscarTodos() {
		return dao.buscarTodos();
	}

	@Override
	public void inserirBanda(Banda x) throws ServicoException {
		// TODO Auto-generated method stub
		
	}

	public List<Banda> buscarBandaPorFaixaDePreco(BigDecimal preco) {
		// TODO Auto-generated method stub
		return null;
	}

}
