package tong.com;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Exception1{
	public static void main(String[] args) {
		Logger log = Logger.getLogger(Exception1.class);
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("请输入被除数：");
			int num1 = scan.nextInt();
			log.info("请输入被除数：" + num1);
			
			System.out.println("请输入除数：");
			int num2=scan.nextInt();
			log.info("请输入除数："+num2);
			scan.close();
			int result=num1/num2;
			System.out.println("结果："+result);
			log.info("结果："+result);
		} catch (InputMismatchException ex) {
			// TODO Auto-generated catch block
			//ex.printStackTrace();
			System.out.println("输入错误，请输入数字。");
			log.error("输入错误，请输入数字");
		}catch(ArithmeticException aex){
			System.out.println("0不能作为除数");
			log.error("0不能作为除数");
		}catch(Exception e){
			e.printStackTrace();
			log.error("其他异常");
		}
		
	}
	
}
