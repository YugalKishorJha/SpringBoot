package com.SpringCore.DAO;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.DTO.Employee;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext sp1 = new ClassPathXmlApplicationContext("TestXml1.xml");
		Employee e = (Employee) sp1.getBean("e1");
		System.out.println(e.getId()+" "+e.getName()+" "+e.getAd());
		sp1.close();

	}
}
