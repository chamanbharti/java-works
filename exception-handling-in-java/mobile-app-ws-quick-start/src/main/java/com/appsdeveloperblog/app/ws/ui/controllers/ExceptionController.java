package com.appsdeveloperblog.app.ws.ui.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.app.ws.exceptions.UserServiceException;
import com.appsdeveloperblog.app.ws.ui.model.request.UpdateUserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;
import com.appsdeveloperblog.app.ws.userservice.UserService;
import com.appsdeveloperblog.app.ws.userservice.impl.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class ExceptionController {

	Map<String, UserRest> users;
	
	@Autowired
	UserService userService;
	
	// handle null pointer exception
	@GetMapping(path="NPE/{userId}")
	public ResponseEntity<UserRest> handleNPE(@PathVariable String userId)
	{
		String firstName = null;
		int firstNameLength = firstName.length();
		
		if(users.containsKey(userId))
		{
			return new ResponseEntity<>(users.get(userId), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping(path="arithmatic/{userId}")
	public ResponseEntity<UserRest> handleArithmaticException(@PathVariable String userId)
	{
		if(userId != null)
		{
//			int i = Integer.valueOf(userId)/0;
//			System.out.println(i);
			return new ResponseEntity<>(users.get(userId), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	// handle custom exception
		@GetMapping(path="custom/{userId}")
		public ResponseEntity<UserRest> handleCustomException(@PathVariable String userId)
		{
			if(true) {
				throw new UserServiceException("A user service exception is thrown");
			}
			if(users.containsKey(userId))
			{
				return new ResponseEntity<>(users.get(userId), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}
	
	
	
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable String id)
	{
		users.remove(id);
		
		return ResponseEntity.noContent().build();
	}
	@GetMapping
	public String getUsers(@RequestParam(value="page", defaultValue="1") int page, 
			@RequestParam(value="limit", defaultValue="50") int limit,
			@RequestParam(value="sort", defaultValue = "desc", required = false) String sort)
	{
		return "get users was called with page = " + page + " and limit = " + limit + " and sort = " + sort;
	}

}
