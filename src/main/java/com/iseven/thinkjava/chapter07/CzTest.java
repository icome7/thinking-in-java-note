package com.iseven.thinkjava.chapter07;

/**
 * 练习13
 * @author yangchunming
 *
 */
public class CzTest extends CTest {
	
	void f(String s) {
		System.out.println("String");
	}
	
	public static void main(String[] args) {
		CzTest c = new CzTest();
		c.f(1);
		c.f(1.2f);
		c.f('a');
		c.f("a");
	}
}

class CTest {
	void f(int i) {
		System.out.println("int");
	}
	
	void f(float f) {
		System.out.println("float");
	}
	
	void f(char c) {
		System.out.println("char");
	}
}
