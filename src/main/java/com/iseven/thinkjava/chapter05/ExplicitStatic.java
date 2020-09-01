package com.iseven.thinkjava.chapter05;

/**
 * 静态代码块
 * 练习13，练习14
 * @author yangchunming
 *
 */
public class ExplicitStatic {
	public static void main(String[] args) {
		System.out.println("inside main()");
//		Cups.cup1.f(1);
	}
	static Cups cups1 ;
//	= new Cups();
}

class Cup {
	Cup (int marker) {
		System.out.println("Cup(" + marker + ")");
	}
	
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup3 = new Cup(3);
	static {
		System.out.println("静态代码块");
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	static Cup cup2;
	Cups() {
		System.out.println("Cups");
	}
}
