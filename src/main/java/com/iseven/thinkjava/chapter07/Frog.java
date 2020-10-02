package com.iseven.thinkjava.chapter07;

/**
 * 练习16，17
 * @author yangchunming
 *
 */
public class Frog extends Amphibian{
	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.walk();
		frog.swim();
	}
	
	protected void walk() {
		System.out.println("Frog walk()");
	}
	
	protected void swim() {
		System.out.println("Frog swim()");
	}
}

class Amphibian {
	protected void walk() {
		System.out.println("Amphibian walk()");
	}
	
	protected void swim() {
		System.out.println("Amphibian swim()");
	}
}