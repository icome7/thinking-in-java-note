package com.iseven.thinkjava.chapter03;

/**
 * 运算溢出和练习14
 * @author iuy
 *
 */
public class Overflow {
	public static void main(String[] args) {
		int big = Integer.MAX_VALUE;
		System.out.println("big = " + big);
		int bigger = big * 4;
		System.out.println("big = " + bigger);
		System.out.println("==============================");
		//练习14
		strEqu("a", "b");
		strEqu("a", "a");
		String s0 = "a";
		strEqu("a", s0);
		String s1 = new String("a");
		String s2 = new String("a");
		strEqu(s1, s2);
	}
	
	static void strEqu(String str1, String str2) {
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1 != str2: " + (str1 != str2));
		System.out.println("str1.equals(str2): " + (str1.equals(str2)));
		System.out.println("===============");
	}
}
