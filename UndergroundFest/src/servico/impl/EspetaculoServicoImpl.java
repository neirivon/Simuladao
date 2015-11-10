package servico.impl;

import java.time.LocalDateTime;
import java.util.List;

import dao.EspetaculoDao;
import dao.DaoFactory;
import dao.jpa.EM;
import dominio.Espetaculo;
import servico.EspetaculoServico;
import servico.ServicoException;

public class EspetaculoServicoImpl implements EspetaculoServico {
	
	private EspetaculoDao dao;
	
	public EspetaculoServicoImpl() {
		dao = DaoFactory.criarEspetaculoDao();
	}
	
	@Override
	public void inserirAtualizar(Espetaculo x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().begin();
	}

	@Override
	public void excluir(Espetaculo x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public Espetaculo buscar(int id) {
		return dao.buscar(id);
	}

	@Override
	public List<Espetaculo> buscarTodos() {
		return dao.buscarTodos();
	}

	@Override
	public void inserirEspetaculo(Espetaculo x) throws ServicoException {
		// TODO Auto-generated method stub
		
	}

	public List<Espetaculo> buscarPorDataHorario(LocalDateTime horario) {
		// TODO Auto-generated method stub
		return null;
	}


}
