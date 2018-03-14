package com.tong.single;

public class MySingle {
	public MySingle(){}
	
	private static MySingle single = null;
	public static MySingle newInstance(){
		if(single==null){
			single = new MySingle();
		}
		return single;
	}
}
