package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.aop.model.Account;

@Aspect  
@Component  
public class AccountAspect {

	//implementing after returning advice     
	@AfterReturning(value="execution(* com.aop.service.AccountServiceImpl.*(..))",returning="account")  
	public void afterReturningAdvice(JoinPoint joinPoint, Account account)  
	{  
		System.out.println("After Returing method:"+joinPoint.getSignature());  
		System.out.println(account);  
	} 
	
	//implementing after throwing advice      
	@AfterThrowing(value="execution(* com.aop.service.AccountServiceImpl.*(..))",throwing="ex")  
	public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex)  
	{  
		System.out.println("After Throwing exception in method:"+joinPoint.getSignature());  
		System.out.println("Exception is:"+ex.getMessage());  
	}     
}
