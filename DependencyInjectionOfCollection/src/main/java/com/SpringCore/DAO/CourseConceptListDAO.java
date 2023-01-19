package com.SpringCore.DAO;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;

import com.SpringCore.DTO.Course;

public class CourseConceptListDAO {
	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("courseBeanList.xml");
		BeanFactory spcon1 = new XmlBeanFactory(rsc);
		Course bean = (Course)spcon1.getBean("co2");
		System.out.println(bean.getFees()+" "+bean.getName()+" "+bean.getConcepts());
	}

}
