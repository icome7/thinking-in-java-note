package com.iseven.thinkjava.chapter04;

import java.util.Random;

/**
 * 迭代语句的练习
 * @author iuy
 *
 */
public class IterationTest {
	public static void main(String[] args) {
		//练习1
		for(int i = 1; i<=100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("==============================");
		//练习2
		String all = "";
		String greater = "";
		String less = "";
		String equal = "";
		Random random = new Random();
		int rand1 = random.nextInt(10);
		all += rand1 + " ";
		for(int i=0; i<24; i++) {
			int rand2 = random.nextInt(10);
			all += rand2 + " ";
			if(rand1 > rand2) {
				greater += rand1 + " ";
			} else if(rand1 < rand2) {
				less += rand1 + " ";
			} else {
				equal += rand1 + " ";
			}
			rand1 = rand2;
		}
		System.out.println("生成的所有数据：" + all);
		System.out.println("大于紧随的数据：" + greater);
		System.out.println("小于紧随的数据：" + less);
		System.out.println("等于紧随的数据：" + equal);
		System.out.println("==============================");
		//练习3
//		while(true) {
//			int rand2 = random.nextInt(10);
//			all += rand2 + " ";
//			if(rand1 > rand2) {
//				greater += rand1 + " ";
//			} else if(rand1 < rand2) {
//				less += rand1 + " ";
//			} else {
//				equal += rand1 + " ";
//			}
//			rand1 = rand2;
//			System.out.println("生成的所有数据：" + all);
//			System.out.println("大于紧随的数据：" + greater);
//			System.out.println("小于紧随的数据：" + less);
//			System.out.println("等于紧随的数据：" + equal);
//		}
		System.out.println("==============================");
		//练习4
		for(int i=2; i<1000; i++) {
			boolean flag = true;
			for(int j=2; j<i; j++) {
				if(i % j == 0) {
					flag = false;
				}
			}
			if(flag) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("==============================");
		//练习5
		int a1 = 0x55555;
		int a2 = 0xaaaaa;
		System.out.println("a1 --> " + testBinary(a1) + "; a2 --> " + testBinary(a2));
		System.out.println("a1 & a2 --> " + Integer.toBinaryString(a1 & a2));
		System.out.println("a1 & a2 --> " + testBinary(a1 & a2));
		System.out.println("a2 & a1 --> " + testBinary2(a2 & a1));
		System.out.println("a1 | a2 --> " + Integer.toBinaryString(a1 | a2));
		System.out.println("a1 | a2 --> " + testBinary(a1 | a2));
		System.out.println("a2 | a1 --> " + testBinary2(a2 | a1));
		System.out.println("a1 ^ a2 --> " + testBinary(a1 ^ a2));
		System.out.println("a2 ^ a1 --> " + testBinary2(a2 ^ a1));
		System.out.println("~a1 --> " + Integer.toBinaryString(~a1));
		System.out.println("~a1 --> " + testBinary(~a1));
		System.out.println("~a1 --> " + testBinary2(~a1));
		System.out.println("~a2 --> " + Integer.toBinaryString(~a2));
		System.out.println("==============================");
		System.out.println(~-99 + 1);
		System.out.println(-5<<1);
	}
	
	//TODO 负数存在问题，后期再考虑如何实现
	static String testBinary(int num) {
		if(num == 0 || num == 1) {
			return num + "";
		}
		String str = "";
		while(num != 0) {
//			int j = num%2;
			int j = num%2 == 0 ? 0 : 1;
			num /= 2;
			str = j + str;
		}
		return str;
	}
	
	static String testBinary2(int num) {
		if(num == 0) {
			return 0 + "";
		}
		String str = "";
		int a = Integer.numberOfLeadingZeros(num);//最高位的1前面有多少0
		num <<= a;//将最高位1移到第32位上
		for(int i = 0; i<32-a; i++) {
			int b = Integer.numberOfLeadingZeros(num) == 0 ? 1 : 0;//如果是0个0，说明最高位是1
			str += b;
			num <<= 1;//将最高位移出，循环查看下一位数是0还是1
		}
		return str;
	}
}
