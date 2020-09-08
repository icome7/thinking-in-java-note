package com.iseven.thinkjava.chapter06;

import com.iseven.thinkjava.chapter06.access.Widget;
import com.iseven.thinkjava.chapter06.conn.Connection;
import com.iseven.thinkjava.chapter06.conn.ConnectionManager;
import com.iseven.thinkjava.chapter06.debug.PackageTest;
//import com.iseven.thinkjava.chapter06.debugoff.PackageTest;

public class PackageExample {
	public static void main(String[] args) {
		//练习3
		PackageTest test = new PackageTest();
		test.debug();
		//练习7
		new Widget();
		//练习8
//		new Connection();//无法直接创建对象
		Connection c = ConnectionManager.getConnection();
		System.out.println(c);
		c.f();
		Connection c1 = ConnectionManager.getConnection();
		System.out.println(c1);
		c1.f();
		Connection c2 = ConnectionManager.getConnection();
		System.out.println(c2);
		c2.f();
		Connection c3 = ConnectionManager.getConnection();
		System.out.println(c3);
//		c3.f();//调用3次后数组中不再有对象
	}
}
