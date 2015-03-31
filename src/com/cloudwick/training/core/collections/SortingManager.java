package com.cloudwick.training.core.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingManager {

	private static void printResult(List alist) {
		Iterator it = alist.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static void main(String[] args) {
		List aList = new ArrayList<>();
		aList.add(1);
		aList.add(11);
		aList.add(11);
		aList.add(4);
		aList.add(2);

		printResult(aList);

		Collections.sort(aList);

		printResult(aList);
		
		List userList = new ArrayList<>(); 
		userList.add(new UserSort(111,"c"));
		userList.add(new UserSort(1,"s"));
		userList.add(new UserSort(20,"z"));
		userList.add(new UserSort(11,"a"));
		
		printResult(userList);
		
		Collections.sort(userList, new UserComparator());
		
		printResult(userList);
	}

}
