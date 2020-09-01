package com.iseven.thinkjava.chapter05;

import java.util.Arrays;
import java.util.Random;

/**
 * 数组初始化
 * @author yangchunming
 *
 */
public class ArraysOfPrimitives {
	public static void main(String[] args) {
		int[] a1 = {1, 2, 3, 4, 5};
		int[] a2;
		a2 = a1;
		for(int i=0; i<a1.length; i++) {
			a1[i] ++;
		}
		for(int i=0; i<a2.length; i++) {
			System.out.println("a2[" + i + "] = " + a2[i]);
		}
		System.out.println("==============================");
		int[] a3;
		Random random = new Random();
		a3 = new int[random.nextInt(20)];
		System.out.println(a3.length);
		System.out.println(Arrays.toString(a3));
		System.out.println("==============================");
		Integer[] a4 = new Integer[random.nextInt(20)];
		for(int i=0; i<a4.length; i++) {
			a4[i] = random.nextInt(50);
		}
		System.out.println(Arrays.toString(a4));
		System.out.println("==============================");
		Integer[] a5 = {
				new Integer(1),
				new Integer(2),
				3,
		};
		Integer[] a6 = new Integer[] {
				new Integer(1),
				new Integer(2),
				3,
		};
		System.out.println(Arrays.toString(a5));
		System.out.println(Arrays.toString(a6));
		System.out.println("==============================");
		Other.main(new String[] {"fiddle", "de", "dum"});
		System.out.println("==============================");
		//练习16
		String[] str1 = new String[] {"H", "E", "L", "L", "O"};
		for(int i = 0; i<str1.length; i++) {
			System.out.print(str1[i]);
		}
		System.out.println();
		System.out.println("==============================");
		//练习17
		StrArr[] sa;
		System.out.println("==============================");
		//练习18
		sa = new StrArr[] {
				new StrArr("H"),
				new StrArr("I")
		};
	}
}

class Other {
	public static void main(String[] args) {
		for(String s: args) {
			System.out.println(s + " ");
		}
	}
}

class StrArr {
	StrArr(String s) {
		System.out.println("构造器！" + s);
	}
}
