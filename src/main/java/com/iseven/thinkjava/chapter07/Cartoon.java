package com.iseven.thinkjava.chapter07;

public class Cartoon extends Drawing{
	//练习3
//	public Cartoon() {
//		System.out.println("Cartoon contructor");
//	}
	//练习4ß
	public static void main(String[] args) {
		new Cartoon();
	}
}

class Art {
	Art() {
		System.out.println("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}
}
