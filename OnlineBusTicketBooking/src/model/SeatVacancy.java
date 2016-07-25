package model;

import java.util.Date;

/**
 * <p>Contains various attributes, its getters and setters of SeatVacancy</p> 
 * @author Shrie Satheyaa
 * @version 1.0
 */
public class SeatVacancy {
    private Date dateOfTravel;
    private int availableSeats;
    private Trip trip;
    private Bus bus;
	/**
	 * @return the dateOfTravel
	 */
	public Date getDateOfTravel() {
		return dateOfTravel;
	}
	/**
	 * @param dateOfTravel the dateOfTravel to set
	 */
	public void setDateOfTravel(Date dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	/**
	 * @return the availableSeats
	 */
	public int getAvailableSeats() {
		return availableSeats;
	}
	/**
	 * @param availableSeats the availableSeats to set
	 */
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Trip getTrip() {
		return trip;
	}
	public void setTrip(Trip trip) {
		this.trip = trip;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
}