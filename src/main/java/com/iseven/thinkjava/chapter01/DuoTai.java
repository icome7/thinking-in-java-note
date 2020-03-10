package com.iseven.thinkjava.chapter01;

/**
 * 多态
 * @author cmyang
 *
 */
public class DuoTai {
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		Circle circle = new Circle();
		Line line = new Line();
		Hexagon hexagon = new Hexagon();
		doSomething(shape);
		System.out.println("==================");
		doSomething(circle);
		System.out.println("==================");
		doSomething(line);
		System.out.println("==================");
		doSomething(hexagon);
	}
	
	private static void doSomething(Shape shape) {
		shape.draw();
		shape.erase();
	}
}

class Shape {
	void draw() {
		System.out.println("画一个图形");
	}
	void erase(){
		System.out.println("擦掉一个图形");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("画一个圆形");
	}
	void erase(){
		System.out.println("擦掉一个圆形");
	}
}

class Line extends Shape {
	void draw() {
		System.out.println("画一条线");
	}
	void erase(){
		System.out.println("擦掉一条线");
	}
}

class Hexagon extends Shape {
	void draw() {
		System.out.println("画一个六边形");
	}
	void erase(){
		System.out.println("擦掉一个六边形");
	}
}
