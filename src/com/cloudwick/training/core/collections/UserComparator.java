package com.cloudwick.training.core.collections;

import java.util.Comparator;

public class UserComparator implements Comparator<UserSort> {

	@Override
	public int compare(UserSort o1, UserSort o2) {

		return o1.ssn - o2.ssn;
	}

}
