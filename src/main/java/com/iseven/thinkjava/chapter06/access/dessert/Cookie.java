package com.iseven.thinkjava.chapter06.access.dessert;

/**
 * 访问权限修饰符
 * @author yangchunming
 *
 */
public class Cookie {
	public Cookie() {
		System.out.println("Cookie constructor");
	}
	
	void bite() {
		System.out.println("bite");
	}
	
	protected void bite2() {
		System.out.println("bite2");
	}
}
