package com.iseven.thinkjava.chapter07;

/**
 * 练习5，如果有父类，初始化顺序，先静态，后非静态 先父类，后子类
 * @author yangchunming
 *
 */
public class C extends A{
	C() {
		System.out.println("C constructor");
	}
	private B b = new B();
	private static D d = new D();
	public static void main(String[] args) {
		new C();
	}
}

class A {
	private B b = new B();
	A() {
		System.out.println("A constructor");
	}
}

class B {
	B() {
		System.out.println("B constructor");
	}
}

class D {
	D() {
		System.out.println("D constructor");
	}
}
