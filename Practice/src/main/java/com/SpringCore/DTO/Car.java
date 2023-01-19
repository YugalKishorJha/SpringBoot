package com.SpringCore.DTO;

public class Car implements Vehicle {
	int capacity;

	public void move() {
		System.out.println(this.capacity);
		System.out.println("I am travelling by using Car");
	}

	public String toString() {
		return this.capacity + "";// needed to change to string because of the return type
	}

	public void setCapacity(int ca) {
		capacity = ca;
	}

}
