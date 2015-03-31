package com.cloudwick.training.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONExample {

	private static void createJSON() throws IOException {
		JSONObject jo = new JSONObject();
		jo.put("name", "swapnesh");
		jo.put("age", "24");

		JSONArray arr = new JSONArray();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("vvv");

		jo.put("msg", arr);

		FileWriter fw = new FileWriter("myjson.json");
		fw.write(jo.toJSONString());
		fw.flush();
		fw.close();

	}

	private static void readJSON() throws IOException, ParseException {

		FileReader fr = new FileReader("myjson.json");
		JSONParser jp = new JSONParser();
		Object obj = jp.parse(fr);
		JSONObject jobj = (JSONObject) obj;

		System.out.println(jobj.get("name"));
		System.out.println(jobj.get("age"));

		JSONArray arr = (JSONArray) jobj.get("msg");

		for (Object m : arr) {
			System.out.println((String) m);
		}
	}

	public static void main(String[] args) throws IOException, ParseException {
		createJSON();
		readJSON();
	}

}
