package com.i2i.model;

import java.util.Set;
import java.util.HashSet;
import java.sql.Date;
import java.sql.Time;

/*
 * Bus Model Object.
 * <P>Contains various attributes of Bus and their getter setters.</p>
 * 
 * @author Anupriya-Ideas2It
 * @version 1.0
 */
public class Bus {
	private int id;
	private String registrationNumber;
	private Travels travels;
	private String  type;
	private Boolean isAc;
	private int totalNumberOfSeats;
	private User createdBy;
	private Date createdAt;
	private User modifiedBy;
	private Date modifiedAt;
	private Set<Trip> trips = new HashSet<Trip>();
	
	public Bus() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Travels getTravels() {
		return travels;
	}

	public void setTravels(Travels travels) {
		this.travels = travels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getIsAc() {
		return isAc;
	}

	public void setIsAc(Boolean isAc) {
		this.isAc = isAc;
	}

	public int getTotalNumberOfSeats() {
		return totalNumberOfSeats;
	}

	public void setTotalNumberOfSeats(int totalNumberOfSeats) {
		this.totalNumberOfSeats = totalNumberOfSeats;
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

	public Set<Trip> getTrips() {
		return trips;
	}

	public void setTrips(Set<Trip> trips) {
		this.trips = trips;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", registrationNumber=" + registrationNumber + ", travels=" + travels + ", type="
				+ type + ", isAc=" + isAc + ", totalNumberOfSeats=" + totalNumberOfSeats + ", trips=" + trips + "]";
	}
	
	
}
