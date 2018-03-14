package com.tong.dom;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class DOM4JTest {
	public static void main(String[] args) {
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read("Student.xml");
			// 得到根节点
			Element ele = document.getRootElement();
			getChild(ele);

		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 有时候节点下不一定存在子节点
	 */
	public static void getChild(Element ele) {
		List<Element> list = ele.elements();// 得到子节点
		// 判断是否存在子节点
		if (list.size() > 0) {
			for (Element element : list) {
				getChild(element);
			}
		} else {
			String str = ele.getName();//节点名称
			String value = ele.getText();//节点值
			System.out.println(str + ":" + value);
		}
	}
}
