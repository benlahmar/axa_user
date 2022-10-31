package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Adresse;
import com.example.demo.entities.Profile;
import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repo.IProfile;
import com.example.demo.repo.IRole;
import com.example.demo.repo.IUser;

@SpringBootApplication
public class Axa001Application implements CommandLineRunner{

	@Autowired
	IUser urepo;
	
	@Autowired
	IRole rrepo;
	
	@Autowired
	IProfile prepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Axa001Application.class, args);
		
	}
	
	@Bean
	public HttpTraceRepository http1()
	{
		return new InMemoryHttpTraceRepository();
	}

	@Override
	public void run(String... args) throws Exception {
		
//		User u=new User();
//		u.setLog("axa8");
//		u.setPass("pass");
//		Adresse adr=new Adresse();
//		adr.setVille("casa");
//		u.setAdresse(adr);
//		urepo.save(u);
//		
//		Profile prf=new Profile();
//		prf.setTel("4454585");
//		prepo.save(prf);
//		u.setProfile(prf);
//		prf.setUser(u);
//		urepo.save(u);
//		
		
		
		
		
		
		
//		
//
//		Role role=new Role();
//		role.setLibelle("admin");
//		
//		role=rrepo.save(role);
//	//	role.getUsers().add(u);
//		u.setRole(role);
//		
//		urepo.save(u);
//		
		
		
		
		
	}

}
