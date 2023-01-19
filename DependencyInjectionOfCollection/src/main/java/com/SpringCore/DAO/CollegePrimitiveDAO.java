package com.SpringCore.DAO;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.DTO.College;

public class CollegePrimitiveDAO {
	public static void main(String[] args) {
		AbstractApplicationContext sp1 = new ClassPathXmlApplicationContext("CollegeAndStudent.xml");
		College cr1 = (College) sp1.getBean("c1");
		System.out.println(cr1.getCname());
		
		cr1.getStudentdata().forEach((key,value)->System.out.println(key+" "+value));
		/*
		 * Map<Integer, String> std = cr1.getStudentdata(); Set<Entry<Integer, String>>
		 * se=std.entrySet();
		 * 
		 * for (Entry<Integer, String> entry : se) { System.out.println(entry); }
		 */

	}
}
