package com.iseven.thinkjava.chapter04;

import java.util.Random;
import static com.iseven.thinkjava.chapter04.util.Range.*;

/**
 * foreach语法测试
 * @author iuy
 *
 */
public class ForEachTest {
	public static void main(String[] args) {
		Random random = new Random(47);
		float[] f = new float[10];
		for(int i=0; i<10; i++) {
			f[i] = random.nextFloat();
		}
		for(float x: f) {
			System.out.println(x);
		}
		System.out.println("==============================");
		for(char c: "An African Swallow".toCharArray()) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("==============================");
		for(int i: range(10)) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i: range(5, 10)) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i: range(5, 20, 3)) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
}
