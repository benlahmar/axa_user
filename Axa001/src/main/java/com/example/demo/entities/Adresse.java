package com.example.demo.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

	String rue,ville,pays,codep;

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCodep() {
		return codep;
	}

	public void setCodep(String codep) {
		this.codep = codep;
	}
	
}
