package com.curd.assignment.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curd.assignment.entity.User;
import com.curd.assignment.entity.UserResponse;
import com.curd.assignment.service.IUserService;


@RestController
public class UserController {

	@Autowired
	IUserService iUserService;
	
	@PostMapping(name = "/user", consumes="application/json")
	public UserResponse createUser(@RequestBody @Valid User user){
		return iUserService.createUser(user);
	}
	
	@PutMapping(name = "/user/{userId}", consumes="application/json")
	public UserResponse updateUser(@RequestBody User user, @PathVariable("userId") Integer userId){
		return iUserService.updateUser(user, userId);
	}
	
	@DeleteMapping("/user/{userId}")
	public UserResponse delete(@PathVariable ("userId") Integer userId){
		return iUserService.delete(userId);
	}
	
}