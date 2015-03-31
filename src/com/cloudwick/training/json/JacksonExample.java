package com.cloudwick.training.json;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonExample {

	public static void main(String[] args) throws JsonParseException,
			JsonMappingException, IOException {

		ObjectMapper objMapper = new ObjectMapper();

		UserJSON userJson = new UserJSON();

		userJson = objMapper.readValue(new File("myjson.json"), UserJSON.class);

		System.out.println(userJson.getName());
		System.out.println(userJson.getAge());

		for (Object m : userJson.getMsg()) {
			System.out.println((String) m);
		}

	}

}
