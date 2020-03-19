package com.common.examples.ex1_BasicParse;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * NodeType: 
 *   1. https://developer.mozilla.org/zh-TW/docs/Web/API/Node/nodeType
 *   2. https://www.w3schools.com/xml/dom_nodetype.asp
 *   3. http://xahlee.info/js/js_get_node_info.html
 * System property:
 *   1. https://jax-work-archive.blogspot.com/2015/02/java-system-property.html
 * 
 * */

public class ex1_BasicParseDemo {

	public static void main(String[] args) {
		try {
			String fileName = System.getProperty("user.dir") + File.separator + "data/test1.xml";
			File xmlFile = new File(fileName);

			System.out.println("fileName: " + fileName);
			System.out.println("xmlFile: " + xmlFile);

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
			
			NodeList nodeList = doc.getElementsByTagName("staff");
			
			System.out.println("---------------------------------------------------");
			
			for(int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				
				System.out.println("\nCurrent Element : " + node.getNodeName());
				
				if(node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					
					System.out.println("Staff id : " + element.getAttribute("id"));
                    System.out.println("First Name : " + element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name : " + element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Nick Name : " + element.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("Salary : " + element.getElementsByTagName("salary").item(0).getTextContent());
				}
				
			}
			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
