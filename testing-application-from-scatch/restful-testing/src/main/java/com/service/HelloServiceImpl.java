package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.HelloRepository;

public class HelloServiceImpl implements HelloService{

	@Autowired
    HelloRepository helloRepository;
	
	@Override
	public String get() {
		return helloRepository.get();
	}

}
