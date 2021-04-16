package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.service.LoginUserDetailsService;

@Configuration
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailsService() {
//		InMemoryUserDetailsManager userDetails = new InMemoryUserDetailsManager();
//		UserDetails user = User.withUsername("chaman")
////		var userDetails = new InMemoryUserDetailsManager();
////		var user = User.withUsername("chaman")
//		.password("123")
//		.authorities("read")
//		.build();
//		userDetails.createUser(user);
//		return userDetails;
		
		return new LoginUserDetailsService();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
