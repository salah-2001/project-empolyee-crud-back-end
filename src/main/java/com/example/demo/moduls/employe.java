package com.example.demo.moduls;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employe")
public class employe {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String fristname;
	private String lastname;
	private String email;
	
	public employe() {
		super();
	}
	
	public employe(int id, String fristname, String lastname, String email) {
		super();
		this.id = id;
		this.fristname = fristname;
		this.lastname = lastname;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFristname() {
		return fristname;
	}
	public void setFristname(String fristname) {
		this.fristname = fristname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
