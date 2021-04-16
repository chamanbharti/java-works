package com.ddl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Employee;

public class ReadEmployee {

	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
		 EntityManager em = emf.createEntityManager();
		 Employee employee = em.find(Employee.class, 12001);
		 System.out.println("Employee Details:");
		 System.out.println(employee.getEid());
		 System.out.println(employee.getEname());
		 System.out.println(employee.getDeg());
		 System.out.println(employee.getSalary());
		 em.close();
		 emf.close();
	}
}
