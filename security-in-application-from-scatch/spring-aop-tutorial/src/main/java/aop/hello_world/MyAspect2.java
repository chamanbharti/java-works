package aop.hello_world;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect2 {

//	@Before("execution(* *(..))")
//	public void advice() {
//		System.out.println("Advice ... MyAspect 2");
//	}
}
