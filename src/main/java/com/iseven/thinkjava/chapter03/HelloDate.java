package com.iseven.thinkjava.chapter03;

import static com.iseven.thinkjava.chapter03.util.Print.print;

import java.util.Date;

/**
 * 测试静态导入
 * @author cmyang
 *
 */
public class HelloDate {
	
	public static void main(String[] args) {
		print("Hello, it's: ");
		print(new Date());
	}

}
