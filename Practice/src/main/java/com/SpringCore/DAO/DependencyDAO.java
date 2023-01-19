package com.SpringCore.DAO;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.SpringCore.DTO.StudentWithCourse;

public class DependencyDAO {

	public static void main(String[] args) {
		Resource res1 = new ClassPathResource("CourseBean.xml");
		BeanFactory spCon1 = new XmlBeanFactory(res1);

		Resource res2 = new ClassPathResource("StudentBean.xml");
		BeanFactory spCon2 = new XmlBeanFactory(res2, spCon1);

		StudentWithCourse s1 = (StudentWithCourse) spCon2.getBean("firstStudent");
		System.out.println(s1);

	}

}
