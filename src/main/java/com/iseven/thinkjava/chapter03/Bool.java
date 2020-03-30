package com.iseven.thinkjava.chapter03;

import java.util.Random;

public class Bool {
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("i > j is " + (i > j));
		System.out.println("i < j is " + (i < j));
		System.out.println("i >= j is " + (i >= j));
		System.out.println("i <= j is " + (i <= j));
		System.out.println("i != j is " + (i != j));
		//i && j; i || j; !j; //错误写法，编译报错，与或非操作只可用于操作布尔值
		System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
		System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
		System.out.println("==============================");
		//抛硬币的结果
		System.out.println("模拟抛硬币结果，0表示正面，1表示反面：" + rand.nextInt(2));
		System.out.println("模拟抛硬币结果，0表示正面，1表示反面：" + rand.nextInt(2));
		System.out.println("模拟抛硬币结果，0表示正面，1表示反面：" + rand.nextInt(2));
		System.out.println("模拟抛硬币结果，0表示正面，1表示反面：" + rand.nextInt(2));
		System.out.println("模拟抛硬币结果，0表示正面，1表示反面：" + rand.nextInt(2));
	}
	
}
