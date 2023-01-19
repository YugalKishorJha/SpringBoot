package com.SpringCore.DAO;

import java.util.*;
import java.util.Map.Entry;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.DTO.CollegeStudentValue;
import com.SpringCore.DTO.Student;

public class CollegeStudentDAO {

	public static void main(String[] args) {
		AbstractApplicationContext sp1 = new ClassPathXmlApplicationContext(
				"CollegeAndStudentWithStudentObjectAsValue.xml");
		CollegeStudentValue bean = (CollegeStudentValue) sp1.getBean("c1");
		System.out.println(bean.getName());
		Map<Integer, Student> std = bean.getStudentData();

		Set<Map.Entry<Integer, Student>> entry = std.entrySet();
		for (Map.Entry e : entry) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
