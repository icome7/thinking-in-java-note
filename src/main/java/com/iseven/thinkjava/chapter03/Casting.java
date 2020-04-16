package com.iseven.thinkjava.chapter03;

/**
 * 类型转换操作符
 * @author iuy
 *
 */
public class Casting {
	public static void main(String[] args) {
		int i = 200;
		long lng = (long) i;
		lng = i;
		long lng2 = (long) 200;
		lng2 = 200;
		i = (int) lng2;//必要
		System.out.println("==============================");
		double above = 0.7, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		int a = (int) above;
		System.out.println("(int) above: " + (int) above);
		System.out.println("(int) below: " + (int) below);
		System.out.println("(int) fabove: " + (int) fabove);
		System.out.println("(int) fbelow: " + (int) fbelow);
		System.out.println("==============================");
		System.out.println("Math.round(above): " + Math.round(above));
		System.out.println("Math.round(below): " + Math.round(below));
		System.out.println("Math.round(fabove): " + Math.round(fabove));
		System.out.println("Math.round(fbelow): " + Math.round(fbelow));
	}
}
