/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author ideas2it
 *
 */
public class SeatVacancy {
    private Date dateOfTravel;
    private int busId;
    private int tripId;
    private int availableSeats;
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
	 * @return the busId
	 */
	public int getBusId() {
		return busId;
	}
	/**
	 * @param busId the busId to set
	 */
	public void setBusId(int busId) {
		this.busId = busId;
	}
	/**
	 * @return the tripId
	 */
	public int getTripId() {
		return tripId;
	}
	/**
	 * @param tripId the tripId to set
	 */
	public void setTripId(int tripId) {
		this.tripId = tripId;
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
}
