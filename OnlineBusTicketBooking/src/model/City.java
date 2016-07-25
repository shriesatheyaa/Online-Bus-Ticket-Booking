package model;

import java.util.Set;
import java.util.HashSet;
import java.sql.Time;
/*
 * City Model Object.
 * <P>Contains various attributes of City and their getter setters.</p>
 * 
 * @author Anupriya-Ideas2It
 * @version 1.0
 */
public class City {
	private int id;
	private String name;
	private User createdBy;
	private Time createdAt;
	private User modifiedBy;
	private Time modifiedAt; 
	private Set<Trip> sourceCityTrip = new HashSet<Trip>();
	private Set<Trip> destinationCityTrip = new HashSet<Trip>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Set<Trip> getDestinationCityTrip() {
		return destinationCityTrip;
	}
	public void setDestinationCityTrip(Set<Trip> destinationCityTrip) {
		this.destinationCityTrip = destinationCityTrip;
	}
	public Set<Trip> getSourceCityTrip() {
		return sourceCityTrip;
	}
	public void setSourceCityTrip(Set<Trip> sourceCityTrip) {
		this.sourceCityTrip = sourceCityTrip;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", createdBy=" + createdBy + ", createdAt=" + createdAt
				+ ", modifiedBy=" + modifiedBy + ", modifiedAt=" + modifiedAt + ", sourceCityTrip=" + sourceCityTrip
				+ ", destinationCityTrip=" + destinationCityTrip + "]";
	}
	
	

}
