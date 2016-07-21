package model;

public class Travels {
	private int id;
	private String name;
	private String address;
	private double contactNumber;
	
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
	@Override
	public String toString() {
		return "Travels [id=" + id + ", name=" + name + ", address=" + address + ", contactNumber=" + contactNumber
				+ "]";
	}

}
