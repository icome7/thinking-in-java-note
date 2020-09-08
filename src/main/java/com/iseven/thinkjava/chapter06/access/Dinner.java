package com.iseven.thinkjava.chapter06.access;

import com.iseven.thinkjava.chapter06.access.dessert.Cookie;

public class Dinner {
	public static void main(String[] args) {
		Cookie cookie = new Cookie();
//		cookie.bite();//默认修饰符无访问权限
//		Sundae sundae = new Sundae();//private 无法访问
		Sundae sundae = Sundae.makeASundae();
	}
}

class Sundae {
	private Sundae () {}
	static Sundae makeASundae() {
		return new Sundae();
	}
}
