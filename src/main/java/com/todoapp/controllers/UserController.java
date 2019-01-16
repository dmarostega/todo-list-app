package com.todoapp.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.todoapp.models.User;
import com.todoapp.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository ur;
	
	@RequestMapping(value="/createUser",method=RequestMethod.GET)
	public String createUser() {		
		return "/user/create";
	}
	
	@RequestMapping(value="/createUser",method=RequestMethod.POST)
	public String createUser(User user){
		
		ur.save(user);
		
		return "index";
	}
	
}
