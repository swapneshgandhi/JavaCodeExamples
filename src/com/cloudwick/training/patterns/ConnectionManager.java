package com.cloudwick.training.patterns;

public class ConnectionManager {

	private static ConnectionManager obj;
	
	public String name;

	private ConnectionManager() {

	}

	public static synchronized ConnectionManager getObject() {

		if (obj == null) {
			obj = new ConnectionManager();
		}
		return obj;

	}

}
