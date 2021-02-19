package com.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.model.Address;
import com.model.Customer;
import com.model.Emp;
import com.model.Employee;
import com.model.Student;

public class HibernateUtil {

	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			try {
				
				//I
				 //create registry
//				registry = new StandardServiceRegistryBuilder().configure().build();
//				//create MetadataSources
//				MetadataSources sources = new MetadataSources(registry);
//				//create metadata
//				Metadata metadata = sources.getMetadataBuilder().build();
//				//create SessionFactory
//				sessionFactory = metadata.getSessionFactoryBuilder().build();
				
				// II
				// Create registry
//                registry = new StandardServiceRegistryBuilder().configure().build();
//                // Create MetadataSources
//                MetadataSources sources = new MetadataSources(registry);
//                // Create Metadata
//                Metadata metadata = sources.getMetadataBuilder().build();
//                // Create SessionFactory
//                sessionFactory = metadata.getSessionFactoryBuilder().build();
			
			//III it is working
			Configuration configuration = new Configuration();
//            // Hibernate settings equivalent to hibernate.cfg.xml's properties
            Properties settings = new Properties();
            settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate?useSSL=false");
            settings.put(Environment.USER, "root");
            settings.put(Environment.PASS, "root");
            settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
            settings.put(Environment.SHOW_SQL, "true");
            settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            settings.put(Environment.HBM2DDL_AUTO, "update");
            configuration.setProperties(settings);
           // configuration.addResource("student.hbm.xml");
          //  configuration.addAnnotatedClass(Customer.class);
         //   configuration.addAnnotatedClass(Student.class);
            
           // configuration.addAnnotatedClass(Employee.class);
           // configuration.addAnnotatedClass(Address.class);
            configuration.addAnnotatedClass(Emp.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				
				
				 //I
				
				 // Create registry
//				registry = new StandardServiceRegistryBuilder().configure().build();
//				
//				// Create MetadataSources
//				MetadataSources sources = new  MetadataSources(registry);
//				
//				// Create Metadata
//				Metadata metadata = sources.getMetadataBuilder().build();
//				
//				// Create SessionFactory
//				sessionFactory = metadata.getSessionFactoryBuilder().build();
				
				//II
				 // Create registry builder
//				StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
//				
//				// Hibernate settings equivalent to hibernate.cfg.xml's properties
//				Map<String, String>settings = new HashMap<>();
//				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
//				settings.put(Environment.USER, "root");
//				settings.put(Environment.PASS, "root");
//				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
//				
//				//apply settings
//				registryBuilder.applySettings(settings);
//				
//				//create registry
//				registry = registryBuilder.build();
//				
//				// Create MetadataSources
//				MetadataSources sources = new  MetadataSources(registry);
//				
//				// Create Metadata
//				Metadata metadata = sources.getMetadataBuilder().build();
//				
//				// Create SessionFactory
//				sessionFactory = metadata.getSessionFactoryBuilder().build();
				
		}catch (Exception e) {
			e.printStackTrace();
			if(registry != null) {
				StandardServiceRegistryBuilder.destroy(registry);
			}
		}
	}
	return sessionFactory;
 }
	public static void shutdown() {
		if(registry !=null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
}
