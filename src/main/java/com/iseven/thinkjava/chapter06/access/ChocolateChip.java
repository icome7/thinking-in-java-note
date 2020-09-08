package com.iseven.thinkjava.chapter06.access;

import com.iseven.thinkjava.chapter06.access.dessert.Cookie;

public class ChocolateChip extends Cookie {
	public ChocolateChip () {
		System.out.println("ChocolateChip constructor");
	}
	
	public void chomp() {
//		bite();//无访问权
		bite2();
	}
	
	public static void main(String[] args) {
		ChocolateChip chocolateChip = new ChocolateChip();
		chocolateChip.chomp();
	}
}
