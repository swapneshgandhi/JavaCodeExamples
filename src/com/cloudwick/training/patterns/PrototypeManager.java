package com.cloudwick.training.patterns;

public class PrototypeManager {

	public static void main(String[] args) throws CloneNotSupportedException {

		UserClone u = new UserClone();
		u.setSsn(1);
		UserClone u2 = (UserClone) u.clone();
		System.out.println(u2.getSsn());

		ConnectionManager.getObject().name = "fremont";
		
		System.out.println("Name is "+ConnectionManager.getObject().name);
		
		CloudwickGeneralUser gu = new CloudwickGeneralUser();
		CloudwickAdminUser au = new CloudwickAdminUser();
		
		gu.authenticate();
		au.authenticate();
		
	}

}
