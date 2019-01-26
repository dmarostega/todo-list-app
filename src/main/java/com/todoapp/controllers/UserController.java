package com.todoapp.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.todoapp.models.User;
import com.todoapp.repository.TaskRepository;
import com.todoapp.repository.UserRepository;
import com.todoapp.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService us;
	
	@Autowired
	private UserRepository ur;
	
	@Autowired
	private TaskRepository tr;
	
	@RequestMapping(value="/createUser",method=RequestMethod.GET)
	public String createUser() {		
		return "/user/create";
	}
	
	@RequestMapping(value="/createUser",method=RequestMethod.POST)
	public String createUser(User user){
		
		ur.save(user);
		
		return "index";
	}
	
	@RequestMapping(value="/user/login",method=RequestMethod.GET)
	public String login() {
		return "/user/login";
	}
	
	
	@RequestMapping(value="/user/login",method=RequestMethod.POST)
	public String login(User user,HttpSession session) {
		
		User tmpUsr = ur.findByUsername(user.getUsername());
		
		if(tmpUsr.getCode() > 0 ){
			session.setAttribute("userloggedin", tmpUsr);
			return "index";
		}
		
		return "/user/login";
	}
	
	@CrossOrigin(origins="http://localhost:3000/")
	@RequestMapping("/alluser")
	public List<User> allUser(){
		return us.allUser();
	}
	
	@RequestMapping(value="/tasks",method=RequestMethod.GET)
	public String tasks() {
		
		
		return "";		
	}
	
//	@RequestMapping(value="/newTask",method=RequestMethod.GET){
	@RequestMapping("/newTask")		
	public String NewTask() {
		
		return "";
	}
	
}
