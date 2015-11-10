package servico.impl;

import java.time.LocalDateTime;
import java.util.List;

import dao.ParticipacaoDao;
import dao.DaoFactory;
import dao.jpa.EM;
import dominio.Participacao;
import servico.ParticipacaoServico;
import servico.ServicoException;

public class ParticipacaoServicoImpl implements ParticipacaoServico {
	
	private ParticipacaoDao dao;
	
	public ParticipacaoServicoImpl() {
		dao = DaoFactory.criarParticipacaoDao();
	}
	
	@Override
	public void inserirAtualizar(Participacao x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().begin();
	}

	@Override
	public void excluir(Participacao x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public Participacao buscar(int id) {
		return dao.buscar(id);
	}

	@Override
	public List<Participacao> buscarTodos() {
		return dao.buscarTodos();
	}

	@Override
	public void inserirParticipacao(Participacao x) throws ServicoException {
		// TODO Auto-generated method stub
		
	}

	public List<Participacao> buscarPorDataHorario(LocalDateTime horario) {
		// TODO Auto-generated method stub
		return null;
	}


}
