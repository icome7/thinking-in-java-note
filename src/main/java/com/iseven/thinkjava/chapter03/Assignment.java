package com.iseven.thinkjava.chapter03;

/**
 * 测试赋值
 * @author cmyang
 *
 */
public class Assignment {
	public static void main(String[] args) {
		int a = 1, b = 2;
		System.out.println("a = " + a + "; b = " + b);
		a = b;
		System.out.println("a = " + a + "; b = " + b);
		b = 3;
		System.out.println("a = " + a + "; b = " + b);
		System.out.println("==============================");
		char c = 'x', d = 'y';
		System.out.println("c = " + c + "; d = " + d);
		c = d;
		System.out.println("c = " + c + "; d = " + d);
		d = 'z';
		System.out.println("c = " + c + "; d = " + d);
		System.out.println("==============================");
		/* 创建一个名为@659e0bfd的一块堆内存空间，
		 * t1在栈空间存储的值为“@659e0bfd”
		 * 名为@659e0bfd的堆空间里装着一个Tank对象，
		 * @659e0bfd堆空间中的Tank对象的level值为0
		 */
		Tank t1 = new Tank();
		/* 创建一个名为@2a139a55的一块堆内存空间，
		 * t1在栈空间存储的值为“@2a139a55”
		 * 名为@2a139a55的堆空间里装着一个Tank对象，
		 * @2a139a55堆空间中的Tank对象的level值为0
		 */
		Tank t2 = new Tank();
		/* t1根据存储在栈空间的值@659e0bfd，
		 * 找到@659e0bfd堆空间中的对象，
		 * 并修改该对象的level值为9
		 */
		t1.level = 9;
		/* t2根据存储在栈空间的值@2a139a55，
		 * 找到@2a139a55堆空间中的对象，
		 * 并修改该对象的level值为47
		 */
		t2.level = 47;
		/* t1根据存储在栈空间的值@659e0bfd，找到@659e0bfd堆空间中的对象，输出t1.level的值
		 * t2根据存储在栈空间的值@2a139a55，找到@2a139a55堆空间中的对象，输出t2.level的值
		 * */
		System.out.println("t1.level = " + t1.level + "; t2.level = " + t2.level);
		/* 将t2存储在栈空间的值@2a139a55复制给t1
		 * 这时候t1将t1对应栈空间的值@659e0bfd替换成t2复制过来的值@2a139a55
		 * t1对应的栈空间的值为@2a139a55
		 * 现在没有任何引用指向名为@659e0bfd的堆空间中的对象，垃圾回收器会删除对象，释放内存空间
		 * */
		t1 = t2;
		/* t1根据存储在栈空间的值@2a139a55，找到@2a139a55堆空间中的对象，输出t1.level的值
		 * t2根据存储在栈空间的值@2a139a55，找到@2a139a55堆空间中的对象，输出t2.level的值
		 * 由于t1和t2栈中存储的值一样，所有会找到同一个堆空间中的对象。所以输出值一样
		 * */
		System.out.println("t1.level = " + t1.level + "; t2.level = " + t2.level);
		/* t1根据存储在栈空间的值@2a139a55，
		 * 找到@2a139a55堆空间中的对象，
		 * 并修改该对象的level值为27
		 */
		t1.level = 27;
		System.out.println("t1.level = " + t1.level + "; t2.level = " + t2.level);
		System.out.println("==============================");
		FloatTest ft1 = new FloatTest();
		FloatTest ft2 = new FloatTest();
		ft1.f = 0.1f;
		ft2.f = 2.3f;
		System.out.println("ft1.f = " + ft1.f + "; ft2.f = " + ft2.f);
		ft1 = ft2;
		System.out.println("ft1.f = " + ft1.f + "; ft2.f = " + ft2.f);
		ft2.f = 3.0f;
		System.out.println("ft1.f = " + ft1.f + "; ft2.f = " + ft2.f);
		System.out.println("==============================");
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1: x.c: " + x.c);
		f(x);
		System.out.println("2: x.c: " + x.c);
		System.out.println("==============================");
		FloatTest ft3 = new FloatTest();
		ft3.f = 3.14f;
		System.out.println("1: ft3.f: " + ft3.f);
		changeNum(ft3);
		System.out.println("2: ft3.f: " + ft3.f);
	}
	
	static void f(Letter y) {
		y.c = 'z';
	}
	
	static void changeNum(FloatTest ft) {
		ft.f = 101.01f;
	}
}

class Tank {
	int level;
}

class FloatTest {
	float f;
}

class Letter {
	char c;
}
