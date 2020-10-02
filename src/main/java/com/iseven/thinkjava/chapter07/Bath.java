package com.iseven.thinkjava.chapter07;

/**
 * 组合
 * @author yangchunming
 *
 */
public class Bath {
	Soap soap;

	public Bath() {
		System.out.println("Bath Contructor");
	}
	
	void f() {
		System.out.println("Bath f()");
		soap = new Soap();
		soap.f();
	}
	
	public static void main(String[] args) {
		//练习1
		Bath bath = new Bath();
		bath.f();
	}
}
