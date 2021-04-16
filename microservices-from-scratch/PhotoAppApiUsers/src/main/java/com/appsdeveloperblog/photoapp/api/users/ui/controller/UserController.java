package com.appsdeveloperblog.photoapp.api.users.ui.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.photoapp.api.users.service.UserService;
import com.appsdeveloperblog.photoapp.api.users.shared.UserDto;
import com.appsdeveloperblog.photoapp.api.users.ui.model.CreateUserRequestModel;
import com.appsdeveloperblog.photoapp.api.users.ui.model.CreateUserResponseModel;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private Environment environment;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/status/check")
	public String status() {
		return "Working on port "+environment.getProperty("local.server.port");
	}
	
//	@PostMapping
//	public  String createUser(@Valid @RequestBody CreateUserRequestModel userDetails) {
//		
//		ModelMapper modelMapper = new ModelMapper();
//		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		
//		UserDto userDto = modelMapper.map(userDetails, UserDto.class);
//		userService.createUser(userDto);
//		
//		return "create user method was called";
//	}
	
//	@SuppressWarnings("rawtypes")
//	@PostMapping
//	public  ResponseEntity createUser(@RequestBody CreateUserRequestModel userDetails) {
//		
//		ModelMapper modelMapper = new ModelMapper();
//		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		
//		UserDto userDto = modelMapper.map(userDetails, UserDto.class);
//		userService.createUser(userDto);
//		
//		return new ResponseEntity(HttpStatus.CREATED);
//	}
	
	@PostMapping(consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public  ResponseEntity<CreateUserResponseModel> createUser(@RequestBody CreateUserRequestModel userDetails) {
		
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserDto userDto = modelMapper.map(userDetails, UserDto.class);
		
		UserDto createUser = userService.createUser(userDto);
		CreateUserResponseModel returnValue = modelMapper.map(createUser, CreateUserResponseModel.class);
		userService.createUser(userDto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
	}
}
