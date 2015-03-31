package com.cloudwick.training.core.collections;

public class UserSort implements Comparable<UserSort>{

	public int ssn;
	public String name;

	public UserSort(int ssn, String name) {

		this.ssn = ssn;
		this.name = name;
		
	}

	@Override
	public int compareTo(UserSort o) {
		//ascending
		//return this.ssn - o.ssn;
		return name.compareTo(o.name);
	}
	
	public String toString(){
		return this.ssn +" "+this.name;
	}
	

}
