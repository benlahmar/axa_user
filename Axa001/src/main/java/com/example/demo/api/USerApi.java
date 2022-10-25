package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repo.IUser;

@RestController
public class USerApi {

	@Autowired
	IUser urepo;
	
	@GetMapping("/users/{id}")
	public User finduser(@PathVariable long id)
	{
		return urepo.findById(id).get();
	}
}
