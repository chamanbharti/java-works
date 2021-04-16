package com.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

	 /*
	    * Binding a URI template variable to a method parameter using 'name' or 'value'
	    * attribute of @PathVariable
	    * http://localhost:8080/rest-app/request1/Chaman
	 */
	   @GetMapping("/request1/{name}")
	  // @ResponseBody
	   public String request1(@PathVariable(name = "name") String name) {

	      return "URL parameter <br> " 
	            + "name =" + name;
	   }
	   
	   /*
	    * Binding a URI template variable to a method parameter using 'name' or 'value'
	    * attribute of @PathVariable
	    * http://localhost:8080/rest-app/request2/Chaman/Bharti
	   */  
	   @GetMapping("/request2/{firstName}/{lastName}")
	   // @ResponseBody
	   public String request2(@PathVariable String firstName, @PathVariable String lastName) {
		   return "URL paramter <br>"
				   +"First Name:"+firstName+"<br> Last Name:"+lastName;
	   }
	   
	   /*
	    * If method parameter type is not String then Spring automatically converts
	    * to the appropriate type such as int, long, float etc.
	    */
	   @GetMapping("/request3/{name}/{age}/{salary}/{city}/{country}/{active}")
	   // @ResponseBody
	   public String request3(@PathVariable String name,@PathVariable int age,@PathVariable float salary, @PathVariable String city, @PathVariable String country,@PathVariable boolean active) {
		   return " URL parameter <br>"
				  +"Name:"+name+"<br>Age:"+age+"<br>Salary:"+salary+"<br>City:"+city+"<br>Country:"+country+"<br>Active:"+active; 
		   
	   }
	   

	   /*
	    * Binding date and time URL template variable to LocalDate and LocalTime
	    */
	   @GetMapping("/request5/{date}/{time}")
	   //@ResponseBody
	   public String request5(
	         @DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable("date") LocalDate date,
	         @DateTimeFormat(pattern = "HH:mm:ss") @PathVariable("time") LocalTime time) {

	      return "URL parameters - <br>" 
	            + " date = " + date + " <br>" 
	            + " time = " + time;
	   }
	   
	   /*
	    * Binding URI template variable to array
	    */
	   @GetMapping("/request6/{country}")
	 //  @ResponseBody
	   public String request6(
			   @PathVariable("country") String[] country) {
		   return "URI parameter <br>"
				   +"country = "+Arrays.asList(country);
	   }
	   
	   /*
	    * Binding URI template variable to list
	    */
	   @GetMapping("/request7/{city}")
	 //  @ResponseBody
	   public String request7(
			   @PathVariable("city") List<String> city
			   ) {
		   return "URI parameter <br>"
				   +"city = "+city;
	   }
	   
	   /*
	    * Binding URI template variable to set
	    */
	   @GetMapping("/request8/{city}")
	 //  @ResponseBody
	   public String request8(
			   @PathVariable("city") Set<String> city) {
		   return "URI parameter <br>"
				   +"city = "+city;
	   }
	   /**
	    * Binding all URI template variable to  Map
	    */
	   @GetMapping("/request9/{name}/{age}/address/{city}/{country}")
	   // @ResponseBody
	   public String request9(@PathVariable Map<String, String	> params) {
		   StringBuilder builder = new StringBuilder();
		   builder.append("URL parameters - <br>");
		   for(Entry<String,String>entry: params.entrySet()) {
			   builder.append(entry.getKey()+"="+entry.getValue()+"<br>");
		   }
		   return builder.toString();
	   }
	   
	   /*
	    * Binding URI template variable to array and list
	    */
	   @GetMapping("/request10/{country}/{city}")
	 //  @ResponseBody
	   public String request11(
			   @PathVariable("country") String[] country,
			   @PathVariable("city") List<String> city) {
		   return "URI parameter <br>"
				   +"country = "+Arrays.asList(country)+"<br>"
				   +"city = "+city;
	   }
	   
	   /**
	    * Binding all URI template variable to  Map
	    */
	   @GetMapping("/request12/{name}/{age}/address/{city}/{country}")
	   // @ResponseBody
	   public String request13(@PathVariable Map<String, String	> params) {
		   StringBuilder builder = new StringBuilder();
		   builder.append("URL parameters - <br>");
		   for(Entry<String,String>entry: params.entrySet()) {
			   builder.append(entry.getKey()+"="+entry.getValue()+"<br>");
		   }
		   return builder.toString();
	   }

}
