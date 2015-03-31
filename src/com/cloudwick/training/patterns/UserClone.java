package com.cloudwick.training.patterns;

public class UserClone implements Cloneable {

	private int ssn;
	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();

	}

}
