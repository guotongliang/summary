package com.tong.dom;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXTest {
	public static void main(String[] args) {
		//创建解析工厂对象
		SAXParserFactory factory = SAXParserFactory.newInstance(); 
		try {
			//由解析工厂创建解析类
			SAXParser par = factory.newSAXParser();
			//par.parse("Student.xml", new MyHandle());
			//可以用一个匿名内部类的方法替代上述
			par.parse("Student.xml", new DefaultHandler(){
				@Override
				public void endDocument() throws SAXException {
					System.out.println("解析结束");
				}

				@Override
				public void endElement(String uri, String localName, String qName) throws SAXException {
					System.out.println(qName+"解析结束");
				}

				@Override
				public void startDocument() throws SAXException {
					System.out.println("开始解析");
				}

				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
					System.out.println("节点名称："+qName);
					for (int i = 0; i < attributes.getLength(); i++) {
						System.out.println(attributes.getQName(i)+"---"+attributes.getValue(i));
					}
				}
			});
			
		} catch (ParserConfigurationException | SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
