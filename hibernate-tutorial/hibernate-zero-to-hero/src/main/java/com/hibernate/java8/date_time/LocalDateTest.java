package com.hibernate.java8.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.model.Emp;
import com.util.HibernateUtil;

public class LocalDateTest {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Emp e = new Emp();
		e.setDate(LocalDate.now());
		e.setDateTime(LocalDateTime.now());
		e.setDuration(Duration.ofDays(2));
		session.save(e);
		session.getTransaction().commit();
		// Create dynamic native queries
		Query q = session.createNativeQuery("select id,date,dateTime,duration from Emp");
		List<Object[]> authors = q.getResultList();
		for (Object[] a : authors) {
			System.out.println("id:" + a[0] + " date:" + a[1]+" dateTime:"+a[2]+"duration:"+a[3]);
		}
		
		// Parameter binding
//		Query q = session.createNamedQuery("select date,dateTime,duration from Emp where id = ?");
//		q.setParameter(1, 1);
//		Object[] a = (Object[])q.getSingleResult();
//		System.out.println(" date:" + a[0]+" dateTime:"+a[1]+"duration:"+a[2]);
		
//		Query q = session.createNamedQuery("select date,dateTime,duration from Emp where id = :id");
//		q.setParameter("id", 1);
//		Object[] a = (Object[])q.getSingleResult();
//		System.out.println(" date:" + a[0]+" dateTime:"+a[1]+"duration:"+a[2]);
		
//		Query q = em.createNamedQuery("selectAuthorValue");
//		List<Object[]> authors = q.getResultList();
//		for (Object[] a : authors) {
//		System.out.println("Author "+ a.getFirstName()+ " "+ a.getLastName()+ " wrote "+ a.getNumBooks()+ " books.");
//		}
		session.close();
		
		HibernateUtil.shutdown();
	}
}
