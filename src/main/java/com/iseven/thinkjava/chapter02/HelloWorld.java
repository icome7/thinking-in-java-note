package com.iseven.thinkjava.chapter02;

import java.util.Date;

public class HelloWorld {
	public static void main(String[] args) {
		/*这是可以
		 * 换行的注释
		 */
		System.out.println("Hello World");//这是单行注释
		System.out.println(new Date());//创建一个date对象，并被转成String类型输出
		System.getProperties().list(System.out);//将系统属性发送给System.out
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}
}
