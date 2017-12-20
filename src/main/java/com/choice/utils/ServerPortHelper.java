package com.choice.utils;

import org.choice.dom4j.Document;
import org.choice.dom4j.DocumentException;
import org.choice.dom4j.Element;
import org.choice.dom4j.io.SAXReader;
import util.XmlToHtmlJs;
import java.io.InputStream;

public class ServerPortHelper {
	private static String ip;
	private static String port;
	static 
	{
		try {
			SAXReader reader = new SAXReader();
			InputStream inputStream = Object.class.getResourceAsStream("/ChoiceNavigation.xml");
			XmlToHtmlJs.initSystem();
			Document document = reader.read(inputStream);
			Element ipElement = (Element) document.selectNodes("/steps/ip").get(0);
			Element portElement = (Element) document.selectNodes("/steps/port").get(0);
			ip = ipElement.getText();
			port = portElement.getText();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	public static String getIp() {
		return ip;
	}

	public static String getPort() {
		return port;
	}

	public static void main(String[] args) {//输出测试

//		System.out.println(ServerPortHelper.getIp());
//		System.out.println(ServerPortHelper.getPort());
//		System.out.println("hah");
	}
}
