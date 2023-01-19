package com.SpringCore.DAO;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.SpringCore.DTO.Journey;

public class JourneyAndVehicle {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("VehicleBean.xml");
		BeanFactory springContainer1 = new XmlBeanFactory(rsc);

		Resource rsc1 = new ClassPathResource("JourneyBean.xml");
		BeanFactory springContainer2 = new XmlBeanFactory(rsc1, springContainer1);

		Journey j =(Journey) springContainer2.getBean("jor1");
		j.startJourney();
	}

}
