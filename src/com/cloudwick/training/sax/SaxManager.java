package com.cloudwick.training.sax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.cloudwick.training.dom.PersonDom;
import com.cloudwick.training.dom.UserDom;

public class SaxManager extends DefaultHandler {

	private PersonDom pdom;
	private List<UserDom> userList;
	private UserDom userObj;
	private String data;

	public void startElement(String uri, String localName, String qName,
			Attributes atr) {

		if (qName.equals("person")) {
			pdom = new PersonDom();
			userList = new ArrayList<>();
		}

		if (qName.equals("user")) {
			userObj = new UserDom();
			userObj.setId(Integer.parseInt(atr.getValue("id")));
		}

	}

	public void characters(char[] ch, int start, int length) {
		data = new String(ch, start, length);

	}

	public void endElement(String uri, String localName, String qName) {

		if (qName.equals("username")) {
			userObj.setName(data);
		} else if (qName.equals("password")) {
			userObj.setPassword(data);
		} else if (qName.equals("city")) {
			userObj.setCity(data);
		} else if (qName.equals("user")) {
			userList.add(userObj);
		} else if (qName.equals("person")) {
			pdom.setUserList(userList);
		}
	}

	private void printResult() {
		for (UserDom u : pdom.getUserList()) {
			System.out.println(u.getId() + " " + u.getName() + " "
					+ u.getPassword() + " " + u.getPassword());
		}
	}

	private void parseXml(String fileName) throws ParserConfigurationException,
			SAXException, IOException {

		SAXParserFactory saf = SAXParserFactory.newInstance();

		SAXParser parser = saf.newSAXParser();

		parser.parse(fileName, this);
	}

	public static void main() throws ParserConfigurationException,
			SAXException, IOException {

		SaxManager sm = new SaxManager();

		sm.parseXml("person.xml");

		sm.printResult();
	}

}
