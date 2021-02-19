package com.aop.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.aop.model.Account;
@Service  
public class AccountServiceImpl implements AccountService{

	//storing account detail in the HashMap  
	private static Map<String,Account> map = null;  
	static  
	{  
		map = new HashMap<>();  
		//adding account detail in the map  
		map.put("M4546779", new Account("10441117000", "Saving Account"));  
		map.put("K2434567", new Account("10863554577", "Current Account"));  
	}  
	@Override  
	public Account getAccountByCustomerId(String customerId) throws Exception  
	{  
			if(customerId ==null)  
			{  
				throw new Exception("Invalid! Customer Id");  
			}  
		Account account= null;  
		Set<Entry<String, Account>> entrySet = map.entrySet();  
		for (Entry<String, Account> entry : entrySet)   
		{  
			if(entry.getKey().equals(customerId))  
		{  
				account= entry.getValue();  
		}  
		}  
		return account;  
	}  

}
