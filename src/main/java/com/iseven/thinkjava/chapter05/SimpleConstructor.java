package com.iseven.thinkjava.chapter05;

/**
 * 构造器
 * @author yangchunming
 *
 */
public class SimpleConstructor {
	
	private static String str;
	private static String str1 = "this is str1";
	private static String str2;
	
	public SimpleConstructor() {
		str2 = "this is str2";
	}
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			new Rock();
			new Rock(i);
		}
		//练习1
		System.out.println(str);
		System.out.println("==============================");
		//练习2
		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);
		new SimpleConstructor();
		System.out.println("str2:" + str2);
	}
}

class Rock {
	public Rock() {
		System.out.println("创建Rock对象");
	}
	
	public Rock(int i) {
		System.out.println("创建Rock对象" + i);
	}
}

