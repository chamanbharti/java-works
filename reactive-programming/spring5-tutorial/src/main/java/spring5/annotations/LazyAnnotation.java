package spring5.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
/**
By default, the Spring IoC container creates and initializes all singleton beans at time of application startup. 
We can prevent this pre-initialization of a singleton bean by using the @Lazy annotation.
The @Lazy annotation may be used on any class directly or indirectly annotated with @Component or on methods annotated with @Bean. 
In this example, we will use a Java-based configuration(using @Configuration and @Bean).
 */
@Lazy(value = true)
@Component
class FirstBean{
	
	public FirstBean() {
        System.out.println("Inside FirstBean Constuctor");
    }

    public void test() {
        System.out.println("Method of FirstBean Class");
    }
}
class SecondBean{
	
	public SecondBean() {
        System.out.println("Inside SecondBean Constuctor");
    }

    public void test() {
        System.out.println("Method of FirstBean Class");
    }
	
}
@Configuration
class LazyAnnotationConfig {
	
	//@Lazy(value = false)
//	@Bean
//	public FirstBean firstBean() {
//		return new FirstBean();
//	}
	
	@Bean
	public SecondBean secondBean() {
		return new SecondBean();
	}
}
public class LazyAnnotation {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyAnnotationConfig.class);
		//FirstBean firstBean = context.getBean(FirstBean.class);
		//firstBean.test();
		context.close();
	}
}
