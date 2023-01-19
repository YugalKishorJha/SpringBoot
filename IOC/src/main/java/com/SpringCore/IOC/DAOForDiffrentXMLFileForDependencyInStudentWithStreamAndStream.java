package com.SpringCore.IOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DAOForDiffrentXMLFileForDependencyInStudentWithStreamAndStream {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("StreamDependencyInDifferentFile.xml");
		BeanFactory fact1 = new XmlBeanFactory(rsc);

		Resource rsc1 = new ClassPathResource("CompostionDiffrentChildAndParentDI.xml");
		BeanFactory fact2 = new XmlBeanFactory(rsc1, fact1);
		// passing the spring container of ADDRESS as well in the spring container of
		// Employee

		StudentWithStream s = (StudentWithStream) fact2.getBean("FirstStudent");
		System.out.println(s);
	}


}
