package com.iseven.thinkjava.chapter07;

/**
 * 练习7
 * @author yangchunming
 *
 */
public class Ca extends Aa{
	private Ba b;
	Ca(int i) {
		super(i);
		b = new Ba(11);
		System.out.println("Ca contructor");
	}
	
	public static void main(String[] args) {
		new Ca(7);
	}
}

class Ba {
	Ba(int i) {
		System.out.println("Ba contructor");
	}
}

class Aa {
	Aa(int i) {
		System.out.println("Aa contructor");
	}
}