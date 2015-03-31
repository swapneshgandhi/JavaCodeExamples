package com.cloudwick.training.core.myenum;

public class EnumExample {

	public static void main(String[] args) {

		// tightly coupled approach
		System.out.println(CloudwickUserEnum.Admin.getAccess());
		CloudwickUserEnum.General.printData();

		//not tightly coupled, as whatever's present in enums will be used.
		for (CloudwickUserEnum e : CloudwickUserEnum.values()) {
			System.out.println(e.getId());
			System.out.println(e.getAccess());
			System.out.println(e.getState());
		}

	}
}
