package model;

import java.sql.Time;
import java.util.Date;


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
	
	public boolean isActive() {
		return isActive;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
