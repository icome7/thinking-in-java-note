package com.iseven.thinkjava.chapter08;

import java.util.Arrays;
import java.util.Random;

/**
 * 练习2，3，4
 * @author yangchunming
 *
 */
public class Shapes {
	private static RandomShapeGenerator generator = new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] shapes = new Shape[9];
		for(int i=0; i<shapes.length; i++) {
			shapes[i] = generator.next();
		}
		System.out.println(Arrays.toString(shapes));
		for(Shape shape: shapes) {
			shape.draw();
			shape.fun();
		}
	}
}

class Shape {
	public void draw() {}
	public void erase() {}
	public void fun() {System.out.println("Shape.fun()");}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}
	@Override
	public void erase() {
		System.out.println("Circle.erase()");
	}
	@Override
	public void fun() {
		System.out.println("Circle.fun()");
	}
}
class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Square.draw()");
	}
	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}
}
class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}
	@Override
	public void erase() {
		System.out.println("Triangle.erase()");
	}
}
class Pentagon extends Shape {
	@Override
	public void draw() {
		System.out.println("Pentagon.draw()");
	}
	@Override
	public void erase() {
		System.out.println("Pentagon.erase()");
	}
}
class RandomShapeGenerator {
	private Random rand = new Random();
	public Shape next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
			case 3: return new Pentagon();
		}
	}
}