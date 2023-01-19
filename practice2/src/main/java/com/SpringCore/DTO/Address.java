package com.SpringCore.DTO;

public class Address {
	int sector;
	String city;

	public Address(int sector, String city) {
		this.sector = sector;
		this.city = city;
	}
	

	public void setSector(int sector) {
		this.sector = sector;
	}

	public int getSector() {
		return this.sector;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

	public String toString() {
		return this.sector + " " + this.city;
	}
}
