/**
 * 
 */
package model;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>Contains various attributes, its getters and setters of Trip</p> 
 * @author Shrie Satheyaa
 * @version 1.0
 */
public class Trip {
    private int id;
    private Time departureTime;
    private Time arrivalTime;
    private Double price;
    private City sourceCity;
    private City destinationCity;
    private Bus bus;
    private Set<SeatVacancy> seatVacancies = new HashSet<SeatVacancy> ();
    private Set<Reservation> reservations = new HashSet<Reservation> ();

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

	public Set<SeatVacancy> getSeatVacancies() {
		return seatVacancies;
	}

	public void setSeatVacancies(Set<SeatVacancy> seatVacancies) {
		this.seatVacancies = seatVacancies;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	
    
}
