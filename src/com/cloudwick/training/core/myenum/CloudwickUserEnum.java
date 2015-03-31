package com.cloudwick.training.core.myenum;

public enum CloudwickUserEnum {

	Admin (2,"Read","CA"),
	General (12,"Read","TX"),
	Super (1,"Write", "NY");
	
	private int id;
	private String access;
	private String state;
	
	private CloudwickUserEnum(int id, String access, String state){
		this.id=id;
		this.access=access;
		this.state=state;
	}

	public int getId() {
		return id;
	}

	public String getAccess() {
		return access;
	}

	public String getState() {
		return state;
	}
	
	public void printData(){
		System.out.println("Calculating taxes for: "+this.state);
	}
	
}
