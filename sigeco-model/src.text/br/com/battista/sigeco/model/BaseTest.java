package br.com.battista.sigeco.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SuppressWarnings("javadoc")
public class BaseTest {

	private EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("sigeco-local");

	private EntityManager entityManager;

	/**
	 * Construtor para a classe BaseTest.
	 *
	 */
	public BaseTest() {
		if (entityManager == null) {
			entityManager = emf.createEntityManager();
		}
	}

	/**
	 * @return entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

}