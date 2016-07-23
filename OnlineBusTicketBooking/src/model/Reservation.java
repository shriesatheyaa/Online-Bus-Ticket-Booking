package model;

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
	private Bus bus;
	private Trip trip;
	private City sourceCity;
	private City desitinationCity;
	private int noOfSeatsBooked;
	private int totalPrice;
	private String paymentMode;
	private String status;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id; 
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public City getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(City sourceCity) {
		this.sourceCity = sourceCity;
	}

	public City getDesitinationCity() {
		return desitinationCity;
	}

	public void setDesitinationCity(City desitinationCity) {
		this.desitinationCity = desitinationCity;
	}
	
	
	
}
