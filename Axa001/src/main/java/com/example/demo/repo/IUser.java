package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.User;

public interface IUser extends JpaRepository<User, Long>{

	public User findByLog(String lg);
	List<User> findByAdresseVille(String v);
	List<User> findByDateBetween(LocalDate dd, LocalDate df);
	
}
