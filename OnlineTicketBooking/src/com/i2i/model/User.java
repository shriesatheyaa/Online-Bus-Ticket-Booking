package com.i2i.model;

import java.util.Date;
import java.sql.Time;
import java.util.Set;



import java.util.HashSet;

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
	private Date createdAt;
	private Set<Reservation> reservations = new HashSet<Reservation>();
	private Set<Bus> buses = new HashSet<Bus>();
	private Set<City> cities = new HashSet<City>();
	private Set<Trip> trips = new HashSet<Trip>();
	private Set<TripRoute> tripRoutes = new HashSet<TripRoute>();
	private Set<Route> routes = new HashSet<Route>();
	private Set<Travels> travels = new HashSet<Travels>();
	
	public User() {
		
	}
	
	public User(String name, String email, long mobileNumber, String password) {
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}

	public User(int id, String name, String email, long mobileNumber, String password, Date createdAt,
			Set<Reservation> reservations, Set<Bus> buses, Set<City> cities, Set<Trip> trips, Set<TripRoute> tripRoutes,
			Set<Route> routes, Set<Travels> travels) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.createdAt = createdAt;
		this.reservations = reservations;
		this.buses = buses;
		this.cities = cities;
		this.trips = trips;
		this.tripRoutes = tripRoutes;
		this.routes = routes;
		this.travels = travels;
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

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	public Set<Bus> getBuses() {
		return buses;
	}

	public void setBuses(Set<Bus> buses) {
		this.buses = buses;
	}

	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	public Set<Trip> getTrips() {
		return trips;
	}

	public void setTrips(Set<Trip> trips) {
		this.trips = trips;
	}

	public Set<TripRoute> getTripRoutes() {
		return tripRoutes;
	}

	public void setTripRoutes(Set<TripRoute> tripRoutes) {
		this.tripRoutes = tripRoutes;
	}

	public Set<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(Set<Route> routes) {
		this.routes = routes;
	}

	public Set<Travels> getTravels() {
		return travels;
	}

	public void setTravels(Set<Travels> travels) {
		this.travels = travels;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber + ", password=" + password
				+ "]";
	}
}
