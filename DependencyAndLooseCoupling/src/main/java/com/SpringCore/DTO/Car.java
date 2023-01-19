package com.SpringCore.DTO;

public class Car implements Vehicle {
	int passCap;

	@Override
	public String toString() {
		return "Car [passCap=" + passCap + "]";
	}

	public void move() {
		System.out.println("The passanger capacity is" + passCap);
		System.out.println("We are travelling through car");
	}

	public int getPassCap() {
		return passCap;
	}

	public void setPassCap(int passCap) {
		this.passCap = passCap;
	}

	//mistake here the methods should be public because need to access in different packages

	
}
