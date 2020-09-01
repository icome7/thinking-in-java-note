package com.iseven.thinkjava.chapter05;

/**
 * 非静态代码块
 * @author yangchunming
 *
 */
public class Mugs {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("非静态代码块...");
	}
	
	Mugs() {
		System.out.println("Mug()");
	}
	
	Mugs(int marker) {
		System.out.println("Mugs(" + marker + ")");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main()");
		new Mugs();
		System.out.println("new Mugs() completed");
		new Mugs(1);
		System.out.println("new Mugs(1) comleted");
		System.out.println("==============================");
		//练习15
		System.out.println(new MugStr().str);
	}
}

class Mug {
	Mug(int marker) {
		System.out.println("Mug(" + marker + ")");
	}
	
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class MugStr {
	String str;
	{
		str = "hello";
	}
}