package com.common.examples.ex2_ParseFromString;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ex2_ParseFromStringDemo {
	private String fileName;
	private String content;
	private List<String> patternList;

	public ex2_ParseFromStringDemo(String fileName) {
		this.fileName = fileName;
		this.content = ex2_ParseFromStringDemo.readAsStringFromFile(fileName);
		this.patternList = ex2_ParseFromStringDemo.parseBurstPattern(this.content, "Instruction");
		
		System.out.println("patternList: \n" + patternList);
		System.out.println("----------------------------------------------");
		
	}

	static String readAsStringFromFile(String fileName) {
		String content = null;
		FileInputStream fis = null;
		ByteArrayOutputStream byteArrayOutputStream = null;
		try {
			File file = new File(fileName);
			fis = new FileInputStream(file);
			byteArrayOutputStream = new ByteArrayOutputStream();

			int c = 0;
			while( ( c=fis.read() ) != -1) {
				byteArrayOutputStream.write(c);
			}
			content = new String(byteArrayOutputStream.toByteArray());

		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			// finally release resource
			try {
				fis.close();
				byteArrayOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return content;
	}

	static ArrayList<String> parseBurstPattern(String patFile_str, String tagName){
		ArrayList<String> patternList = new ArrayList<>();

		System.out.println("patFile_str: \n" + patFile_str);
		System.out.println("----------------------------------------------");
		
		try {
			InputSource inputSource = new InputSource(new StringReader(patFile_str));
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputSource);
			
			doc.getDocumentElement().normalize();
			
			NodeList nodes = doc.getElementsByTagName(tagName);
			
			for(int i=0; i<nodes.getLength(); i++){
	            Node node = nodes.item(i);
	            System.out.println("\nCurrent Element: " + node.getNodeName());
	            if (node.getNodeType() == Node.ELEMENT_NODE) {

	                Element element = (Element) node;
	                String id = element.getAttribute("id");
	                String value = element.getAttribute("value");
	                System.out.println(tagName + " id : " + id);
	                System.out.println(tagName + " value : " + value);

	                if(id.equals("patternCall")){
	                    patternList.add(value);
	                }

	            }
	        }
			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		finally {

		}

		return patternList;
	}

	public static void main(String[] args) {
		ex2_ParseFromStringDemo obj = new ex2_ParseFromStringDemo( System.getProperty("user.dir") + File.separator + "data/Program.sprg" );


	}

	public String getContent() {
		return content;
	}

}
