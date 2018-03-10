package tong.com;

public class StaticBlock {

	public StaticBlock() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("构造函数");
	}
	static{
		System.out.println("这是一个静态块");
	}
	public static void main(String[] args) {
		StaticBlock staticBlock = new StaticBlock();
		StaticBlock pen1 = new StaticBlock();
		/*
		 * 这是一个静态块
		 * 构造函数
		 * 构造函数
		 * 
		 * 所以静态块只执行一次
		 * */
	}
}
