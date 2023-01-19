package com.SpringCore.DTO;

import java.util.Map;

public class College {
	String cname;
	Map<Integer, String> studentdata;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Map<Integer, String> getStudentdata() {
		return studentdata;
	}

	public void setStudentdata(Map<Integer, String> studentdata) {
		this.studentdata = studentdata;
	}

}
