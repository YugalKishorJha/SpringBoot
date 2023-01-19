package com.SpringCore.DAO;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.SpringCore.DTO.Travel;

public class VehicleAndTravel {
	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("VehicleBean.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);

		Resource rsc1 = new ClassPathResource("TravelBean.xml");
		BeanFactory factory1 = new XmlBeanFactory(rsc1, factory);

		Travel t1 = (Travel) factory1.getBean("travel1");
		t1.startJourney();
	}
}
