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
	}
}
