package core.ioc.annotation.Task_Execution_Scheduling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

     public static void main(String[] args) {
    	 
//    	 ApplicationContext context = new ClassPathXmlApplicationContext("core/schedule/beans.xml");
//         MyTask obj = (MyTask) context.getBean("myTask");
//         System.out.println(obj);
//         obj.work();
        // context.close();
    	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyTaskConfig.class);
         MyTask obj = context.getBean(MyTask.class);
         System.out.println(obj);
        // context.close();
	}
}
