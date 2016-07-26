package model;

import java.util.Set;
import java.util.HashSet;
import java.sql.Time;

/*
 * Bus Model Object.
 * <P>Contains various attributes of Bus and their getter setters.</p>
 * 
 * @author Anupriya-Ideas2It
 * @version 1.0
 */
public class Bus {
	private int id;
	private String registrationNumber;
	private Travels travelsId;
	private String  type;
	private Boolean isAc;
	private int totalNumberOfSeats;
	private User createdBy;
	private Time createdAt;
	private User modifiedBy;
	private Time modifiedAt;
<<<<<<< 010ee3f5fa3195d13e26bac3f2f25012bce3fd5a
	private Set<Reservation> reservations = new HashSet<Reservation>();
	private Set<Trip> tripes = new HashSet<Trip>();
	private Set<SeatVacancy> seatVacancies = new HashSet<SeatVacancy>();
=======
	private Set<Trip> trips = new HashSet<Trip>();
>>>>>>> Modified Bus,City and their hbm.xml file for maintaining Associations
	
	public Bus() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public Travels getTravelsId() {
		return travelsId;
	}
	public void setTravelsId(Travels travelsId) {
		this.travelsId = travelsId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getIsAc() {
		return isAc;
	}
	public void setIsAc(Boolean isAc) {
		this.isAc = isAc;
	}
	public int getTotalNumberOfSeats() {
		return totalNumberOfSeats;
	}
	public void setTotalNumberOfSeats(int totalNumberOfSeats) {
		this.totalNumberOfSeats = totalNumberOfSeats;
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
<<<<<<< 010ee3f5fa3195d13e26bac3f2f25012bce3fd5a
	public Set<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	} 
	public Set<SeatVacancy> getSeatVacancies() {
		return seatVacancies;
	}
	public void setSeatVacancies(Set<SeatVacancy> seatVacancies) {
		this.seatVacancies = seatVacancies;
	}
	public Set<Trip> getTripes() {
		return tripes;
	}
	public void setTripes(Set<Trip> tripes) {
		this.tripes = tripes;
	}
	@Override
	public String toString() {
<<<<<<< HEAD
		return "Bus [id=" + id + ", registrationNumber=" + registrationNumber + ", travelsId=" + travelsId + ", type="
				+ type + ", isAc=" + isAc + ", totalNumberOfSeats=" + totalNumberOfSeats + "]";
=======
		return "Bus [id=" + id + ", registrationNumber=" + registrationNumber + ", travels=" + travels + ", type="
				+ type + ", isAc=" + isAc + ", totalNumberOfSeats=" + totalNumberOfSeats + ", createdBy=" + createdBy
				+ ", createdAt=" + createdAt + ", modifiedBy=" + modifiedBy + ", modifiedAt=" + modifiedAt
				+ ", reservations=" + reservations + ", trips=" + trips + ", seatVacancies=" + seatVacancies + "]";
>>>>>>> 6e56c1f9d16d89169f90a94307a5b85e3312ead3
=======
	public Set<Trip> getTrips() {
		return trips;
	}
	public void setTripes(Set<Trip> trips) {
		this.trips = trips;
>>>>>>> Modified Bus,City and their hbm.xml file for maintaining Associations
	}
	
	
}
