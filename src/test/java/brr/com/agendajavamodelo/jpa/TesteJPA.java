package brr.com.agendajavamodelo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.agendajavamodelo.domain.Usuario;

public class TesteJPA {
	private static EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setNome("Luciano Brito");

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("agendajavamodelo");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(usuario);
			entityManager.getTransaction().commit();
			System.out.println("successfull");
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}