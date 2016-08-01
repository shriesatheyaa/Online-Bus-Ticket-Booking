package com.i2i.model;

import java.sql.Date;
import java.sql.Time;

/**
 * <p>Contains various attributes, its getters and setters of Route</p>
 * @author Shrie Satheyaa
 * @version 1.0
 * @created 2016-07-26
 */
public class Route {
    private int id;
    private City sourceCity;
    private City destinationCity;
    private User createdBy;
    private Date createdAt;
    private User modifiedBy;
    private Date modifiedAt;
    
	public Route() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public City getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(City sourceCity) {
		this.sourceCity = sourceCity;
	}

	public City getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(City destinationCity) {
		this.destinationCity = destinationCity;
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

	@Override
	public String toString() {
		return "Route [id=" + id + ", sourceCity=" + sourceCity + ", destinationCity=" + destinationCity + "]";
	}
	
	
}
