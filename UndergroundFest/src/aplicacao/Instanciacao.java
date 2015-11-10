package aplicacao;

import java.math.BigDecimal;
import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Banda;
import dominio.Espetaculo;
import dominio.Participacao;

public class Instanciacao {

	public static void main(String[] args) throws ParseException{
		
		Banda b1 = new Banda(null, "Scourge", new BigDecimal(3000.00));
		Banda b2 = new Banda(null, "Sarcofago", new BigDecimal(5000.00));
		Banda b3 = new Banda(null, "Gore Autopsy", new BigDecimal(1500.00));
		Banda b4 = new Banda(null, "FMI", new BigDecimal(2500.00));
		Banda b5 = new Banda(null, "Nox Spiritus", new BigDecimal(1500.00));
		
		Espetaculo e1 = new Espetaculo(null, "CrossOver And General Metal");
		Espetaculo e2 = new Espetaculo(null, "Metal Land");
		
		Participacao p1 = new Participacao(null, 3, b1, e1);
		Participacao p2 = new Participacao(null, 1, b3, e1);
		Participacao p3 = new Participacao(null, 2, b5, e1);
		
		System.out.println("Participacao 1: " + p1);
		System.out.println("Participacao 2: " + p2);
		System.out.println("Participacao 3: " + p3);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("meujpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(b4);
		em.persist(b5);
		
		em.persist(e1);
		em.persist(e2);
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();

		System.out.println("Pronto!");
		
		em.close();
		emf.close();
		
	
	}

}
