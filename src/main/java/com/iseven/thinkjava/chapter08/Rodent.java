package com.iseven.thinkjava.chapter08;

import java.util.Random;

/**
 * 练习9，12, 14
 * @author yangchunming
 *
 */
public class Rodent {
	Exercise14 exercise14;
	public Rodent() {
		System.out.println("Rodent()");
	}
	public Rodent(Exercise14 exercise14) {
		System.out.println("Rodent(exercise14)");
		this.exercise14 = exercise14;
		this.exercise14.add();
	}
	public void eat() {
		System.out.println("Rodent.eat()");
	}
	public void dispose() {
		System.out.println("disposing Rodent");
		this.exercise14.dispose();
	}
	
	public static void main(String[] args) {
		Exercise14 exercise14 = new Exercise14();
		Rodent[] rodents = new Rodent[5];
		for(int i=0; i<rodents.length; i++) {
			rodents[i] = rodentFactory(exercise14);
		}
		for(Rodent r: rodents) {
			r.eat();
			r.dispose();
		}
	}
	
	public static Rodent rodentFactory(Exercise14 exercise14) {
		Random random = new Random();
		int num = random.nextInt(3);
		switch(num) {
			default:
			case 0: return new Mouse(exercise14);
			case 1: return new Gerbil(exercise14);
			case 2: return new Hamster(exercise14);
		}
	}
}

class Mouse extends Rodent {
	Mouse(){
		System.out.println("Mouse()");
	}
	Mouse(Exercise14 exercise14){
		super(exercise14);
		System.out.println("Mouse(exercise14)");
	}
	public void eat() {
		System.out.println("Mouse.eat()");
	}
}

class Gerbil extends Rodent {
	Gerbil() {
		System.out.println("Gerbil()");
	}
	Gerbil (Exercise14 exercise14){
		super(exercise14);
		System.out.println("Gerbil(exercise14)");
	}
	public void eat() {
		System.out.println("Gerbil.eat()");
	}
}

class Hamster extends Rodent {
	Hamster() {
		System.out.println("Hamster()");
	}
	Hamster (Exercise14 exercise14){
		super(exercise14);
		System.out.println("Hamster(exercise14)");
	}
	public void eat() {
		System.out.println("Hamster.eat()");
	}
}

class Exercise14 {
	private int num = 0;
	private static long index = 0;
	private final long id = index ++;
	public Exercise14() {
		System.out.println("creating Exercise14 " + id);
	}
	void add() {
		num ++;
		System.out.println("add Exercise14 " + id);
	}
	void dispose() {
		if(-- num == 0) {
			System.out.println("disposing Exercise14 " + id);
		}
	}
}
