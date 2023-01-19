package com.SpringCore.DTO.NonPrimitive;

import java.util.Set;

public class Vendor {
	String name;
	Set<Customer> cs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Customer> getCs() {
		return cs;
	}

	public void setCs(Set<Customer> cs) {
		this.cs = cs;
	}

}
