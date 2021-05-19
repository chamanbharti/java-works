package dreamsol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dreamsol.model.User;
import dreamsol.repository.UserRepository;

@SpringBootApplication
//@EnableAutoConfiguration
//@SpringBootConfiguration
//public class Application {
//	
//	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
//	}
//}

//@SpringBootConfiguration
public class Application implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Rahi","Akela"));
		userRepository.save(new User("Chaman","Bharti"));
		userRepository.save(new User("Nasrin","Praveen"));
		userRepository.save(new User("Sahil","Bharti"));
		userRepository.save(new User("Aman","Bharti"));
		userRepository.save(new User("Naman","Bharti"));
		
	}
}
