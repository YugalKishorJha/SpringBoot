package com.SpringCore.IOC;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAOToCheckDefaultSingltonOfSpringContainer {

	public static void main(String[] args) {

		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("StudentBean.xml");
		/***
		 * For single spring container creating multiple object with same content hence
		 * passing FirstStudent as ref
		 ***/
		Student st1 = (Student) factory.getBean("FirstStudent");
		Student st2 = (Student) factory.getBean("FirstStudent");
		System.out.println(st1 == st2);// true
		/*****
		 * Both the ref are pointing towards the same object hence by default the one
		 * single bean in beans tag is singleton with in one spring container context
		 ****/

		AbstractApplicationContext factory1 = new ClassPathXmlApplicationContext("StudentBean.xml");
		Student st3 = (Student) factory1.getBean("FirstStudent");

		/**
		 * two objects in two different spring container here both the objects will be
		 * pointing to two different object
		 */
		System.out.println(st1 == st3);// false

		factory.close();
		factory1.close();

	}

}
