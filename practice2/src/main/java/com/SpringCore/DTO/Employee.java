package com.SpringCore.DTO;

public class Employee {
	int id;
	String name;
	Address ad;

	public Employee(int id, String name, Address ad) {
		this.id = id;
		this.name = name;
		this.ad=ad;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	public Address getAd() {
		return this.ad;
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.ad;
	}

}
