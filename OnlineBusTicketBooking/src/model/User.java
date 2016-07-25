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
	private long mobileNumber;
	private String password;
	private Time createdAt;
	
	public User() {
		
	}
	
	public User(String name, String email, long mobileNumber, String password) {
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}

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
<<<<<<< HEAD
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(long mobileNumber) {
=======
	public double getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(double mobileNumber) {
>>>>>>> 4286df881872a8b06f6560de1a705cdd0f6db633
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
