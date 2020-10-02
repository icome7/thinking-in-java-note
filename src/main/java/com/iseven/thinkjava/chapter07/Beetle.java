package com.iseven.thinkjava.chapter07;

/**
 * 初始化及类加载
 * @author yangchunming
 *
 */
public class Beetle extends Insect {
	private int k = printInit("Beetle.k initalized");
	
	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	
	private static int x2 = printInit("static Beetle.x2 initalized");
	
	public static void main(String[] args) {
		System.out.println("Beetle constructor");
//		Beetle b = new Beetle();
		
		System.out.println("==============================");
		//练习23
//		new Beetle();
		int n = Beetle.x3;
		System.out.println(n);
	}
}

class Insect {
	private int i = 9;
	protected int j;
	
	public Insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	
	private static int x1 = printInit("static Instect.x1 initalized");
	static {
		System.out.println("static{}");
		s1 = "s1";
//		printInit(s1);
		x3 = 3;
	}
	public static int x3 = printInit("static Instect.x3 initalized");
	static String s1; 
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}
