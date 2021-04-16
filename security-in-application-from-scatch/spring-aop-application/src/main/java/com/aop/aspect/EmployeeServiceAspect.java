package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect  
@Component  
public class EmployeeServiceAspect {

	@Before(value = "execution(* com.aop.service.EmployeeService.*(..)) and args(empId, fname, sname)")  
	public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {  
		System.out.println("Before method:" + joinPoint.getSignature());  
		System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);  
	}  
	@After(value = "execution(* com.aop.service.EmployeeService.*(..)) and args(empId)")  
	public void afterAdvice(JoinPoint joinPoint, String empId) {  
	System.out.println("After method:" + joinPoint.getSignature());  
	System.out.println("Deleting Employee with  id - " + empId);  
	}  
}
