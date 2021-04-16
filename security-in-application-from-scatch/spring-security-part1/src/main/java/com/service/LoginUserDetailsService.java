package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.model.User;
import com.repository.LoginUser;
import com.repository.UserRepository;

public class LoginUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = repo.findByUsername(username);
		User u = user.orElseThrow( () -> new UsernameNotFoundException("User Not Found"));
		return new LoginUser(u);
	}

}
