package com.todoapp.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todoapp.models.User;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
	
		User sessionuser  = (User) session.getAttribute("userloggedin");
		
		
		if( session.getAttribute("userloggedin") != null){
			/*System.out.println("\n\n\n[IndexController] ==> getSession "+ "\n\n session use: "+
					sessionuser.getName());*/
			return "/index";
		}
		/*System.out.println("\n\n\n[IndexController] ==> redirect:/user/login");*/
		return "redirect:/user/login";
	}
}
