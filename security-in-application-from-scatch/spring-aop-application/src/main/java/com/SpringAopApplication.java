package com;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.aop.model.Account;
import com.aop.service.AccountService;
import com.aop.service.AccountServiceImpl;
import com.aop.service.BankService;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
		//ConfigurableApplicationContext context = SpringApplication.run(SpringAopApplication.class, args);

		// Fetching the employee object from the application context.  
//		BankService bank = context.getBean(BankService.class);  
//		// Displaying balance in the account  
//		String accnumber = "12345";  
//		bank.displayBalance(accnumber);  
//		// Closing the context object  
//		context.close();  
	
		//@AfterReturning
		//Fetching the account object from the application context  
//		AccountService accountService = context.getBean("accountServiceImpl", AccountServiceImpl.class);  
//		Account account;  
//		try   
//		{  
//			account = accountService.getAccountByCustomerId("K2434567");  
//			if(account != null)  
//				System.out.println(account.getAccountNumber()+"\t"+account.getAccountType());  
//			}   
//			catch (Exception e)   
//			{  
//				System.out.println(e.getMessage());  
//			}  
//		}  
	
	//@AfterThrowing
//		AccountService accountService = context.getBean("accountServiceImpl", AccountServiceImpl.class);
//		Account account;  
//		try   
//		{  
//			//generating exception  
//			//account = accountService.getAccountByCustomerId(null);  
//			account = accountService.getAccountByCustomerId("K2434567"); 
//			if(account != null)  
//				System.out.println(account.getAccountNumber()+"\t"+account.getAccountType());  
//			}   
//			catch (Exception e)   
//			{  
//				System.out.println(e.getMessage());  
//				e.printStackTrace();  
//			}  
	} 
}
