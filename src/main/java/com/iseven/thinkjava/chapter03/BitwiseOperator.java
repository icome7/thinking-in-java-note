package com.iseven.thinkjava.chapter03;

/**
 * 按位操作符
 * @author iuy
 *
 */
public class BitwiseOperator {
	public static void main(String[] args) {
		System.out.println("1 & 1 : " + (1 & 1));
		System.out.println("0 | 1 : " + (0 | 1));
		System.out.println("0 ^ 1 : " + (0 ^ 1));
		System.out.println("==============================");
		/* 以byte为例
		 * 6 --> 0000 0110
		 * 7 --> 0000 0111
		 * 6&7-->0000 0110
		 */
		System.out.println(Integer.toBinaryString(6));
		System.out.println(Integer.toBinaryString(7));
		System.out.println(Integer.toBinaryString(6 & 7));
		System.out.println("==============================");
		System.out.println("true & true : " + (true & true));
		System.out.println("true | false : " + (true | false));
		System.out.println("false ^ false : " + (false ^ false));
		System.out.println("==============================");
		System.out.println("true && false && true : " + (reBoolean(true) && reBoolean(false) && reBoolean(true)));
		System.out.println("true & false & true : " + (reBoolean(true) & reBoolean(false) & reBoolean(true)));
		System.out.println("==============================");
		int a1 = 0x55555;
		int a2 = 0xaaaaa;
		System.out.println("a1 --> " + Integer.toBinaryString(a1) + "; a2 --> " + Integer.toBinaryString(a2));
		System.out.println("a1 & a2 --> " + Integer.toBinaryString(a1 & a2));
		System.out.println("a2 & a1 --> " + Integer.toBinaryString(a2 & a1));
		System.out.println("a1 | a2 --> " + Integer.toBinaryString(a1 | a2));
		System.out.println("a2 | a1 --> " + Integer.toBinaryString(a2 | a1));
		System.out.println("a1 ^ a2 --> " + Integer.toBinaryString(a1 ^ a2));
		System.out.println("a2 ^ a1 --> " + Integer.toBinaryString(a2 ^ a1));
		System.out.println("~a1 --> " + Integer.toBinaryString(~a1));
		System.out.println("~a2 --> " + Integer.toBinaryString(~a2));
		System.out.println("==============================");
		System.out.println("a1 ^= a2 --> " + Integer.toBinaryString(a1 ^= a2));
	}
	
	static boolean reBoolean(boolean bl) {
		System.out.println(bl);
		return bl;
	}
}
