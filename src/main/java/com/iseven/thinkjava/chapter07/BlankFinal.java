package com.iseven.thinkjava.chapter07;

public class BlankFinal {
	private final int i = 0;
	private final int j;
	private final Poppet p;
	
	public BlankFinal() {
		j = 1;
		p = new Poppet(1);
	}
	
	public BlankFinal(int i) {
		this.j = i;
		this.p = new Poppet(i);
	}
	
	public static void main(String[] args) {
		//练习19
		BlankFinal b = new BlankFinal();
		System.out.println(b);
//		b.i = 2;
//		b.j = 3;
//		b.p = new Poppet(213);
		BlankFinal b1 = new BlankFinal(111);
		System.out.println(b1);
	}

	@Override
	public String toString() {
		return "BlankFinal [i=" + i + ", j=" + j + ", p=" + p + "]";
	}
	
}

class Poppet {
	private int i;
	Poppet(int i) {
		this.i = i;
	}
}
