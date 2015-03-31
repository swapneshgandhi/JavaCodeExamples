package com.cloudwick.training.patterns;

public class UserFactory {

	public static UserI getObject(int type) {

		UserI obj = null;

		if (type == 1) {
			obj = new AdminUser();
		} else {
			obj = new SuperUser();
		}
		return obj;
	}

}
