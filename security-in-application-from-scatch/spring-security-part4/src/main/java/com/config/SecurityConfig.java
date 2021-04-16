package com.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;



@Configuration
public class SecurityConfig  //extends WebSecurityConfigurerAdapter
{

	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager userDetails = new InMemoryUserDetailsManager();
		UserDetails user = User.withUsername("chaman")
//		var userDetails = new InMemoryUserDetailsManager();
//		var user = User.withUsername("chaman")
		.password("123")
		.authorities("read")
		.build();
		userDetails.createUser(user);
		return userDetails;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		return new LoginUserServiceDetails();
//	}
	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		return new JdbcUserDetailsManager(dataSource());
//	}
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Bean
//	public DataSource dataSource() {
//		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/spring_security", "root", "root");
//	}
//	
//	@Override
//		protected void configure(HttpSecurity http) throws Exception {
//			http.csrf().disable();
//			http.authorizeRequests().mvcMatchers("/createUser")
//			.permitAll()
//			.anyRequest()
//			.authenticated();
//		}
}
