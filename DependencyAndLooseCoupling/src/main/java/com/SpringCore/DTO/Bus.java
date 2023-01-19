package com.SpringCore.DTO;

public class Bus implements Vehicle {
	@Override
	public String toString() {
		return "Bus [passCap=" + passCap + "]";
	}

	int passCap;

	public void move() {
		System.out.println("The passanger capacity is" + passCap);
		System.out.println("We are travelling through Bus");
	}

	public void setPassCap(int passCap) {// setter for setting the value of field
		this.passCap = passCap;
	}

	
	//mistake here the methods should be public because need to access in different packages
}
