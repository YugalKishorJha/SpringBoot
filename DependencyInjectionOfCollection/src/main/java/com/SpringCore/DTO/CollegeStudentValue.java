package com.SpringCore.DTO;

import java.util.Map;

public class CollegeStudentValue {
	String name;
	Map<Integer, Student> studentData;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, Student> getStudentData() {
		return studentData;
	}

	public void setStudentData(Map<Integer, Student> studentData) {
		this.studentData = studentData;
	}

}
