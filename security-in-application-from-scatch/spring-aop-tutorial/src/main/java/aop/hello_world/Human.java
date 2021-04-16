package aop.hello_world;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//@Component and @Configuration are same to create object of class
//@Configuration
@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {
	//without aop
//	public void wakeup() {
//	   System.out.println("Good Morning!");
//   }
	
//	@Before("execution(public void study())")
//	public void wakeup() {
//		System.out.println("Good Morning!");
//	}
	
//	@After("execution(public void study())")
//	public void wakeup() {
//		System.out.println("Good Morning!");
//	}
	
	
//	@After("execution(public void study())")
//	public void wakeup() {
//		System.out.println("Good Morning!");
//	}
	
//	@After("execution(public void aop.hello_world.Student.study())")
//	public void wakeup() {
//		System.out.println("Good Morning!");
//	}
	
//	@After("execution(public void aop.hello_world.Employee.study())")
//	public void wakeup() {
//		System.out.println("Good Morning!");
//	}
	
	//wildcard prefix
//	@After("execution(public void study*())")
//	public void wakeup() {
//		System.out.println("Good Morning!");
//	}
	
	//wildcard prefix
//	@After("execution(public * study*())")
//	public void wakeup() {
//		System.out.println("Good Morning!");
//	}
	
	//suffix
//	@After("execution(public void *thing())")
//	public void wakeup() {
//		System.out.println("Good Morning!");
//	}
	
	//accept any return type and  method name ending with thing
//	@After("execution(public * *thing())")
//	public void wakeup() {
//		System.out.println("Good Morning!");
//	}
	
	//without point cut annotation
//	@Before("execution(public * study*())")
//	public void wakeup() {
//		System.out.println("Good Morning!");
//	}
//	@After("execution(public * study*())")
//	public void sleep() {
//		System.out.println("Good Night!");
//	}
	
	
//	@Before("myPointCuts()")
//	public void wakeup() {
//		System.out.println("Good Morning!");
//	}
//	@After("myPointCuts()")
//	public void sleep() {
//		System.out.println("Good Night!");
//	}
//	
//	//with point cut annotation
//	@Pointcut("execution(public * study*())")
//	public void myPointCuts() {
//		
//	}
	
	
	
//	@Before("myPointCuts()")
//	public void wakeup(JoinPoint j) {
//		System.out.println("Good Morning!");
//	}
//	@After("myPointCuts()")
//	public void sleep() {
//		System.out.println("Good Night!");
//	}
//	
//	//with point cut annotation
//	@Pointcut("execution(public * study*(..))")
//	public void myPointCuts() {
//		
//	}
	
	
//	@Before("myPointCuts()")
//	public void wakeup(JoinPoint j) {
////		System.out.println("Good Morning!"+j.getArgs());
////		System.out.println("Good Morning!"+j.getArgs()[0]);
////		System.out.println("Good Morning!"+j.getSignature().getName());
//		System.out.println("Good Morning!"+j.getThis().getClass().getName());
//	}
//	@After("myPointCuts()")
//	public void sleep() {
//		System.out.println("Good Night!");
//	}
//	
//	//with point cut annotation
//	@Pointcut("execution(public * study*(..))")
//	public void myPointCuts() {
//		
//	}
	
	
//	@AfterReturning(pointcut = "execution(public * study*(..))", returning = "value")
//	public void wakeup() {
//	 System.out.println("study* method return value");
//   }
	
	
	
//	@AfterReturning(pointcut = "execution(public * study*(..))", returning = "numValue")
//	public void wakeup(int numValue) {
//	 System.out.println("study* method return value="+numValue);
//   }
	
//	@AfterReturning(pointcut = "execution(public * study*(..))", returning = "numValue")
//	public void wakeup(int numValue) {
//	 System.out.println("study* method return value="+numValue);
//   }
	
	
//	@AfterThrowing(pointcut = "execution(* doOperation())", throwing = "ex")
//	public void wakeup(MyException ex) {
//		System.out.println("This is my thrown exception="+ex);
//   }
	
//	@Around("execution(int rankOfVideo(int,int))")
//	public Object aroundAdvice(ProceedingJoinPoint jp) {
////	 Object[] object = jp.getArgs();
////		return 3000;
//		
//		Object res = null;
//		try {
//			 res = jp.proceed();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		System.out.println(res);
//	 return 3000;
//   }

//	@Around("execution(int rankOfVideo(int,int))")
//	public Object aroundAdvice(ProceedingJoinPoint jp) {
//	 Object[] obj = jp.getArgs();
//	 obj[0] = Integer.parseInt(obj[0]+"") - 50;
//	 obj[1] = Integer.parseInt(obj[1]+"") - 20;
//	 Object res = null;
//		try {
//			 res = jp.proceed(obj);
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		System.out.println(res);
//	 return 3000;
//   }
	
//	@Before("execution(int rankOfVideo(int,int))")
//	public Object aroundAdvice(JoinPoint jp) {
//	 Object[] obj = jp.getArgs();
//	 System.out.println(obj);
////	 obj[0] = Integer.parseInt(obj[0]+"") - 50;
////	 obj[1] = Integer.parseInt(obj[1]+"") - 20;
////	 Object res = null;
////		try {
////			 res = jp.getArgs()
////		} catch (Throwable e) {
////			e.printStackTrace();
////		}
////		System.out.println(res);
//	 return 3000;
//   }
	
	@Before("execution(public * rankOfVideo(..))")
	public void wakeup(JoinPoint jp) {
	 System.out.println("rankOfVideo method return value="+jp.getArgs()[0]);
	 int val1 = (Integer) jp.getArgs()[1];
	 if(val1 == 650) {
		 throw new MyException("Exception");
	 }
	 System.out.println("rankOfVideo method return value="+jp.getThis());
	 System.out.println("rankOfVideo method return value="+jp.getTarget());
   }
	
}

