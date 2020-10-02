package com.iseven.thinkjava.chapter07;

public class Disinfectant extends Detergent {
	
	public void scrub() {
		append(" Disinfectant.scrub() ");
		super.scrub();
	}
	
	public void sterilize() {
		append(" sterilize() ");
	}
	
	public static void main(String[] args) {
		//练习2
		Disinfectant x = new Disinfectant();
		x.scrub();
		x.sterilize();
		System.out.println(x);
	}
}
