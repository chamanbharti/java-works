package hibernate;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import hibernate.util.HibernateUtil;

public class HelloWorld {

	public static void main(String[] args) {
		
		//Using Hibernate
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		//check database version
		String  sql = "select version()";
		String result = (String)session.createNativeQuery(sql).getSingleResult();
		System.out.println(result);
		
		session.getTransaction().commit();
		session.close();
		
		HibernateUtil.shutdown();
		
		//Using JPA
//		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
//		entityManager.getTransaction().begin();
//		
//		//check database version
//		String sql = "select version()";
//		String result = (String)entityManager.createNativeQuery(sql).getSingleResult();
//		System.out.println(result);
//		
//		entityManager.getTransaction().commit();
//		entityManager.close();
//		
//		JPAUtil.shutdown();
	}
}
