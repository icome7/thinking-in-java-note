package com.iseven.thinkjava.chapter03;

/**
 * 指数计数法
 * @author iuy
 *
 */
public class Exponents {
	public static void main(String[] args) {
		float expFloat = 1.39e-43f;
		expFloat = 1.39E-43F;
		System.out.println(expFloat);
		double expDouble = 47e47d;
		expDouble = 47e47;
		System.out.println(expDouble);
		System.out.println(1e2);
		System.out.println("==============================");
		float maxFloat = 3.4028235e38f;
		System.out.println(maxFloat == Float.MAX_VALUE);
		float minFloat = 1.4e-45f;
		System.out.println(minFloat == Float.MIN_VALUE);
		double maxDouble = 1.7976931348623157e308;
		System.out.println(maxDouble == Double.MAX_VALUE);
		double minDouble = 4.9e-324;
		System.out.println(minDouble == Double.MIN_VALUE);
	}
}
