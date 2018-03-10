package tong.com;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Exception1{
	public static void main(String[] args) {
		Logger log = Logger.getLogger(Exception1.class);
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("�����뱻������");
			int num1 = scan.nextInt();
			log.info("�����뱻������" + num1);
			
			System.out.println("�����������");
			int num2=scan.nextInt();
			log.info("�����������"+num2);
			scan.close();
			int result=num1/num2;
			System.out.println("�����"+result);
			log.info("�����"+result);
		} catch (InputMismatchException ex) {
			// TODO Auto-generated catch block
			//ex.printStackTrace();
			System.out.println("����������������֡�");
			log.error("�����������������");
		}catch(ArithmeticException aex){
			System.out.println("0������Ϊ����");
			log.error("0������Ϊ����");
		}catch(Exception e){
			e.printStackTrace();
			log.error("�����쳣");
		}
		
	}
	
}
