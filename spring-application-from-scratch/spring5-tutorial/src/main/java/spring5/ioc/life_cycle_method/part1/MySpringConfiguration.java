package spring5.ioc.life_cycle_method.part1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//https://reflectoring.io/spring-bean-lifecycle/
@Configuration
public class MySpringConfiguration {

//	@Bean
//	  public MySpringBean mySpringBean() {
//	    return new MySpringBean();
//	  }
	
/*
	 Using Attributes of the @Bean Annotation
Additionally, when we define our Spring beans we can set the initMethod 
and destroyMethod attributes of the @Bean annotation in Java configuration:
	 
*/
//	@Bean(initMethod = "postConstruct", destroyMethod = "preDestroy")
//	public MySpringBean mySpringBean() {
//	    return new MySpringBean();
//	 }
	
//	@Bean
//	public MySpringBean mySpringBean() {
//	    return new MySpringBean();
//	 }
}


