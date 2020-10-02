package com.iseven.thinkjava.chapter07;

/**
 * 练习12
 * 
 * @author yangchunming
 *
 */
public class StemExercise extends RootExercise {
	ComponentExercise1 component1 = new ComponentExercise1(1);
	ComponentExercise2 component2 = new ComponentExercise2(2);
	ComponentExercise3 component3 = new ComponentExercise3(3);

	StemExercise(int i) {
		super(i);
		System.out.println("StemExercise constructor");
	}

	void dispose() {
		component3.dispose();
		component2.dispose();
		component1.dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		StemExercise s = new StemExercise(11);
		try {
			
		} finally {
			s.dispose();
		}
	}
}

class RootExercise {
	ComponentExercise1 component1 = new ComponentExercise1(1);
	ComponentExercise2 component2 = new ComponentExercise2(2);
	ComponentExercise3 component3 = new ComponentExercise3(3);

	RootExercise(int i) {
		System.out.println("RootExercise constructor");
	}

	void dispose() {

	}
}

class ComponentExercise1 {
	ComponentExercise1(int i) {
		System.out.println("ComponentExercise1 constructor");
	}

	void dispose() {

	}
}

class ComponentExercise2 {
	ComponentExercise2(int i) {
		System.out.println("ComponentExercise2 constructor");
	}

	void dispose() {

	}
}

class ComponentExercise3 {
	ComponentExercise3(int i) {
		System.out.println("ComponentExercise3 constructor");
	}

	void dispose() {

	}
}
