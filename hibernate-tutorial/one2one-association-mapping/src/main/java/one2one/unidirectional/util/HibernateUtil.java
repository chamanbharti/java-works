package one2one.unidirectional.util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	public  static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			try {
				 //I
				
				 // Create registry
				registry = new StandardServiceRegistryBuilder().configure().build();
				
				// Create MetadataSources
				MetadataSources sources = new  MetadataSources(registry);
				
				// Create Metadata
				Metadata metadata = sources.getMetadataBuilder().build();
				
				// Create SessionFactory
				sessionFactory = metadata.getSessionFactoryBuilder().build();
//				
//				//II
//				 // Create registry builder
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
//				
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
		if(registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
}
