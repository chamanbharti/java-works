package core.ioc.annotation.Task_Execution_Scheduling.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

     public static void main(String[] args) {
    	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyTaskConfig.class);
         MyTask obj = context.getBean(MyTask.class);
         System.out.println(obj);
        // context.close();
	}
}
