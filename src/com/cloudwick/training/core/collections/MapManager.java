package com.cloudwick.training.core.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapManager {

	static Map<Integer, String> dataMap = new HashMap<>();

	private static void getMyKeys() {

		Set<Integer> keys = dataMap.keySet();

		Iterator<Integer> it = keys.iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + ":" + dataMap.get(key));
		//	it.remove();
		}
	}

	private static void getEntrySet(){
		Set <Entry<Integer,String>> entrySet = dataMap.entrySet();
		
		Iterator <Entry<Integer,String>> it = entrySet.iterator();
		
		while (it.hasNext()){
			Entry<Integer, String> etr = it.next();
			
			System.out.println(etr.getKey()+":"+etr.getValue());
			
		}
		
		
	}

	public static void main(String[] args) {

		dataMap.put(12, "g");
		dataMap.put(12, "M");
		dataMap.put(11, "s");
		dataMap.put(null, null);
		getMyKeys();
		getEntrySet();
	}

}
