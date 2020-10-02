package com.iseven.thinkjava.chapter07;

/**
 * 带参数的构造器
 * @author yangchunming
 *
 */
public class Chess extends BoardGame {

	Chess(int i) {
		super(i);
		System.out.println("Chess constructor");
		//练习6
//		super(i);//编译报错
	}
	
	public static void main(String[] args) {
		new Chess(7);
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame contructor");
	}
}

class Game {
	Game(int i) {
		System.out.println("Game Constructor");
	}
}
