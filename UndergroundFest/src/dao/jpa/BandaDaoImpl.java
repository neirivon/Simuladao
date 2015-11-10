package dao.jpa;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.BandaDao;
import dominio.Banda;

public class BandaDaoImpl implements BandaDao {
	
	private EntityManager em;
	
	public BandaDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Banda x) {
		if (x.getCodBanda() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}

	@Override
	public void excluir(Banda x) {
		x = em.merge(x);
		em.remove(x);
	}

	@Override
	public Banda buscar(int codBanda) {
		return em.find(Banda.class, codBanda);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Banda> buscarTodos() {
		String jpql = "SELECT x FROM Banda x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Banda> buscarBandaPorFaixaDePreco(BigDecimal preco) {
		String jpql = "SELECT x FROM Banda x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
