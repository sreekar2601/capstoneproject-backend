package com.capstone.capstonebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="managerlogins")
public class ManagerLogin {
	
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
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
	public ManagerLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public ManagerLogin() {
		
	}
	@Override
	public String toString() {
		return "ManagerLogin [username=" + username + ", password=" + password + "]";
	}

	
}
