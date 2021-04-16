package com.util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateUtil2 {

	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			try {
				 //create registry builder
				StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
				
				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Map<String, String>settings = new HashMap<>();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "root");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
				
				settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                settings.put(Environment.HBM2DDL_AUTO, "create-drop");
				
				//apply settings
				registryBuilder.applySettings(settings);
				
				//create registry
				registry = registryBuilder.build();
				
				//create MetadataSources
				MetadataSources sources = new MetadataSources(registry);
				
				//create Metadata
				Metadata metadata = sources.getMetadataBuilder().build();
				
				//create SessionFactory
				sessionFactory = metadata.getSessionFactoryBuilder().build();
				
				
			} catch (Exception e) {
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
