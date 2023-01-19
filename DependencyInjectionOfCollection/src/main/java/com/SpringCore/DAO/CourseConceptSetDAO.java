package com.SpringCore.DAO;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.SpringCore.DTO.Course;

public class CourseConceptSetDAO {
	public static void main(String[] args) {
		Resource res1 = new ClassPathResource("courseBeanSet.xml");
		BeanFactory spCon1 = new XmlBeanFactory(res1);

		Course bean = (Course) spCon1.getBean("co1");
		System.out.println(bean.getConcepts()+" "+bean.getName()+" "+bean.getFees());

	}
}
