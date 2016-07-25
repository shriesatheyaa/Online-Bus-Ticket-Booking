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
<<<<<<< HEAD
	private Set<Trip> tripes = new HashSet<Trip>();
=======
	private Set<Trip> sourceCityTrip = new HashSet<Trip>();
	private Set<Trip> destinationCityTrip = new HashSet<Trip>();
	
	public City() {
		
	}
>>>>>>> 6e56c1f9d16d89169f90a94307a5b85e3312ead3
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
	public Set<Trip> getTripes() {
		return tripes;
	}
	public void setTripes(Set<Trip> tripes) {
		this.tripes = tripes;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + "]";
	}
	
	

}
