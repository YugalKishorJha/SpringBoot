package com.SpringCore.DAO.NonPrimitive;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.SpringCore.DTO.NonPrimitive.Customer;
import com.SpringCore.DTO.NonPrimitive.Vendor;

public class VendorCustomerWithoutORHCandEquals {
	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("VendorAndCustomerBeanNO_HC_OR.xml");
		BeanFactory sc1 = new XmlBeanFactory(rsc);
		Vendor vr1 = (Vendor) sc1.getBean("v1");

		System.out.println(vr1.getName());
		vr1.getCs().forEach(emp -> System.out.println(emp.getName() + " " + emp.getCid() + " " + emp.getPhNo()));

		

		/*
		 * Set<Customer> ll = vr1.getCs();
		 Iterator<Customer> it = ll.iterator();
			while (it.hasNext()) {
			Customer cs = it.next();
			System.out.println(cs.getCid() + " " + cs.getName() + " " + cs.getPhNo());
								 }
		 */

	}

}
