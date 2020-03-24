package com.iseven.thinkjava.chapter03;

public class Equivalence {
	public static void main(String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println("1: " + (n1 == n2));
		System.out.println("2: " + (n1 != n2));
		System.out.println("3: " + (n1.equals(n2)));
		System.out.println("==============================");
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println("4: " + (v1.equals(v2)));
		System.out.println("==============================");
		Dog dog1 = new Dog();
		dog1.name = "spot";
		dog1.says = "Ruff!";
		Dog dog2 = new Dog();
		dog2.name = "scruffy";
		dog2.says = "Wurf!";
		System.out.println("name: " + dog1.name + ", says: " + dog1.says);
		System.out.println("name: " + dog2.name + ", says: " + dog2.says);
		System.out.println("==============================");
		Dog dog3 = dog1;
		System.out.println("dog1 == dog2: " + (dog1 == dog2));
		System.out.println("dog1.equals(dog2): " + (dog1.equals(dog2)));
		System.out.println("dog1 == dog3: " + (dog1 == dog3));
		System.out.println("dog1.equals(dog3): " + (dog1.equals(dog3)));
		System.out.println("dog2 == dog3: " + (dog2 == dog3));
		System.out.println("dog2.equals(dog3): " + (dog2.equals(dog3)));
	}
}

class Value {
	int i;
}

class Dog {
	String name;
	String says;
}