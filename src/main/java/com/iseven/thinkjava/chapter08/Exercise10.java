package com.iseven.thinkjava.chapter08;

/**
 * 练习10
 * @author yangchunming
 *
 */
public class Exercise10 {
	public static void main(String[] args) {
		Exercise101 e = new Exercise102();
		e.fun1();
	}
}

class Exercise101 {
	public void fun1() {
		System.out.println("Exercise101.fun1()");
		fun2();
	}
	public void fun2() {
		System.out.println("Exercise101.fun2()");
	}
}

class Exercise102 extends Exercise101{
	public void fun1() {
		System.out.println("Exercise102.fun1()");
		fun2();
	}
	public void fun2() {
		System.out.println("Exercise102.fun2()");
	}
}