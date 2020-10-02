package com.iseven.thinkjava.chapter07;

/**
 * 练习24
 * @author yangchunming
 *
 */
public class Beetle1 extends Beetle{
	private int k = printInit("Beetle.k initalized");
	
	public Beetle1() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	
	private static int x2 = printInit("static Beetle1.x2 initalized");
	
	public static void main(String[] args) {
		new Beetle1();
	}
}
