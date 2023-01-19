package com.SpringCore.DTO;

import java.util.Set;

public class Course {
	String name;
	double fees;
	Set concepts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Set getConcepts() {
		return concepts;
	}

	public void setConcepts(Set concepts) {
		this.concepts = concepts;
	}

}
