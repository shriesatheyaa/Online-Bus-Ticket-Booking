package model;

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
	@Override
	public String toString() {
		return "Bus [id=" + id + ", registrationNumber=" + registrationNumber + ", travelsId=" + travelsId + ", type="
				+ type + ", isAc=" + isAc + ", totalNumberOfSeats=" + totalNumberOfSeats + "]";
	}
	
}
