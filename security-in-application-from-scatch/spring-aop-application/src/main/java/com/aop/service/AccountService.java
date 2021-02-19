package com.aop.service;

import com.aop.model.Account;

public interface AccountService {

	public abstract Account getAccountByCustomerId(String customerId)  
			throws Exception; 
}
