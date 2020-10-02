package com.iseven.thinkjava.chapter07;

/**
 * 练习8
 * @author yangchunming
 *
 */
public class Cb extends Ab {
	public Cb() {
		super(0);
		System.out.println("Cb constructor");
	}
	
	public Cb(int i) {
		super(i);
		System.out.println("Cb(int i) constructor");
	}
	
	public static void main(String[] args) {
		new Cb();
	}
}

class Ab {
	Ab(int i) {
		System.out.println("Ab constructor");
	}
}
