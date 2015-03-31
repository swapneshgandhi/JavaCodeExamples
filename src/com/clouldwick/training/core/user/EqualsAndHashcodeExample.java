package com.clouldwick.training.core.user;

public class EqualsAndHashcodeExample {

	public static void main(String[] args) {

		Address addressObj = new Address();
		addressObj.setAge(21);
		addressObj.setFirstName("Swapnesh");

		Address addressObj2 = new Address();
		addressObj2.setAge(21);
		addressObj2.setFirstName("Swapnesh");

		if (addressObj.equals(addressObj2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		if (addressObj.getAge() == addressObj2.getAge()
				&& addressObj.getFirstName().equals(addressObj2.getFirstName())) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

	}

}
