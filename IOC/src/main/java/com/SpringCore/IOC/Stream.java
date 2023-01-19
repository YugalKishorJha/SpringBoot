package com.SpringCore.IOC;

public class Stream {
	String course1;
	String course2;
	String course3;

	public Stream(String course1, String course2, String course3) {
		super();
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
	}

	@Override
	public String toString() {
		return "Stream [course1=" + course1 + ", course2=" + course2 + ", course3=" + course3 + "]";
	}

}
