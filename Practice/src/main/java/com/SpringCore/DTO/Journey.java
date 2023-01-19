package com.SpringCore.DTO;

public class Journey implements Travel {

	Vehicle v;

	public void startJourney() {
		v.move();
	}

	public void setV(Vehicle v) {
		this.v = v;
	}
	
	@Override
	public String toString() {
		return this.v + "";
	}

}
