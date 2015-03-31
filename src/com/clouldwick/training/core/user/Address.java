package com.clouldwick.training.core.user;

import javax.management.InstanceAlreadyExistsException;

public class Address {

	// simple java beans.
	private int age;
	private String firstName;

	// accessors
	public int getAge() {
		return age;
	}

	// mutators
	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean equals(Object other) {

		if (other == null) {
			return false;
		}

		if (!(other instanceof Address)) {
			return false;
		}

		Address addObj = (Address) other;

		return this.getAge() == addObj.getAge()
				&& this.getFirstName().equals((addObj).getFirstName());
	}

	public int hashCode() {
		int hash = 34;

		hash += getAge();
		hash += getFirstName() == null ? 0 : getFirstName().hashCode();

		return hash;

	}
}
