package com.todoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.todoapp.models.User;

public interface UserRepository extends CrudRepository<User, String>{
//	User findByUsername(String username, String password);
	User findByUsername(String username);
}
