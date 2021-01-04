package com.iseven.thinkjava.chapter08;

/**
 * 练习1,5,17
 * @author yangchunming
 *
 */
public class PeopleTest {
	void ride(Cycle c) {
		c.run();
		System.out.println(c.wheels());
	}
	
	public static void main(String[] args) {
		PeopleTest p = new PeopleTest();
		p.ride(new Cycle());
		p.ride(new Unicycle());
		p.ride(new Bicycle());
		p.ride(new Tricycle());
		System.out.println("==============================");
		Cycle cycles[] = new Cycle[] {new Unicycle(), new Bicycle(), new Tricycle()};
		for(Cycle c: cycles) {
			((Unicycle) c).balance();
			((Bicycle) c).balance();
		}
	}
}

class Cycle {
	public void run() {
		System.out.println("Cycle Run");
	}

	public int wheels() {
		System.out.println("Cycle.wheels()");
		return 0;
	}
}

class Unicycle extends Cycle{
	public void run() {
		System.out.println("Unicycle Run");
	}
	public int wheels() {
		System.out.println("Unicycle.wheels()");
		return 1;
	}
	public void balance() {
		System.out.println("Unicycle balance");
	}
}

class Bicycle extends Cycle {
	public void run() {
		System.out.println("Bicycle Run");
	}
	public int wheels() {
		System.out.println("Bicycle.wheels()");
		return 2;
	}
	public void balance() {
		System.out.println("Bicycle balance");
	}
}
class Tricycle extends Cycle {
	public void run() {
		System.out.println("Tricycle Run");
	}
	public int wheels() {
		System.out.println("Tricycle.wheels()");
		return 3;
	}
}
