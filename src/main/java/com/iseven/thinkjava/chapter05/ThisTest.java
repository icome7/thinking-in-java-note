package com.iseven.thinkjava.chapter05;

/**
 * this关键字
 * @author yangchunming
 *
 */
public class ThisTest {
	public static void main(String[] args) {
		//练习8
		ThisTest t = new ThisTest();
		t.funB();
	}
	void funA() {
		System.out.println("function A");
	}
	void funB() {
		System.out.println("function B");
		funA();
		this.funA();
	}
	
	public ThisTest() {
		//练习9
		this(1);
		System.out.println("default constructor");
		funA();
		this.funB();
	}
	
	public ThisTest(int i) {
		System.out.println("int param construtor");
	}
}
