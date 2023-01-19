package com.SpringCore.DAO.NonPrimitive;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.DTO.NonPrimitive.VendorForCustomerOR_HC_Eq;

public class VendorCustomerWithORHCandEquals {
	public static void main(String[] args) {
		AbstractApplicationContext sp1 = new ClassPathXmlApplicationContext("VendorAndCustomerBean_With_HC_OR.xml");
		VendorForCustomerOR_HC_Eq vr1 = (VendorForCustomerOR_HC_Eq) sp1.getBean("v1");
		System.out.println(vr1.getName());
		vr1.getCs().forEach((cs) -> System.out.println(cs.getCid() +" "+ cs.getCname() +" "+ cs.getPhNo()));
		sp1.close();
	}

}
