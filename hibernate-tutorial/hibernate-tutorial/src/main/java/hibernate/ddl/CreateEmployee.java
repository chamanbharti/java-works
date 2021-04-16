package hibernate.ddl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.model.Employee;
import hibernate.util.HibernateUtil;


public class CreateEmployee {

	public static void main( String[ ] args ) {
		   
		Session session = null;
		Transaction tx = null;
		try {
			 session = HibernateUtil.getSessionFactory().openSession();
			 tx = session.beginTransaction();
			 //tx.begin();
			 
			  Employee employee = new Employee(); 
		      //employee.setEid( 1202 );
		      employee.setEname( "Chamand Bharti" );
		      employee.setSalary( 25000 );
		      employee.setDeg( "Software Developer" );
		      
		    Integer i =  (Integer) session.save(employee);
		    System.out.println(i);
		     // session.persist(employee);
		     // session.saveOrUpdate(employee);
		      tx.commit();
			 
		} catch (Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		//HibernateUtil.getSessionFactory().close();
		/**
		 * create-drop:- create the schema with destroying the data previously present(if there). 
		 * It also drop the database schema when the SessionFactory is closed.
		 */
		HibernateUtil.shutdown();
	   }
}
