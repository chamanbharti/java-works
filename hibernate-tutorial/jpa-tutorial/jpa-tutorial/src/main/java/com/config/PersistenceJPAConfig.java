//package com.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//@Configuration
//@EnableTransactionManagement
//public class PersistenceJPAConfig {
//
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setUsername("root");
//		dataSource.setPassword("root");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/hibernate?createDatabaseIfNotExist=true");
//		return dataSource;
//	}
//	
//	// it is equivalent to  below code that  is used in application properties file
//	/*
//	spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
//	spring.datasource.username=root
//	spring.datasource.password=root
//	spring.datasource.url=jdbc:mysql://localhost:3306/hibernate?createDatabaseIfNotExist=true
//
//	*/
//	
//}
