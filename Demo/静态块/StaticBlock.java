package tong.com;

public class StaticBlock {

	public StaticBlock() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("���캯��");
	}
	static{
		System.out.println("����һ����̬��");
	}
	public static void main(String[] args) {
		StaticBlock staticBlock = new StaticBlock();
		StaticBlock pen1 = new StaticBlock();
		/*
		 * ����һ����̬��
		 * ���캯��
		 * ���캯��
		 * 
		 * ���Ծ�̬��ִֻ��һ��
		 * */
	}
}
