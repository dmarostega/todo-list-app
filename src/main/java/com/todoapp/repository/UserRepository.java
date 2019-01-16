package com.todoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.todoapp.models.User;

public interface UserRepository extends CrudRepository<User, String>{

}
