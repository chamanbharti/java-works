package spring5.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

class CustomerBo {

    public void printMsg(String msg) {

        System.out.println("CustomerBo : " + msg);
    }

}

class SchedulerBo {

    public void printMsg(String msg) {

        System.out.println("SchedulerBo : " + msg);
    }

}

@Configuration
class CustomerConfig {
    
    @Bean(name="customer")
    public CustomerBo customerBo(){
        
        return new CustomerBo();
        
    }
}

@Configuration
class SchedulerConfig {
    
    @Bean(name="scheduler")
    public SchedulerBo suchedulerBo(){
        
        return new SchedulerBo();
        
    }
    
}

//Use @Import to load multiple configuration files.
@Configuration
@Import({ CustomerConfig.class, SchedulerConfig.class })
class AppConfig {

}
/**
Normally, you will split a large Spring XML bean files into multiple small files, group by module or category, to make things more maintainable and modular. For example,

<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
 
    <import resource="config/customer.xml"/>
    <import resource="config/scheduler.xml"/>
 
</beans>
In Spring3 JavaConfig, the equivalent functionality is @Import.



import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ CustomerConfig.class, SchedulerConfig.class })
public class AppConfig {

}
 */
public class ImportAnnotation {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	    CustomerBo customer = (CustomerBo) context.getBean("customer");
	    customer.printMsg("Hello 1");

	    SchedulerBo scheduler = (SchedulerBo) context.getBean("scheduler");
	    scheduler.printMsg("Hello 2");
	}
}
