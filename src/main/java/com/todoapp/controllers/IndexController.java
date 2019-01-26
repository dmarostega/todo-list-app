package com.todoapp.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todoapp.models.User;

@RestController
public class IndexController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
	
		User sessionuser  = (User) session.getAttribute("userloggedin");
				
		if( session.getAttribute("userloggedin") != null){
			return "/index";
		}
		
		return "redirect:/user/login";
	}
}
