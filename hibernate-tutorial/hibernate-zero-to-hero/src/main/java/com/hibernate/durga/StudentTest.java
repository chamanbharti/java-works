package com.hibernate.durga;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;
import com.util.HibernateUtil;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Chaman");
		student.setLastName("Bharti");
		student.setEmail("thechaman.bharti@gmail.com");
		//student object state is transient
		
//		String hibernatePropsFilePath = "D:/hibernate-zero-to-hero/src/main/resources/hibernate.cfg.xml";
//
//		File hibernatePropsFile = new File(hibernatePropsFilePath);
//		
//		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		Session session = sessionFactory.openSession();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.save(student);
		//student object state is persistent
		
		session.beginTransaction().commit();
		//student objec will move to database
		session.evict(student);
		//student object will be removed from persistent
		//then gc can collect your student object
	}
}
