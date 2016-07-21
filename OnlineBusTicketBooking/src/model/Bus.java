package model;

public class Bus {
	private int id;
	private String registrationNumber;
	private Travels travelsId;
	private String  type;
	private Boolean isAc;
	private int totalNumberOfSeats;
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
	@Override
	public String toString() {
		return "Bus [id=" + id + ", registrationNumber=" + registrationNumber + ", travelsId=" + travelsId + ", type="
				+ type + ", isAc=" + isAc + ", totalNumberOfSeats=" + totalNumberOfSeats + "]";
	}

}
