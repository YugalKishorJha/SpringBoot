package com.SpringCore.IOC;

public class StudentWithStream {
	@Override
	public String toString() {
		return "StudentWithStream [id=" + id + ", name=" + name + ", st=" + st + "]";
	}

	int id;
	String name;
	Stream st;

	public StudentWithStream(int id, String name, Stream st) {
		super();
		this.id = id;
		this.name = name;
		this.st = st;
	}

}
