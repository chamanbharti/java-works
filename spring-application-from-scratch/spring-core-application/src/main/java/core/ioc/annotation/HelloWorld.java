package core.ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements Message{

	private String message;

    public void setMessage(String message) {
        this.message = message;
    }

	@Override
	public void getMessage() {
		  System.out.println("My Message : " + message);
	}

}
