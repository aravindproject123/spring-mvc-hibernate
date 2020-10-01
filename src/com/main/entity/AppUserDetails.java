package com.main.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "app_user_details")
public class AppUserDetails implements Serializable
{
	@Id
	@GenericGenerator(name = "app_auto", strategy = "increment")
	@GeneratedValue(generator = "app_auto")
	@Column(name = "id")
	private Long id;
	@Column(name = "app_name")
	private String appName;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "r_id")
	private Register register;
	
	
	public AppUserDetails() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Register getRegister() {
		return register;
	}
	public void setRegister(Register register) {
		this.register = register;
	}
	@Override
	public String toString() 
	{
		return "AppUserDetails [id=" + id + ", appName=" + appName + ", userName=" + userName + ", email=" + email
				+ ", password=" + password + ", register=" + register + "]";
	}
	


}
