package com.i2i.model;

/**
 * Reservation model object
 * 
 * <p> Contains various attributes of Bus ticket reservation and its getters and setters
 * 
 * @author Ideas2IT-sivaranjani
 * @created 
 */
public class Reservation {
	private int id;
	private User user;
	private TripRoute tripRoute; 
	private int noOfSeatsBooked;
	private int totalPrice;
	private String paymentMode;
	private String status;
	
	public Reservation() {
	}

	public Reservation(String status, User user, int noOfSeatsBooked, String paymentMode,
			int id, TripRoute tripRoute,int totalPrice) {
		this.status = status;
		this.user = user;
		this.noOfSeatsBooked = noOfSeatsBooked;
		this.paymentMode = paymentMode;
		this.id = id;
		this.tripRoute = tripRoute;
		this.totalPrice = totalPrice;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id; 
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TripRoute getTripRoute() {
		return tripRoute;
	}

	public void setTripRoute(TripRoute tripRoute) {
		this.tripRoute = tripRoute;
	}

	public int getNoOfSeatsBooked() {
		return noOfSeatsBooked;
	}
	
	public void setNoOfSeatsBooked(int noOfSeatsBooked) {
		this.noOfSeatsBooked = noOfSeatsBooked;
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String getPaymentMode() {
		return paymentMode;
	}
	
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
