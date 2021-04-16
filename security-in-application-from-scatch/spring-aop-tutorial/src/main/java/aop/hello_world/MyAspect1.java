package aop.hello_world;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect1 {

//	@Before("execution(* sum(..))")
//	public void abc() {
//		System.out.println("abc ... MyAspect 1");
//	}
//	
//	@Before("execution(* sum(..))")
//	public void a() {
//		System.out.println("a ... MyAspect 1");
//	}
}
