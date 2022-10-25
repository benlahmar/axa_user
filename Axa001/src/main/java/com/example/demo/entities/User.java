package com.example.demo.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "utilisateur")
public class User {

	@Id
	@GeneratedValue
	long id;
	@Column(name = "username",unique = true, nullable = false, length = 60)
	String log;
	String pass;
	LocalDate date;
	String nom;
	
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinTable(name = "user_profile", 
		joinColumns = 
	        {@JoinColumn(name = "user_id", referencedColumnName = "id") },
		inverseJoinColumns = 
		        { @JoinColumn(name = "profile_id", referencedColumnName = "id") }
	         )
	Profile profile;
	
	@ElementCollection
	@OrderColumn
	String[] prenoms;
	@Embedded
	Adresse adresse;
	
	
	@ManyToOne()
	Role role;
	
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	
	
	
	
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public long getId() {
	
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String[] getPrenoms() {
		return prenoms;
	}
	public void setPrenoms(String[] prenoms) {
		this.prenoms = prenoms;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
	
}
