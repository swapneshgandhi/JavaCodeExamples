package com.cloudwick.training.core.io;

// marker interface - no methods
//this is a signal to jvm to convert its state to stream of bytes
import java.io.Serializable;

public class UserSerialize implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient String ssn;
	private String name;

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
