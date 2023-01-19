package com.SpringCore.DTO.NonPrimitive;

import java.util.Objects;

public class CustomerWithORHC {
	int cid;
	String cname;
	long phNo;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerWithORHC other = (CustomerWithORHC) obj;
		return cid == other.cid;
	}
}
