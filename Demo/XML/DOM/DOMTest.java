package com.tong.dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 步骤： 1.工厂 2.解析器 3.解析
 * 
 * @author Administrator
 *
 */
public class DOMTest {
	public static void main(String[] args) {
		// 1.创建工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			// 2.创建解析器对象
			DocumentBuilder bulid = factory.newDocumentBuilder();

			// 3.解析文件(将解析的XML文件全部加载到内存)
			Document doc = bulid.parse("Student.xml");// 如果是不在这个项目下，而是在某个盘下，就要写具体的路径
			// D:\\mmp\\Student.xml

			// 4.得到根节点
			Element ele = doc.getDocumentElement();
			NodeList list = ele.getChildNodes();
			// 调用递归算法便利节点
			getNode(list);

			/*
			 * for (int i = 0; i < list.getLength(); i++) { Node node =
			 * list.item(i); System.out.println(node.getNodeName() + ":" +
			 * node.getNodeValue()); // 输出的内容含义 // #text:相当于回车键 //
			 * #comment:相当于注释 }
			 */

			// 对属性进行操作
			/*
			 * NamedNodeMap map = ele.getAttributes(); for (int i = 0; i <
			 * map.getLength(); i++) { Node node = map.item(i);
			 * System.out.println(node.getNodeName()+":"+node.getNodeType()+":"+
			 * node.getNodeValue()); }
			 */

			// 根据属性名称获得属性值
			/*
			 * String str = ele.getAttribute("author");
			 * System.out.println(ele.getNodeName()+":"+ele.getNodeValue()+":"+
			 * ele.getNodeType()); System.out.println(str);
			 */

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 传过来一个节点的集合
	 */
	public static void getNode(NodeList list) {
		for (int i = 0; i < list.getLength(); i++) {
			Node node = list.item(i);
			if (node.getNodeType() == 1) {
				System.out.println(node.getNodeName() + ":" + node.getTextContent() + "---" + node.getNodeType());
			}
			/*
			 * getTextContent():这个是显示节点内容的 getNodeType():省去了#text,#comment等
			 */
			// 继续得到子节点
			NodeList nodelist = node.getChildNodes();
			// 调用当前的方法
			getNode(nodelist);
		}
	}
}
