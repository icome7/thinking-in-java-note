package com.iseven.thinkjava.chapter08;

import java.util.Random;

/**
 * 练习6，7，8
 * @author yangchunming
 *
 */
public class Music3 {
	public static void tune(Instrument i) {
		i.play(Node.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e) {
		for(Instrument i: e) {
			tune(i);
			System.out.println(i);
		}
	}
	
	public static Instrument[] instrumentFactory() {
		Instrument[] is = new Instrument[10];
		Random random = new Random();
		for(int i=0; i<is.length; i++) {
			int n = random.nextInt(6);
			switch(n) {
				case 0: is[i] = new Instrument(); break;
				case 1: is[i] = new Wind(); break;
				case 2: is[i] = new Percussion(); break;
				case 3: is[i] = new Stringed(); break;
				case 4: is[i] = new Brass(); break;
				case 5: is[i] = new Woodwind(); break;
			}
		}
		return is;
	}
	
	public static void main(String[] args) {
//		Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(), new Woodwind2()};
		
		tuneAll(instrumentFactory());
	}
}

class Instrument {
	void play(Node n) {
		System.out.println("Instrument.play() " + n);
	}
	
	String what() {
		return toString();
	}
	
	void adjust() {
		System.out.println("Adjusting Instrument");
	}
}

class Wind extends Instrument {
	void play(Node n) {
		System.out.println("Wind.play() " + n);
	}
	
	String what() {
		return toString();
	}
	
	void adjust() {
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	void play(Node n) {
		System.out.println("Percussion.play() " + n);
	}
	
	String what() {
		return toString();
	}
	
	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	void play(Node n) {
		System.out.println("Stringed.play() " + n);
	}
	
	String what() {
		return toString();
	}
	
	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Wind {
	void play(Node n) {
		System.out.println("Brass.play() " + n);
	}
	
	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Woodwind extends Wind {
	void play(Node n) {
		System.out.println("Woodwind.play() " + n);
	}
	
	String what() {
		return toString();
	}
}

class Woodwind2 extends Woodwind {
	void play(Node n) {
		System.out.println("Woodwind.play() " + n);
	}
	
	String what() {
		return toString();
	}
}