package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
@Entity
public class Profile {

	@Id
	@GeneratedValue
	long id;
	String email,tel;
	String photo;
	
	@OneToOne(mappedBy = "profile")
	User user;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
}
