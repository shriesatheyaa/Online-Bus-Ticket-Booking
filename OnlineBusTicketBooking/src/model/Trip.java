/**
 * 
 */
package model;

import java.sql.Time;

/**
 * <p>Contains various attributes, its getters and setters of Trip</p> 
 * @author Shrie Satheyaa
 * @version 1.0
 */
public class Trip {
    private int id;
    private int busId;
    private int sourceId;
    private int destinationId;
    private Time departureTime;
    private Time arrivalTime;
    private Double price;
    private int createdBy;
    private Time createdAt;
    private int modifiedBy;
    private Time modifiedAt;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getBusId() {
		return busId;
	}
	
	public void setBusId(int busId) {
		this.busId = busId;
	}
	
	public int getSourceId() {
		return sourceId;
	}
	
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}
	
	public int getDestinationId() {
		return destinationId;
	}
	
	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
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
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}

	
	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
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
	
    
}
