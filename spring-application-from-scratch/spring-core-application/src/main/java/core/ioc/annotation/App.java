package core.ioc.annotation;
//https://springframework.guru/spring-framework-annotations/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
        /*
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.setMessage("Hello World using java configuration!");
        obj.getMessage();
        */
		
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        HelloWorld obj = context.getBean(HelloWorld.class);
        obj.setMessage("Hello World using java configurationw!");
        obj.getMessage();
       context.close();
    }
}
