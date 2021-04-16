package spring5.ioc.life_cycle_method.part1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
/*
@Component
public class MySpringBean {

	public void show() {
		System.out.println("hello word");
	}
}

*/

/*
Using Spring’s Interfaces
We can implement Spring’s InitializingBean interface to run custom operations in afterPropertiesSet() phase:
*/
/*
@Component
public class MySpringBean implements InitializingBean,DisposableBean{

	public void show() {
		System.out.println("hello word");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside public void afterPropertiesSet() throws Exception");
		show();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside public void destroy() throws Exception");
	}
}
*/

/*
Using JSR-250 Annotations
Spring supports the @PostConstruct and @PreDestroy annotations of the JSR-250 specification.

Therefore, we can use them to hook into the pre-initialization and destroy phases:
*/
/*
@Component
public class MySpringBean {

	public void show() {
		System.out.println("hello word");
	}

	@PostConstruct
	  public void postConstruct() {
		System.out.println("Inside postConstruct()");
	  }

	  @PreDestroy
	  public void preDestroy() {
		  System.out.println("Inside public void preDestroy()");
	  }
}
*/

/*
Using Attributes of the @Bean Annotation
Additionally, when we define our Spring beans we can set the initMethod 
and destroyMethod attributes of the @Bean annotation in Java configuration:
*/
/*
@Component
public class MySpringBean {

	public void show() {
		System.out.println("hello word");
	}

	//@PostConstruct
	  public void postConstruct() {
		System.out.println("Inside postConstruct()");
	  }

	 // @PreDestroy
	  public void preDestroy() {
		  System.out.println("Inside public void preDestroy()");
	  }
}
*/


/*

@Component
class MySpringBean implements BeanPostProcessor {

	  @Override
	  public Object postProcessBeforeInitialization(Object bean, String beanName)
	    throws BeansException {
		  System.out.println("Inside postProcessBeforeInitialization()");
	    return bean;
	  }

	  @Override
	  public Object postProcessAfterInitialization(Object bean, String beanName)
	    throws BeansException {
		  System.out.println("Inside postProcessAfterInitialization()");
	    return bean;
	  }
	  
	  public void show() {
			System.out.println("hello word");
		}

	}
*/

/*
@Component
class MySpringBean implements BeanNameAware, ApplicationContextAware {

  @Override
  public void setBeanName(String name) {
	  System.out.println("Inside setBeanName()");
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext)
    throws BeansException {
	  System.out.println("Inside setApplicationContext()");
  }
  
  public void show() {
		System.out.println("hello word");
	}

}
*/

@Component
class MySpringBean implements BeanNameAware {

  Logger logger = LoggerFactory.getLogger(MySpringBean.class);

  public void setBeanName(String name) {
    logger.info("inside "+name + " created.");
  }

  public void show() {
		System.out.println("hello word");
	}
}

