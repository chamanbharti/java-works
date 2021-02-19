package com.ddl;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, 1201);
		
		System.out.println("before update");
		System.out.println(employee);
		employee.setSalary(46000);
		employee.setEname("Chaman");
		em.getTransaction().commit();
		
		System.out.println("after update");
		System.out.println(employee);
		em.close();
		emf.close();
		
	}
}
