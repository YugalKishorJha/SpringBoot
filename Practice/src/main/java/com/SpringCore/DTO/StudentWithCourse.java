package com.SpringCore.DTO;

public class StudentWithCourse {
	int id;
	String name;
	Course c;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setC(Course c) {
		this.c = c;
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.c;
	}

}
