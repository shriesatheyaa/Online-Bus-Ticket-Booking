package model;

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
    private int seatVaccancy;
    private Bus bus;
    private Set<TripRoute> tripRoutes = new HashSet<TripRoute> ();
    private User createdBy;
    private Time createdAt;
    private User modifiedBy;
    private Time modifiedAt;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public User getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(User modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Time getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Time createdAt) {
		this.createdAt = createdAt;
	}

	public Time getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Time modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public Bus getBus() {
		return bus;
	}

	public int getSeatVaccancy() {
		return seatVaccancy;
	}

	public void setSeatVaccancy(int seatVaccancy) {
		this.seatVaccancy = seatVaccancy;
	}

	public Set<TripRoute> getTripRoutes() {
		return tripRoutes;
	}

	public void setTripRoutes(Set<TripRoute> tripRoutes) {
		this.tripRoutes = tripRoutes;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	
    
}
