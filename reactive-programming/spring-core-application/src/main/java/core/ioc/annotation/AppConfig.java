package core.ioc.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "core.ioc.annotation")
public class AppConfig {

//	@Bean
//    public HelloWorld helloWorld() {
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setMessage("Hello World using java configuration!");
//        return helloWorld;
//    }
}
