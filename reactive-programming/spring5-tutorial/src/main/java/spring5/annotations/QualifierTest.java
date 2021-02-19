package spring5.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
interface TextWriter {
	
	public String writeText(String s);

}
@Component
@Qualifier("RegularWriter")
class RegularWriter implements TextWriter{

	@Override
	public String writeText(String s) {
		return s.toUpperCase();
	}

}
@Component
@Qualifier("FancyWriter")
class FancyWriter implements TextWriter{

	@Override
	public String writeText(String s) {
		return s +  " fancy text2244444";
	}

}

@RestController
public class QualifierTest {

//	@Autowired
//	@Qualifier("RegularWriter")
//	TextWriter regular;
//	
//	@GetMapping("/")
//	public String index() {
//		return regular.writeText("Hi Chaman Bharti!");
//	}
	
	@Autowired
	@Qualifier("RegularWriter")
	TextWriter regular;
	
	@Autowired
	@Qualifier("FancyWriter")
	TextWriter fancy;
	
	@GetMapping("/")
	public String index() {
		return regular.writeText("Hi Chaman Bharti!");
	}
}
