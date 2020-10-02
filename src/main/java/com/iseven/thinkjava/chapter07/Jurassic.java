package com.iseven.thinkjava.chapter07;

/**
 * final类
 * @author yangchunming
 *
 */
public class Jurassic {
	public static void main(String[] args) {
		
	}
}

class SmallBrain {}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain sb = new SmallBrain();
	void f() {}
}

//练习22
//class Further extends Dinosaur {}