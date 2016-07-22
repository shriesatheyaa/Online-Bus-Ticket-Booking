package model;

import java.sql.Time;

/**
 * User model object
 * 
 * <p> Contains various attributes of a user and its getters and setters
 * 
 * @author Ideas2IT-sivaranjani
 * @created 
 */
public class User {
	private int id;
	private String name;
	private String email;
	private double mobileNumber;
	private String password;
	private Time createdAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Time getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Time createdAt) {
		this.createdAt = createdAt;
	}
}
