package com.SpringCore.DTO.NonPrimitive;

import java.util.Set;

public class VendorForCustomerOR_HC_Eq {
	String name;
	Set<CustomerWithORHC> cs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<CustomerWithORHC> getCs() {
		return cs;
	}

	public void setCs(Set<CustomerWithORHC> cs) {
		this.cs = cs;
	}

}
