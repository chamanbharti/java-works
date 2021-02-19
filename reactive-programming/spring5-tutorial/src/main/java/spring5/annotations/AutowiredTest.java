package spring5.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
interface CustomerService {
	public String hell(String str);
}
@Component
class CustomerServiceImpl implements CustomerService{

	@Override
	public String hell(String str) {
		return "Hello "+str;
		
	}
	
}
@RestController
@RequestMapping("/test")
public class AutowiredTest {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/hell")
	public ResponseEntity<String>hello(){
		String str = "Chaman";
		String message = null;
		if(str != null) {
			message = customerService.hell(str);
		}
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
}
