package com.app.bookshop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.bookshop.model.User;
import com.app.bookshop.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> showAllUser() {
		
		return userService.getAllUser(); 
		
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<User> showUser(@PathVariable String userId){
		
		return new ResponseEntity<User>(userService.getUser(Long.parseLong(userId)),HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping("/user")
	public ResponseEntity<User> registerUser(@RequestBody User user ){
		String Message = "Data not found";
		if(user == null) {
			System.out.println(Message);
			return  ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			
		}
		
		return new ResponseEntity<User>(userService.registerUser(user),HttpStatus.ACCEPTED);
		
		
	}
	
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<Optional<User>> deleteUser(@PathVariable String userId){
		
		
		return new ResponseEntity<Optional<User>>(userService.deleteUser(userId),HttpStatus.ACCEPTED);
	}
	
}
