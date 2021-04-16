package hibernate.ddl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hibernate.model.Employee;


public class CreateEmployeeWithJPA {

	public static void main( String[ ] args ) {
		   // JPA
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPADemo");
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      
	      Employee employee = new Employee(); 
	      //employee.setEid( 1202 );
	      employee.setEname( "Sahil Bharti" );
	      employee.setSalary( 25000 );
	      employee.setDeg( "Software Developer" );
	      
	      entitymanager.persist(employee);
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
		
	   }
}
