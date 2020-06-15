package com.iseven.thinkjava.chapter04;

import java.util.Random;

/**
 * 
 * @author iuy
 *
 */
public class SwitchTest {
	public static void main(String[] args) {
		Random random = new Random(47);
		for(int i=0; i<100; i++) {
			int c = random.nextInt(26) + 'a';
			System.out.print((char) c + "," + c + ": ");
			switch(c) {
				case 'a' : 
				case 'e' :
				case 'i' :
				case 'o' :
				case 'u' : System.out.print("vowel"); break;
				case 'y' :
				case 'w' : System.out.print("Sometime a vowel"); break;
				default : System.out.print("consonant");
			}
			System.out.println();
		}
		System.out.println("==============================");
		//练习8
		for(int i = 0; i < 10; i++) {
			int c = random.nextInt(5);
			System.out.println("c: " + c);
			switch(c) {
				case 1 : System.out.println(c); break;
				case 2 : System.out.println(c); break;
				case 3 : System.out.println(c); break;
				default : System.out.println("大于3");
			}
			System.out.println("=======");
			switch(c) {
				case 1 : System.out.println(c);
				case 2 : System.out.println(c);
				case 3 : System.out.println(c);
				default : System.out.println("大于3");
				System.out.println("==============");
			}
		}
		System.out.println("==============================");
		//练习9
		fibonacci(-1);
		fibonacci(1);
		fibonacci(2);
		fibonacci(3);
		fibonacci(10);
		System.out.println("==============================");
		//练习10
		for(int a = 1; a < 10; a++) {
			for(int b = 0; b < 10; b++) {
				for(int c = 0; c < 10; c++) {
					label:
					for(int d = 0; d <10; d++) {
						if(c == 0 && d == 0) {
							continue;
						}
						String numStr = "" + a + b + c + d;
						int num = Integer.valueOf("" + a + b + c + d);
						for(int e = 0; e < 4; e++) {
							int first = -1;
							switch(e) {
								case 0 : first = a; numStr = "" + b + c + d; break;
								case 1 : first = b; numStr = "" + a + c + d; break;
								case 2 : first = c; numStr = "" + a + b + d; break;
								case 3 : first = d; numStr = "" + a + b + c; break;
							}
							if(first == 0) {
								continue;
							}
							int num1 = Integer.valueOf(numStr);
							//剩下的三位数中的各个位置上的数字
							int x = num1/100;
							int y = (num1 - num1/100*100)/10;
							int z = num1 - num1/10*10;
							for(int f = 0; f < 3; f++) {
								int second = -1;
								switch(f) {
									case 0 : second = x; numStr = "" + y + z; break;
									case 1 : second = y; numStr = "" + x + z; break;
									case 2 : second = z; numStr = "" + x + y; break;
								}
								int num2 = Integer.valueOf(numStr);
								//剩下的两位数中的各个位置上的数字
								int p = num2/10;
								int q = num2 - num2/10*10;
								for(int g = 0; g < 2; g++) {
									int third = -1;
									int fourth = -1;
									switch(g) {
										case 0 : third = p; fourth = q; break;
										case 1 : third = q; fourth = p; break;
									}
									if(third == 0) {
										continue;
									}
									int firstNum = Integer.valueOf("" + first + second);
									int secondNum = Integer.valueOf("" + third + fourth);
									if(num == firstNum * secondNum) {
										System.out.println(num + "=" + firstNum + "*" + secondNum);
										continue label;
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	private static void fibonacci(int num) {
		if(num <= 0) {
			return;
		}
		if(num == 1) {
			System.out.println("1");
			return;
		}
		if(num == 2) {
			System.out.println("1、 1");
			return;
		}
		int last = 1;
		int current = 1;
		String printText = "1、 1";
		for(int i = 2; i < num; i++) {
			int next = last + current;
			printText += ("、 " + next); 
			last = current;
			current = next;
		}
		System.out.println(printText);
	}
}
