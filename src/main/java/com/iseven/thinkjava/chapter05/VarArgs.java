package com.iseven.thinkjava.chapter05;

import java.util.Arrays;

/**
 * 可变参数
 * @author yangchunming
 *
 */
public class VarArgs {
	public static void main(String... args) {
		printArgs(new Object[] {'a', "as", new Float(1.2)});
		printArgs(new Object[] {new A(), new A(), new A()});
		printArgs2(new Object[] {'a', "as", new Float(1.2)});
		printArgs2(new A(), new A(), new A());
		printArgs2('a', "as", new Float(1.2));
		printArgs2();//此时的入参是一个空数组，注意不是null
		System.out.println("==============================");
		printArgs3(1, "one");
		printArgs3(2, "one", "two");
		printArgs3(0);
//		printArgs3();编译报错
		printArgs4(1, new Integer("123"), 123);
		System.out.println((char) 12343.422);
		Character[] c = {'w'};
		f(1, c);
//		f('e');//报错，基本类型是可以相互转换的
		Character c1 = 'w';
		float s = 12.2f;
		f1((char)s);
		System.out.println("==============================");
		//练习19
		strVar("H", "E", "L", "L", "O");
		strVar(new String[]{"H", "E", "L", "L", "O"});
		System.out.println("==============================");
		//练习20
		System.out.println(Arrays.toString(args));
	}
	
	static void printArgs(Object[] args) {
		System.out.println("fun printArgs");
		for(Object arg: args) {
			System.out.print(arg + " ");
		}
		System.out.println();
	}
	
	static void printArgs2(Object... args) {
		System.out.println("fun printArgs2");
		for(Object arg: args) {
			System.out.print(arg + " ");
		}
		System.out.println();
	}
	
	static void printArgs3(int required, String... trailing) {
		System.out.println("fun printArgs3");
		System.out.print("requried: " + required + " ");
		for(Object arg: trailing) {
			System.out.print(arg + " ");
		}
		System.out.println();
	}
	
	static void printArgs4(Integer...integers) {
		System.out.println("fun printArgs4");
	}
	
	static void f(float i, Character... characters) {
		System.out.println("first");
	}
	
	static void f(Character... characters) {
		System.out.println("second");
	}
	
	static void f1(char characters) {
		System.out.println("third");
	}
	
	static void strVar(String... strings) {
		System.out.println("fun strVar");
		for(String str: strings) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
}

class A {}
