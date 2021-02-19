package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.model.User;
import com.repository.LoginUser;
import com.repository.UserRepository;

public class LoginUserServiceDetails implements UserDetailsService{

	@Autowired
	UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = repo.findByUsername(username);
		System.out.println( "User:"+user);
		User user2 = user.orElseThrow( ()-> new UsernameNotFoundException("User not found"));
		return  new LoginUser(user2);
	}

}
