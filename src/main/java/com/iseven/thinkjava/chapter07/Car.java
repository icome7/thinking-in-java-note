package com.iseven.thinkjava.chapter07;

public class Car {
	public Engine engine = new Engine();
	public Wheel[] wheels = new Wheel[4];
	public Door left = new Door();
	public Door right = new Door();
	public Car() {
		for(int i=0; i<4; i++) {
			wheels[i] = new Wheel();
		}
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.left.window.rollup();
		car.wheels[0].inflate(72);
		//练习14
		car.engine.service();
	}
}

class Engine {
	public void start() {}
	public void rev() {}
	public void stop() {}
	public void service() {}
}

class Wheel {
	public void inflate(int psi) {}
}

class Window {
	public void rollup() {}
	public void rolldown() {}
}

class Door {
	public Window window = new Window();
	public void open() {}
	public void close() {}
}