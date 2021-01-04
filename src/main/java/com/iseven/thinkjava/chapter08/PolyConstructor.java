package com.iseven.thinkjava.chapter08;

/**
 * 练习15
 * @author yangchunming
 *
 */
public class PolyConstructor {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}

class Glyph {
	void draw() {
		System.out.println("Glypth.draw");
	}
	private void fun() {
		System.out.println("Glyph.fun");
	}
	final void fun1() {
		System.out.println("Glyph.fun1");
	}
	Glyph(){
		System.out.println("111");
		draw();
		fun();
		fun1();
		System.out.println("222");
	}
}

class RoundGlyph extends Glyph {
	private int i = 1;
	RoundGlyph(int i){
		System.out.println("333");
		this.i = i;
		draw();
		fun();
		fun1();
		System.out.println("444");
	}
	void draw() {
		System.out.println("RoundGlyph.draw " + i);
	}
	void fun() {
		System.out.println("RoundGlyph.fun");
	}
}

class RectanglarGlyph extends Glyph {
	void draw() {
		System.out.println("RectanglarGlyph.draw");
	}
}