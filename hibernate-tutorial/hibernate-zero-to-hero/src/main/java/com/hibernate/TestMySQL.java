package com.hibernate;

import org.hibernate.Session;

import com.util.HibernateUtil;
import com.util.HibernateUtil2;

public class TestMySQL {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		//Session session = HibernateUtil2.getSessionFactory().openSession();
		session.beginTransaction();
		
		//check database version
		String sql = "select version()";
		String result = (String)session.createNativeQuery(sql).getSingleResult();
		System.out.println("mysql version:"+result);
		
		session.getTransaction().commit();
		session.close();
		
		HibernateUtil.shutdown();
	}
}
