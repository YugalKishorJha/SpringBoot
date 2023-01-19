
package com.SpringCore.IOC;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAOStudentThroughSetterAndConstructor {
	public static void main(String[] args) {
		/* IOC using setter  */
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("StudentBean.xml");
		Student sg1 = (Student) factory.getBean("FirstStudent");
		System.out.println(sg1.getSid() + " " + sg1.getSname() + " " + sg1.getSper());

		Student sg2 = (Student) factory.getBean("SecondStudent");
		System.out.println(sg2.getSid() + " " + sg2.getSname() + " " + sg2.getSper());

		/* IOC using Constructor */
		AbstractApplicationContext factory1 = new ClassPathXmlApplicationContext("ConstuctorInjectionForStudent.xml");
		Student sc1 = (Student) factory1.getBean("FirstStudent");
		System.out.println(sc1.getSid() + " " + sc1.getSname() + " " + sc1.getSper());
		
		/* Dependency Injection  and IOC using Constructor  */
		AbstractApplicationContext factory2 = new ClassPathXmlApplicationContext("DependencyInjectionThroughConstructor.xml");
		StudentWithStream sc2 = (StudentWithStream) factory2.getBean("FirstStudent");
		System.out.println(sc2);
		
		factory.close();
		factory1.close();
		factory2.close();
	}
}
