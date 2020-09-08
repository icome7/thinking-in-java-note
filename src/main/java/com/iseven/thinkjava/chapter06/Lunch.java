package com.iseven.thinkjava.chapter06;

public class Lunch {
	
	void testPrivate() {
//		new Soup1();
	}
	
	void testStatic() {
		Soup1.makeSoup();
	}
	
	void testSingleton() {
		Soup2.access().f();
	}
}

class Soup1 {
	private Soup1() {}
	
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2 {
	private Soup2() {}
	
	private static Soup2 soup = new Soup2();
	
	public static Soup2 access() {
		return soup;
	}
	
	public void f() {}
}