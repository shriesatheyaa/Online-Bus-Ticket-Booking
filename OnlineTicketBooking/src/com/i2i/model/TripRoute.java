package com.i2i.model;

import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;


/**
 * TripRoute model object
 * 
 * <p> Contains various attributes of Trip and its getters and setters
 * 
 * @author Ideas2IT-sivaranjani
 * @created 
 */
public class TripRoute {
	private int id;
	private Route route;
	private Trip trip;
	private Time departureTime;
	private Time arrivalTime;
	private double price;
	private Date dateOfTravel;
	private boolean isActive;
	private User createdBy;
    private Date createdAt;
    private User modifiedBy;
    private Date modifiedAt;
    private Set<Reservation> reservations = new HashSet<Reservation>();
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Route getRoute() {
		return route;
	}
	
	public void setRoute(Route route) {
		this.route = route;
	}
	
	public Trip getTrip() {
		return trip;
	}
	
	public void setTrip(Trip trip) {
		this.trip = trip;
	}
	
	public Time getDepartureTime() {
		return departureTime;
	}
	
	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}
	
	public Time getArrivalTime() {
		return arrivalTime;
	}
	
	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Date getDateOfTravel() {
		return dateOfTravel;
	}
	
	public void setDateOfTravel(Date dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	
	public boolean getIsActive() {
		return isActive;
	}
	
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public User getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(User modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

}


 
