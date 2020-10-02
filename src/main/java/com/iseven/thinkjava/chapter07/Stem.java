package com.iseven.thinkjava.chapter07;

/**
 *练习9,10
 * @author yangchunming
 *
 */
public class Stem extends Root {
	Component1 component1 = new Component1(1);
	Component2 component2 = new Component2(2);
	Component3 component3 = new Component3(3);
	
	Stem(int i){
		super(i);
		System.out.println("Stem constructor");
	}
	
	public static void main(String[] args) {
		new Stem(11);
	}
}

class Root {
	Component1 component1 = new Component1(1);
	Component2 component2 = new Component2(2);
	Component3 component3 = new Component3(3);
	
//	Root(){
//		System.out.println("Root constructor");
//	}
	
	Root(int i){
		System.out.println("Root constructor");
	}
}

class Component1 {
//	Component1() {
//		System.out.println("Component1 constructor");
//	}
	Component1(int i) {
		System.out.println("Component1 constructor");
	}
}

class Component2 {
//	Component2() {
//		System.out.println("Component2 constructor");
//	}
	Component2(int i) {
		System.out.println("Component2 constructor");
	}
}

class Component3 {
//	Component3() {
//		System.out.println("Component3 constructor");
//	}
	Component3(int i) {
		System.out.println("Component3 constructor");
	}
}
