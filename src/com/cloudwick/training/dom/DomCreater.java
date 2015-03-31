package com.cloudwick.training.dom;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class DomCreater {

	private static Document doc;

	private static PersonDom pdom;

	private static void populate() {

		pdom = new PersonDom();
		List<UserDom> userList = new ArrayList<>();

		UserDom udom = new UserDom();

		udom.setId(1);
		udom.setName("swap");
		udom.setPassword("sss");
		udom.setCity("fre");
		userList.add(udom);

		udom = new UserDom();
		udom.setId(2);
		udom.setName("swapnesh");
		udom.setPassword("ggggg");
		udom.setCity("mont");
		userList.add(udom);
		pdom.setUserList(userList);
	}

	private static void createDocument() throws ParserConfigurationException {
		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();

		DocumentBuilder db = fac.newDocumentBuilder();

		doc = db.newDocument();
	}

	private static void createDom() {
		Element rootEl = doc.createElement("person");
		doc.appendChild(rootEl);

		Iterator<UserDom> it = pdom.getUserList().iterator();

		while (it.hasNext()) {

			UserDom obj = it.next();

			Element uEle = doc.createElement("user");

			uEle.setAttribute("id", String.valueOf(obj.getId()));

			Element eU = doc.createElement("username");
			Text tName = doc.createTextNode(obj.getName());
			eU.appendChild(tName);
			uEle.appendChild(eU);

			Element eP = doc.createElement("password");
			Text tPass = doc.createTextNode(obj.getPassword());
			eP.appendChild(tPass);
			uEle.appendChild(eP);

			Element eC = doc.createElement("city");
			Text tCity = doc.createTextNode(obj.getCity());
			eC.appendChild(tCity);
			uEle.appendChild(eC);

			rootEl.appendChild(uEle);

		}
	}

	private static void writeXml() throws IOException {
		OutputFormat out = new OutputFormat();
		out.setIndenting(true);
		XMLSerializer xs = new XMLSerializer(new FileOutputStream(
				"myperson.xml"), out);
		xs.serialize(doc);

	}

	public static void main(String[] args) throws ParserConfigurationException, IOException {

		populate();
		createDocument();
		createDom();
		writeXml();
	}

}
