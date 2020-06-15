package com.iseven.thinkjava.chapter04;

import static com.iseven.thinkjava.chapter04.util.Range.*;

/**
 * break和continue测试
 * @author iuy
 *
 */
public class BreakAndContinue {
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			if(i == 74) {
				break;
			}
			if(i % 9 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i: range(100)) {
			if(i == 74) {
				break;
			}
			if(i % 9 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		int i = 0;
		while(true) {
			i++;
			int j = i * 27;
			if(j == 1269) break;
			if(i % 10 != 0) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("==============================");
		//练习7
		int num = 1;
		while(true) {
			System.out.print(num++ + " ");
			if(num > 99) {
				break;
			}
		}
		System.out.println();
		for(int k=1;;k++) {
			System.out.print(k + " ");
			if(k == 99) {
				return;
			}
		}
	}
}
