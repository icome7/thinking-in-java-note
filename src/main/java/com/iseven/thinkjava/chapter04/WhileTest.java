package com.iseven.thinkjava.chapter04;
/**
 * while循环测试
 * @author iuy
 *
 */
public class WhileTest {
	static boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.print(result + ", ");
		return result;
	}
	
	public static void main(String[] args) {
		while(condition()) {
			System.out.println("Inside 'while'");
		}
		System.out.println("Exited 'while'");
		System.out.println("==============================");
		do {
			System.out.println("至少执行一次");
		} while(false);
		System.out.println("==============================");
		for(char c = 0; c < 128; c++) {
			if(Character.isLowerCase(c)) {
				System.out.println("value: " + (int) c + " character: " + c);
			}
		}
		System.out.println("==============================");
		for(int i=1, j=i+10; i<5; i++, j=i*2) {
			System.out.println("i = " + i + " j = " + j);
		}
	}
}
