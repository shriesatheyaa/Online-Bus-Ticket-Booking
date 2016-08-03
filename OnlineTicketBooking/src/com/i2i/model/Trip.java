package com.i2i.model;

import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

/**
 * Trip Model Object.
 * <p>Contains various attributes of Trip, and its getters and setters </p> 
 * @author Shrie Satheyaa
 * @version 1.0
 * @created 2016-07-23
 */
public class Trip {
    private int id;
    private int seatVacancy;
    private Bus bus;
    private Set<TripRoute> tripRoutes = new HashSet<TripRoute> ();
    private User createdBy;
    private Date createdAt;
    private User modifiedBy;
    private Date modifiedAt;
    
	public Trip() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeatVacancy() {
		return seatVacancy;
	}

	public void setSeatVacancy(int seatVacancy) {
		this.seatVacancy = seatVacancy;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Set<TripRoute> getTripRoutes() {
		return tripRoutes;
	}

	public void setTripRoutes(Set<TripRoute> tripRoutes) {
		this.tripRoutes = tripRoutes;
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

}
