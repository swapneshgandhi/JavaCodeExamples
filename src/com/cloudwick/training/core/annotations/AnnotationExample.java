package com.cloudwick.training.core.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationExample {

	public static void main(String[] args) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		UserAnnotaion objAnn = new UserAnnotaion();

		Method methods[] = objAnn.getClass().getMethods();

		for (Method m : methods) {
			LogMessage log = m.getAnnotation(LogMessage.class);

			if (log != null) {
				String name = m.getName();

				if (name.equals("printData")) {
					m.invoke(objAnn);
				} else {
					System.out.println(m.invoke(objAnn, 32, 32));
				}
			}
		}
	}
}
