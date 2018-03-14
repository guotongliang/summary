package com.tong.dom;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandle extends DefaultHandler{

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
}
