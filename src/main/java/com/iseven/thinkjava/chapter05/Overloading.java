package com.iseven.thinkjava.chapter05;
/**
 * 方法重载
 * @author yangchunming
 *
 */
public class Overloading {
	public static void main(String[] args) {
		Tree tree = new Tree();
		new Tree(100);
		tree.init();
		tree.init(101);
		tree.init("abc");
		tree.init(123, "aa");
	}
}

class Tree {
	public Tree() {
		System.out.println("默认构造器");
	}
	public Tree(int i) {
		System.out.println("有参数的构造器");
	}
	
	public void init() {
		System.out.println("无参数的方法");
	}

	public void init(int i) {
		System.out.println("一个int参数的方法");
	}
	
	public void init(String s) {
		System.out.println("一个String参数的方法");
	}
	
	public void init(int i, String s) {
		System.out.println("一个int一个String参数的方法");
	}
}
