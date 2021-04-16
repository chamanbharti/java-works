package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApp1Application// implements CommandLineRunner
{
//	@Autowired
//	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudApp1Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		userRepository.save(new User("Rahi","Akela"));
//		userRepository.save(new User("Chaman","Bharti"));
//		userRepository.save(new User("Nasrin","Praveen"));
//		userRepository.save(new User("Sahil","Bharti"));
//		userRepository.save(new User("Aman","Bharti"));
//		userRepository.save(new User("Naman","Bharti"));
//		
//	}
}
