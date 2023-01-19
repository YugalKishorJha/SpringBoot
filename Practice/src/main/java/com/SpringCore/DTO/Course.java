package com.SpringCore.DTO;

public class Course {
	String course1;
	String course2;
	String course3;

	public void setCourse1(String course1) {
		this.course1 = course1;
	}

	public void setCourse2(String course2) {
		this.course2 = course2;
	}

	public void setCourse3(String course3) {
		this.course3 = course3;
	}

	public String toString() {
		return this.course1 + " " + this.course2 + " " + this.course3;
	}
}
