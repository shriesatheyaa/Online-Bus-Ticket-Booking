package model;

import java.sql.Time;
import java.util.Set;
import java.util.HashSet;

import model.Reservation;
import model.Bus;
import model.City;
import model.Travels;

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
	private Set<Reservation> reservations = new HashSet<Reservation> ();
	private Set<City> cities = new HashSet<City> ();
	private Set<Bus> buses = new HashSet<Bus> ();
	private Set<Travels> travels = new HashSet<Travels> ();
	
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
	
	public Set<Reservation> getReservations() {
		return reservations;
	}
	
	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	public Set<Bus> getBuses() {
		return buses;
	}

	public void setBuses(Set<Bus> buses) {
		this.buses = buses;
	}

	public Set<Travels> getTravels() {
		return travels;
	}

	public void setTravels(Set<Travels> travels) {
		this.travels = travels;
	}
	
	
}
