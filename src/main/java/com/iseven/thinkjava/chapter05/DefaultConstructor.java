package com.iseven.thinkjava.chapter05;

/**
 * 默认构造器
 * @author yangchunming
 *
 */
public class DefaultConstructor {
	public static void main(String[] args) {
		//练习3
		new Bird();
		System.out.println("==============================");
		//练习4
		new Bird("sing");
		System.out.println("==============================");
		//练习5
		new	Dog();
		new Dog(1);
		byte b = 1;
		int i = 2;
		char c = 'a';
		short s = 123;
		new Dog(b);
		new Dog(c);
		new Dog(s); 
		new Dog(100L);
		new Dog(true);
		new Dog(1.2f);
		new Dog(1.2);
		System.out.println("==============================");
		//练习6
		new Dog(b, i);
		new Dog(i, b);
		System.out.println("==============================");
		//练习7
		new Cat();
	}
}

class Bird {
	public Bird() {
		System.out.println("hello");
	}
	public Bird(String s) {
		System.out.println(s);
	}
}

class Dog {
	public Dog() {
		System.out.println("汪汪汪");
	}
	public Dog(byte b) {
		System.out.println("汪汪汪byte");
	}
	public Dog(char c) {
		System.out.println("汪汪汪char");
	}
	public Dog(short s) {
		System.out.println("汪汪汪sort");
	}
	public Dog(int i) {
		System.out.println("汪汪汪int");
	}
	public Dog(long l) {
		System.out.println("汪汪汪long");
	}
	public Dog(float f) {
		System.out.println("汪汪汪float");
	}
	public Dog(double d) {
		System.out.println("汪汪汪double");
	}
	public Dog(boolean bl) {
		System.out.println("汪汪汪boolean");
	}
	public Dog(byte b, int i) {
		System.out.println("汪汪汪byte-int");
	}
	public Dog(int i, byte b) {
		System.out.println("汪汪汪int-byte");
	}
}

class Cat {}