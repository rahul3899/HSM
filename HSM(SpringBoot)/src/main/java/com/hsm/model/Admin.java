package com.hsm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="admin")
public class Admin {
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private String username;
	@Column
	private String name;
	@Column
	
	private String password;
	@Column
	String phoneNumber;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Admin(String username, String name, String password, String phoneNumber) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
