package com.hibernate.interview;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Address;
import com.model.Customer;
import com.model.Employee;
import com.util.HibernateUtil;

public class SavePersistSaveOrUpdateExample {
  public static void main(String[] args) {
    Session session = null;
    Transaction transaction = null;
    try {
      session = HibernateUtil.getSessionFactory().openSession();
      transaction = session.getTransaction();
      transaction.begin();

      // I
//      Customer customer = new Customer();
//      customer.setId(6l);
//      customer.setName("chaman Bharti");
//      Object obj = session.save(customer);
//      System.out.println("obj:"+obj.toString());
//      session.persist(customer);
//      session.saveOrUpdate(customer);
      //transaction.commit();
      
      // II
    //save example - without transaction
      Employee emp = getTestEmployee();
      long id = (Long)session.save(emp);
      System.out.println("1. Employee save called without transaction, id="+id);
	  session.flush(); //address will not get saved without this
	  System.out.println("*****");
	  
	  //save example - with transaction
    Employee emp1 = getTestEmployee();
    Session session2 = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction2 = session2.getTransaction();
    long id1 = (Long) session2.save(emp1);
	System.out.println("2. Employee save called with transaction, id="+id1);
	System.out.println("3. Before committing save transaction");
	transaction2.commit();
	System.out.println("4. After committing save transaction");
	System.out.println("*****");
      
    //save example - existing row in table
	Session session3 = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction3 = session2.getTransaction();
	Employee emp2 =  (Employee)session3.load(Employee.class, new Long(1));
	
	//update some data
	System.out.println("Employee Details="+emp2);
	emp2.setName("New Name");
	emp2.getAddress().setCity("New City");
	
	long id6 = (Long) session3.save(emp2);
	emp2.setName("New Name1"); // will get updated in database
	System.out.println("5. Employee save called with transaction, id="+id6);
	System.out.println("6. Before committing save transaction");
	transaction3.commit();
	System.out.println("7. After committing save transaction");
	System.out.println("*****");

    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }
      e.printStackTrace();
    } finally {
      if (session != null) {
        session.close();
      }
    }

    HibernateUtil.shutdown();
  }
  public static Employee getTestEmployee() {
		Employee emp = new Employee();
		Address add = new Address();
		emp.setName("Test Emp");
		emp.setSalary(1000);
		add.setAddressLine1("Test address1");
		add.setCity("Test City");
		add.setZipcode("12121");
		emp.setAddress(add);
		add.setEmployee(emp);
		return emp;
	}
}
