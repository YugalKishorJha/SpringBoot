package com.SpringCore.DTO;

public class Travel implements Journey {

	public Vehicle v;

	@Override
	public String toString() {
		return "Travel [v=" + v + "]";
	}

	public void startJourney() {
		v.move();
	}

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

}
