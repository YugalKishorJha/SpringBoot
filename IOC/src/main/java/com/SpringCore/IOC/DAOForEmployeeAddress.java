package com.SpringCore.IOC;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAOForEmployeeAddress {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("EmployeeAndAddressBean.xml");
		Employee e = (Employee) factory.getBean("FirstEmployee");
		System.out.println(e.getId() + " " + e.getName() + " " + e.getAdd());
		factory.close();
	}

}
