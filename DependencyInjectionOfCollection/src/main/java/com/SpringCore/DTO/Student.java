package com.SpringCore.DTO;

public class Student {
	String name;
	double perc;

	@Override
	public String toString() {
		return "Student [name=" + name + ", perc=" + perc + "]";
	}

	Student(String name, double perc) {
		this.name = name;
		this.perc = perc;
	}

}
