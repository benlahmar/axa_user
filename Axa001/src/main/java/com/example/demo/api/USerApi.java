package com.example.demo.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.exceptions.NoSuchCustomerExistsException;
import com.example.demo.repo.IUser;

@RestController
public class USerApi {

	@Autowired
	IUser urepo;
	
	@GetMapping("/users/{id}")
	public User finduser(@PathVariable long id) 
	{
		return  urepo.findById(id)
			.orElseThrow(()->new NoSuchCustomerExistsException("client not exist"));
		 
	}
	
	@GetMapping("/test1")
	public String abc()
	{
		User u = null;
		String x=u.getNom();
		return "test"+x;
	}
	
	
}