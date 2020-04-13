package com.iseven.thinkjava.chapter03;

/**
 * 移位
 * @author iuy
 *
 */
public class URShift {
	public static void main(String[] args) {
		int i = -1;
		/*
		 *1的原码：00000000 00000000 00000000 00000001
		 *1的反码：11111111 11111111 11111111 11111110
		 *1的补码（反码+1）11111111 11111111 11111111 11111111 
		 */
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(i << 10));
		System.out.println(Integer.toBinaryString(i >> 10));
		System.out.println(Integer.toBinaryString(i >>> 10));
		long j = -1;
		System.out.println(Long.toBinaryString(j));
		System.out.println(Long.toBinaryString(j << 10));
		System.out.println(Long.toBinaryString(j >> 10));
		System.out.println(Long.toBinaryString(j >>> 10));
		short k = -1;
		System.out.println(Integer.toBinaryString(k));
		System.out.println(Integer.toBinaryString(k << 10));
		System.out.println(Integer.toBinaryString(k >> 10));
		System.out.println(Integer.toBinaryString(k >>> 10));
		byte l = -1;
		System.out.println(Integer.toBinaryString(l));
		System.out.println(Integer.toBinaryString(l << 10));
		System.out.println(l << 10);
		System.out.println(Integer.toBinaryString(l >> 10));
		System.out.println(l >> 10);
		System.out.println(Integer.toBinaryString(l >>> 10));
		System.out.println(l >>> 10);
	}
}
