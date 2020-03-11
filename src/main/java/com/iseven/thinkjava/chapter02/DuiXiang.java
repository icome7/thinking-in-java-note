package com.iseven.thinkjava.chapter02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * 对象
 * @author cmyang
 *
 */
public class DuiXiang {
	
	static int si = 100;//静态变量
	
	public static void main(String[] args) {
		String s;//这是一个没有对象关联的一个引用
		String s1 = "asdf";//字符串可以用带引号的文本初始化
		String s2 = new String("asdf");//通过的初始化方法，使用 new 操作符，s2存放在栈中，new String("asdf")在堆中
		//基本数据类型，初始化无需new关键字，变量直接存储“值”，放在栈中。
		boolean b = true;//包装器类 Boolean
		char c = 'x';//包装器类 Character
		byte bt = 123;//8 bits，-128~127，Byte
		short st = 123;//16 bits, -2^15~2^15-1, Short
		int i = 123;//32 bits, -2^31~2^31-1, Integer
		long l = 123L;//64 bits, -2^63~2^63-1, Long
		float f = 123.1f;//32 bits, Float
		double d = 123.1d;//64 bits, Double
		
		Character ct = new Character('x');//包装器类可以在堆中创建一个非基本类型对象
		Character ct1 = 'x';//java SE5 之后可以自动将基本类型转换为包装器类型
		char c1 = ct1;//也可以反转
		
		//高精度数字
		BigInteger bi = new BigInteger("123214343242321");
		BigDecimal bd = new BigDecimal("123.22");//常用来计算金额
		
		//数组类型,数组中存的都是引用
		String[] strs = new String[3];
		System.out.println(Arrays.toString(strs));
		int[] ints = new int[3];
		System.out.println(Arrays.toString(ints));
		
		//作用域 决定了在其内定义的变量名的可见性和生命周期，由花括号的位置决定
		int x = 7;
		while(true) {
			int y = 8;
			//此处x,y都可以访问
			break;
		}
		//此处只能访问到x,不能访问到y
		
		int i1;
		//System.out.println(i1);//这样写编译器会报错
		ATypeName at = new ATypeName();
		System.out.println(at.num);
		System.out.println(at.str);
		System.out.println(at.ft);
		
		StaticTest staticTest1 = new StaticTest();
		StaticTest staticTest2 = new StaticTest();
		System.out.println(staticTest1.a);//对象调用，打印10
		System.out.println(StaticTest.a);//类名调用，打印10
		staticTest2.staticMethod();
		System.out.println(staticTest1.a);//打印11
	}
}

class ATypeName {
	int num;//成员变量基本类型，赋对应的默认值，int 为 0
	String str;//引用类型，赋默认值null
	float ft = 1.12f; 
	public void doSomething() {
		int a;
		String s;
		//System.out.println(a);//局部变量基本类型不赋值编译报错
		//System.out.println(s);//局部变量引用类型不赋值编译报错
		System.out.println(num);//0
		System.out.println(ft);//1.12
	}
}

class StaticTest {
	static int a = 10;//静态变量
	static void staticMethod() {//静态方法
		a++;
	}
}
