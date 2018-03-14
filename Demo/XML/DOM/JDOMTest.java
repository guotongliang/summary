package com.tong.dom;

import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class JDOMTest {
	public static void main(String[] args) {
		// 创建解析类
		SAXBuilder sax = new SAXBuilder();
		try {
			Document document = sax.build("Student.xml");
			// 得到根节点
			Element ele = document.getRootElement();
			List<Element> list = ele.getChildren();
			getNode(list);

		} catch (JDOMException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getNode(List<Element> list) {
		for (Element element : list) {
			System.out.println(element.getName() + "---" + element.getValue());
			List<Element> lis = element.getChildren();
			getNode(lis);
		}
	}
}
