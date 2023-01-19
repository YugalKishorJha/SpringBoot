package com.SpringCore.DTO;

public class Bus implements Vehicle {
	int capacity;

	public void move() {
		System.out.println(this.capacity);
		System.out.println("I am travelling by using Bus");
	}

	public String toString() {
		return this.capacity + "";
	}
}
