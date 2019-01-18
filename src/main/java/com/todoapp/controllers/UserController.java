package com.todoapp.controllers;

import java.io.Console;

import javax.servlet.http.HttpSession;
import javax.swing.text.html.FormSubmitEvent.MethodType;
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
		//System.out.println("\n\n\n[UserController] ==> return \"/user/create\";");
		return "/user/create";
	}
	
	@RequestMapping(value="/createUser",method=RequestMethod.POST)
	public String createUser(User user){
		
		ur.save(user);
		//System.out.println("\n\n\n[UserController] ==> ur.save -> index;");
		return "index";
	}
	
	@RequestMapping(value="/user/login",method=RequestMethod.GET)
	public String login() {
		System.out.println("\n\n\n[UserController] ==> login GET");

		return "/user/login";
	}
	
	
	@RequestMapping(value="/user/login",method=RequestMethod.POST)
	public String login(User user,HttpSession session) {
		
		System.out.println("\n\n\n[UserController] ==> login POST\n\n Username: "+user.getUsername()+"\n password: "+user.getPassword());
		
		//User tmpUsr = ur.findByUsername(user.getUsername(), user.getPassword());
		/*
		
		*/
			User tmpUsr = ur.findByUsername(user.getUsername());
		
		
			System.out.println("\n\n\n[UserController] ==>"+
					"\n User COde: "+tmpUsr.getCode()+
					"\n nAME: "+tmpUsr.getName()+
					"\n Username: "+tmpUsr.getUsername()
					);
		
		if(tmpUsr.getCode() > 0 ){
			System.out.println("\n\n\n[UserController] ==> USER NAME: "+tmpUsr.getUsername()+"uression.setAttribute( -> index;");
			session.setAttribute("userloggedin", tmpUsr);
			
			
			
			return "index";
		}
		
		return "/user/login";
	}
	
	
}
