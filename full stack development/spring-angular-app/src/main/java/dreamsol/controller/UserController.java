package dreamsol.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiPredicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dreamsol.exception.ResourceNotFoundException;
import dreamsol.model.User;
import dreamsol.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	BiPredicate<String, String>isNullOrEmpty = (s1,s2) -> (s1 != null && s2 != null) && (s1.length() !=0 && s2.length() != 0);
	BiPredicate<String, String>isBothNotEqual = (s1,s2) -> (s1.equals(s2));
	
	
	@PostMapping(path = "/user")
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
//	@PostMapping(path = "/user")
//	public ResponseEntity<User> createUser(User user) {
//		return ResponseEntity.ok().body(userRepository.save(user));
//	}
	
	@GetMapping(path = "/users")
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
//	@GetMapping(path = "/users")
//	public ResponseEntity<List<User>> getUsers() {
//		return ResponseEntity.ok().body(userRepository.findAll());
//	}
	
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + id));
		return user;
	}
	
	
	@PutMapping("/user")
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
//	@GetMapping("/user/{id}")
//	public ResponseEntity<User> getUser(@PathVariable(value = "id") Long id)
//			throws ResourceNotFoundException {
//		User user = userRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + id));
//		return ResponseEntity.ok().body(user);
//	}
	
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable(value = "id") Long id) {
		userRepository.deleteById(id);
		return true;
	}
	
//	@DeleteMapping("/user/{id}")
//	public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long id)
//			throws ResourceNotFoundException {
//		User user = userRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + id));
//
//		userRepository.delete(user);
//		Map<String, Boolean> response = new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return response;
//	}
	
}
