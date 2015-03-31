package com.cloudwick.training.dom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomManager {

	private static Document doc;
	private static PersonDom persondom;

	private static void parseXml(String fileName)
			throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();

		DocumentBuilder db = fac.newDocumentBuilder();

		doc = db.parse(fileName);

	}

	private static void processDocument() {
		Element rootEle = doc.getDocumentElement();

		NodeList users = rootEle.getElementsByTagName("user");

		List<UserDom> userList = new ArrayList<>();

		persondom = new PersonDom();

		for (int i = 0; i < users.getLength(); i++) {
			Element ele = (Element) users.item(i);
			UserDom udom = new UserDom();

			// values of ID
			udom.setId(Integer.parseInt(ele.getAttribute("id")));

			// values of username
			NodeList usernames = ele.getElementsByTagName("username");
			Element usernameEle = (Element) usernames.item(0);
			udom.setName(usernameEle.getFirstChild().getNodeValue());

			// values of username
			NodeList passwords = ele.getElementsByTagName("password");
			Element passwordsEle = (Element) passwords.item(0);
			udom.setPassword(passwordsEle.getFirstChild().getNodeValue());

			NodeList cities = ele.getElementsByTagName("city");
			Element citiesEle = (Element) cities.item(0);
			udom.setCity(citiesEle.getFirstChild().getNodeValue());

			userList.add(udom);
		}
		persondom.setUserList(userList);
	}

	private static void printResult() {
		for (UserDom u : persondom.getUserList()) {
			System.out.println(u.getId() + " " + u.getName() + " "
					+ u.getPassword() + " " + u.getPassword());
		}
	}

	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {

		parseXml("person.xml");
		processDocument();
		
		printResult();

	}

}
