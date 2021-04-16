package cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@Value("${service.instance.name}")
	private String instance;
	
	@RequestMapping("/")
	public String messsage() {
		return "Hello from "+instance;
	}
}
