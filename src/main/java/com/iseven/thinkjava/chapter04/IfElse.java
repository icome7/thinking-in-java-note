package com.iseven.thinkjava.chapter04;

/**
 * if-else测试
 * @author iuy
 *
 */
public class IfElse {
	static int result = 0;
	
	static void test(int testval, int target) {
		if(testval > target) {
			result = +1;
		} else if(testval < target) {
			result = -1;
		} else {
			result = 0;
		}
	}
	
	static int test2(int testval, int target) {
		if(testval > target) {
			return +1;
		} else if(testval < target) {
			return -1;
		} else {
			return 0;
		}
	}
	
	static boolean test3(int testval, int begin, int end) {
		return testval >= begin && testval <= end;
	}
	
	public static void main(String[] args) {
		test(10, 5);
		System.out.println(result);
		test(5, 10);
		System.out.println(result);
		test(5, 5);
		System.out.println(result);
		System.out.println("==============================");
		System.out.println(test2(10, 5));
		System.out.println(test2(5, 10));
		System.out.println(test2(5, 5));
		System.out.println("==============================");
		//练习6
		System.out.println(test3(2, 1, 3));
		System.out.println(test3(2, 2, 3));
		System.out.println(test3(2, 1, 2));
		System.out.println(test3(3, 1, 2));
	}
}
