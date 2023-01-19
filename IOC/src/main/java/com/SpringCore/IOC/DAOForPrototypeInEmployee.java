package com.SpringCore.IOC;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAOForPrototypeInEmployee {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("BreakingSingletonInSpringContainerScope.xml");
		Employee e=(Employee)factory.getBean("FirstEmployee");
		Employee e1=(Employee)factory.getBean("FirstEmployee");
		
		
		System.out.println(e==e1);
		//as we have breaken the singleton scope of spring container
		//otherWise it will print true for single object scope
		factory.close();
	}
}
