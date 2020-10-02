package com.iseven.thinkjava.chapter07;

/**
 * 继承
 * @author yangchunming
 *
 */
public class Detergent extends Cleanser {
	//Change a method
	public void scrub() {
		append(" Detergent.scrub() ");
		super.scrub();//Call base-calss version
	}
	
	//add a method to the interface
	public void foam() {
		append (" foam() ");
	}
	
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}
}

class Cleanser {
	private String s = "Cleanser";
	
	public void append(String a) {
		s += a;
	}
	
	public void dilute() {
		append(" dilute() ");
	}
	
	public void apply() {
		append(" apply() ");
	}
	
	public void scrub() {
		append(" scrub() ");
	}
	
	public String toString() {
		return s;
	}
	
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}
