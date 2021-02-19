package spring5.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface MessageService {
	 public void sendMsg(); 
}

@Component
class FacebookMessageService implements MessageService {
    @Override
    public void sendMsg() {
        System.out.println("FacebookMessageService implementation here");
    }
}
@Component
class EmailMessageService implements MessageService {

    @Override
    public void sendMsg() {
        System.out.println("EmailMessageService Implementation here");
    }
}

@Primary
@Component
class TwitterMessageService implements MessageService {
    @Override
    public void sendMsg() {
        System.out.println("TwitterMessageService Implementation here");
    }
}

@Configuration
@ComponentScan(basePackages = "spring5.annotations.part1")
class App {}

public class PrimaryAnnotation {
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MessageService messageService = context.getBean(MessageService.class);
        messageService.sendMsg();
        context.close();
    }
}
