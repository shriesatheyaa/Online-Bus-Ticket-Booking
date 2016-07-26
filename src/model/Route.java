package model;

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
    private Time createdAt;
    private User modifiedBy;
    private Time modifiedAt;
	
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

	public Time getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Time createdAt) {
		this.createdAt = createdAt;
	}

	public User getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(User modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Time getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Time modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
    
}
