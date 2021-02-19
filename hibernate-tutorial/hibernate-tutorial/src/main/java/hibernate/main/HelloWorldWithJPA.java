package hibernate.main;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import hibernate.util.HibernateUtil;
import hibernate.util.JPAUtil;

public class HelloWorldWithJPA {

	public static void main(String[] args) {
		
		//Using JPA
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
		//check database version
		String sql = "select version()";
		String result = (String)entityManager.createNativeQuery(sql).getSingleResult();
		System.out.println(result);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		JPAUtil.shutdown();
	}
}
