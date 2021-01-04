package com.iseven.thinkjava.chapter08;

public class FieldAccess {
	public static void main(String[] args) {
		Super s = new Sub();
		System.out.println(s.field);
		System.out.println(s.getField());
		System.out.println(s.field1);
		Sub s1 = new Sub();
		System.out.println(s1.field);
		System.out.println(s1.getField());
		System.out.println(s1.getSuperField());
		System.out.println(s.field1);
	}
}

class Super {
	public int field = 0;
	public int field1 = 10;
	
	public int getField() {
		return field;
	}
}

class Sub extends Super {
	public int field = 1;
	public int getField() {
		return field;
	}
	public int getSuperField() {
		return super.field;
	}
}