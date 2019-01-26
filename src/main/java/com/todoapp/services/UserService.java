package com.todoapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todoapp.models.User;
import com.todoapp.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository ur;
	
	public List<User> allUser(){
		
		List<User> res = new ArrayList<User>();
		ur.findAll().forEach(res::add);
		
		
		return res;
		
	}

}
