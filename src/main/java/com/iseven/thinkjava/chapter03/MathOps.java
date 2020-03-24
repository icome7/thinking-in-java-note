package com.iseven.thinkjava.chapter03;

import java.util.Random;

/**
 * 算数运算符
 * @author cmyang
 *
 */
public class MathOps {
	public static void main(String[] args) {
		System.out.println(1/3);//0
		System.out.println(1.0/3.0);//0.3333333333333333
		//System.out.println(1/0);//报错/ by zero
		System.out.println(1.0/0.0);//不报错，返回Infinity（无限大）
		System.out.println("==============================");
		Random random = new Random(47);
		int j, k;
		j = random.nextInt(100) + 1;
		k = random.nextInt(100) + 1;
		System.out.println("j = " + j + "; k = " + k);
		System.out.println("j + k = " + (j + k));
		System.out.println("j - k = " + (j - k));
		System.out.println("k / j = " + (k / j));
		System.out.println("k * j = " + (k * j));
		System.out.println("k % j = " + (k % j));
		System.out.println("j %= k, j = " + (j %= k));
		float u, v, w;
		v = random.nextFloat();
		w = random.nextFloat();
		System.out.println("v = " + v + "; w = " + w);
		System.out.println("v + w = " + (v + w));
		System.out.println("v - w = " + (v - w));
		System.out.println("v * w = " + (v * w));
		System.out.println("v / w = " + (v / w));
		u = v / w;
		System.out.println("u += v, u = " + (u += v));
		System.out.println("u -= v, u = " + (u -= v));
		System.out.println("u *= v, u = " + (u *= v));
		System.out.println("u /= v, u = " + (u /= v));
		System.out.println("==============================");
		float s = 1.5f;
		float t = 1.2f;
		System.out.println("距离s = " + s + "m, 时间t = " + t + "s, 则速度v = " + (s/t) + "m/s");
		System.out.println("==============================");
		int a = 5;
		System.out.println("a: " + a);
		System.out.println("a++: " + (a++));
		System.out.println("a: " + a);
		System.out.println("++a: " + (++a));
		System.out.println("a: " + a);
		System.out.println("a--: " + (a--));
		System.out.println("a: " + a);
		System.out.println("--a: " + (--a));
		System.out.println("a: " + a);
	}
}
