package com.hsm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="receptionist")
public class Receptionist {
	@Id
	private String id;
	@Column
	private String password;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String phoneNumber;
	public Receptionist(String id, String password, String name, String address, String phoneNumber) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Receptionist() {
		super();
		// TODO Auto-generated constructor stub
	}



}
