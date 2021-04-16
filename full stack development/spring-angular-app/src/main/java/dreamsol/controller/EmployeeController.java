package dreamsol.controller;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiPredicate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dreamsol.exception.ResourceNotFoundException;
import dreamsol.model.AuthenticationBean;
import dreamsol.model.Employee;
import dreamsol.model.Greeting;
import dreamsol.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	BiPredicate<String, String>isNullOrEmpty = (s1,s2) -> (s1 != null && s2 != null) && (s1.length() !=0 && s2.length() != 0);
	BiPredicate<String, String>isBothNotEqual = (s1,s2) -> (s1.equals(s2));
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	
	@GetMapping(path = "/login")
	public ResponseEntity<Boolean> login(@RequestParam(value = "userName") String userName,
			@RequestParam(value = "password") String password) throws ResourceNotFoundException {
		boolean employeeExist = false;
		List<Map<String,Object>> list = jdbcTemplate.queryForList("select email_id,mobile from employees where email_id='"+userName+"' and mobile='"+password+"'");
		if(list.size() != 0) {
			employeeExist = true;
		}
		return ResponseEntity.ok().body(employeeExist);
	}
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean("You are authenticated");
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		List<Employee> list = employeeRepository.findAll();
		List<Employee> list2 = new ArrayList<>();
		for(Employee e:list) {
			if(e.getDob() != null) {
				String date = getStringDate(e.getDob());
				e.setDob(date);
				e.setAge(getAge(e.getDob()));
				list2.add(e);
			}
		}
		
		return list;
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		if(employee.getDob() != null) {
			String dbDate = employee.getDob();
			String date = getStringDate(dbDate);
			employee.setDob(date);
			employee.setAge(getAge(date));
		}
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee employee) {
		LocalDate localDate = retunDateToSave(employee.getDob());
		//local date to string
	    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
		//DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
	    String formatDate = localDate.format(format1);   
		employee.setDob(formatDate);
		return employeeRepository.save(employee);
	}
	public String getStringDate(String date){
		String finalDate = null ;
		try{
			if(date!=null){
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate date1 = LocalDate.parse(date,formatter);
				
				DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				//DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				finalDate = formatter2.format(date1);
			}
		}catch(Exception e){
		}
		
		return finalDate;
	}
	public LocalDate retunDateToSave(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.parse(date, formatter);
		return localDate;
	}
	public String getAge(String dob) {
		String age = null;
		LocalDate today = LocalDate.now();        //Today's date
		LocalDate birthday = retunDateToSave(dob);//LocalDate.of(2020, Month.FEBRUARY, 02);  //Birth date
		 
		Period period = Period.between(birthday, today);
		 
//		System.out.println(period.getDays());
//		System.out.println(period.getMonths());
//		System.out.println(period.getYears());
		StringBuilder calculatedAge = new StringBuilder();
//		if(period.getYears()!=0) {
//			calculatedAge.append(period.getYears()).append(" year ");
//		}if(period.getMonths()!=0) {
//			calculatedAge.append(period.getMonths()).append(" month ");
//		}if(period.getDays()!=0) {
//			calculatedAge.append(period.getDays()).append(" days");
//		}
		calculatedAge.append(Math.abs(period.getYears())).append(" years ");
		calculatedAge.append(Math.abs(period.getMonths())).append(" months ");
		calculatedAge.append(Math.abs(period.getDays())).append(" days");
		age = calculatedAge.toString();
		return age;
	}
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

		employee.setEmailId(employeeDetails.getEmailId());
		employee.setLastName(employeeDetails.getLastName());
		employee.setFirstName(employeeDetails.getFirstName());
		//employeeDetails.setMobile("9113153298");
		if(isNullOrEmpty.test(employee.getMobile(),employeeDetails.getMobile()) && isBothNotEqual.negate().test(employee.getMobile(),employeeDetails.getMobile())) {
			employee.setMobile(employeeDetails.getMobile());
		}
		employee.setDob(employeeDetails.getDob());
		LocalDate localDate = retunDateToSave(employee.getDob());
		//local date to string
	    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
	    String formatDate = localDate.format(format1);   
		employee.setDob(formatDate);   
		final Employee updatedEmployee = employeeRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
