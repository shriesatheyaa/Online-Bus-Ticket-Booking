package model;

import java.util.Set;
import java.util.HashSet;
import java.sql.Time;

/*
 * Travels Model Object.
 * <P>Contains various attributes of Travels and their getter setters.</p>
 * 
 * @author Anupriya-Ideas2It
 * @version 1.0
 */
public class Travels {
	private int id;
	private String name;
	private String address;
	private double contactNumber;
	private User createdBy;
	private Time createdAt;
	private User modifiedBy;
	private Time modifiedAt; 
	private Set<Bus> buses = new HashSet<Bus>();
    
	public Travels() {
		
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(double contactNumber) {
		this.contactNumber = contactNumber;
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
	public Set<Bus> getBuses() {
		return buses;
	}
	public void setBuses(Set<Bus> buses) {
		this.buses = buses;
	}
	@Override
	public String toString() {
		return "Travels [id=" + id + ", name=" + name + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", createdBy=" + createdBy + ", createdAt=" + createdAt + ", modifiedBy=" + modifiedBy
				+ ", modifiedAt=" + modifiedAt + ", buses=" + buses + "]";
	}
	

}
