package hibernate5.simple;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hibernate5.model.Person;

public class PersonTest {

	SessionFactory factory;
	@BeforeClass
	public void setup() {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	}
	
	@Test
	public void testSavePerson() {
		try(Session session = factory.openSession()){
			Transaction tx = session.beginTransaction();
			Person person = new Person();
			person.setName("Chaman Bharti");
			session.save(person);
			tx.commit();
			session.close();
//			System.out.println("called:"+findPerson(session, person.getName()));/java.lang.IllegalStateException: Session/EntityManager is closed
//			System.out.println("called:"+findPerson(session, "Mamta"));//null
		}
	}
	public Person findPerson(Session session,String name) {
		Query<Person> query = session.createQuery("from Person p where p.name=:name",Person.class);
		query.setParameter("name", name);
		Person person = query.uniqueResult();
		return person;
	}
}
