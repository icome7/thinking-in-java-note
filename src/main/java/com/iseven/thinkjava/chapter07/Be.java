package com.iseven.thinkjava.chapter07;

import com.iseven.thinkjava.chapter07.other.Ae;

/**
 * 练习15
 * @author yangchunming
 *
 */
public class Be extends Ae{
	
	public void f1() {
		System.out.println("Be f()");
		f();
	}
	
	public static void main(String[] args) {
		Ae ae = new Ae();
//		ae.f();
		Be be = new Be();
		be.f();
		be.f1();
	}
}
