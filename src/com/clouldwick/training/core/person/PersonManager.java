package com.clouldwick.training.core.person;

import com.clouldwick.training.core.user.AdminUser;
import com.clouldwick.training.core.user.UserManager;

public class PersonManager {

	public static void main(String args[]) {

		UserManager userObj = new UserManager();
		userObj.firstName = "s";
		userObj.setName("Swap");
		int sum = userObj.calculate(12, 32);
		System.out.println("Value of sum: " + sum);
		System.out.println("State: " + UserManager.state);
		System.out.println(userObj);
		System.out.println(new Integer(24));
		int i2 = 24;
		int j2 = 33;

		if (i2 == j2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		UserManager userObj2 = new UserManager();

		if (userObj == userObj2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		String s1 = "fremont";
		String s2 = "Fremont";

		if (s1.equals(s2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		AdminUser objAdmin = new AdminUser();
		System.out.println(objAdmin.calculate(10, 20));

		// AdminUser objAdmin2 = new UserManager();

		objAdmin.printData();

		UserManager obj8 = new AdminUser();

		System.out.println(obj8.getSsn());

		// UserI obj9 = new UserI();

		System.out.println("Multiplication:"+objAdmin.calculate(23, 21, 2));
		
		System.out.println("State:"+objAdmin.getState());
		
		objAdmin.printResult();
		
		System.out.println(objAdmin);

	}

}
