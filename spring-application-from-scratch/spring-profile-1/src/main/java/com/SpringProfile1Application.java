package com;

import java.lang.annotation.Annotation;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
@SpringBootApplication
public class SpringProfile1Application {

	public static void main(String[] args) {
		
		//SpringApplication.run(SpringProfile1Application.class, args);
		
		new SpringApplicationBuilder(SpringProfile1Application.class).profiles("dev","prod","test").run(args);
	}

}

@Component
class MyRunner implements CommandLineRunner {

	@Autowired
	private Environment environment;
	
	@Override
	public void run(String... args) throws Exception {
		 System.out.println("Default profiles: " +Arrays.toString(environment.getDefaultProfiles()));
		 System.out.println("Active profiles: " +Arrays.toString(environment.getActiveProfiles()));
		
	}
	
}

@Component
@Profile(value="local")
class MyRunner2 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println("In local");
    }
}

@Component
@Profile(value="prod & !dev")
class MyRunner3 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

    	System.out.println("In development"); 
    }
}

@Component
@Profile(value="prod")
class MyRunner4 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println("In production");
    }
}


@Component
@Profile("test")
class MyRunner5 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
    	 System.out.println("In test");
    }
}

@Component
@Profile(value={"dev & local"})
class MyRunner6 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println("In development and local");
    }
}

@Component
@Profile(value={"dev", "prod"})
class MyRunner7 implements CommandLineRunner {

    @Value("${message}")
    private String message;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Message: " + message);
    }
}

@Component
@Profile("test")
class MyRunner8 implements CommandLineRunner {

    @Value("${message}")
    private String message;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Message: " + message);
    }
}
