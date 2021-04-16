package com.devglan.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.devglan.model.UserDetails;

public interface UserDao extends CrudRepository<UserDetails, Long> {
	
	UserDetails findByEmail(String email);
	
}
