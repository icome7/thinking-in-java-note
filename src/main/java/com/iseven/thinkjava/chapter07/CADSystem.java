package com.iseven.thinkjava.chapter07;

public class CADSystem extends Shap{
	
	private Circle circle;
	private Triangle triangle;
	private Line[] lines = new Line[3];
	
	public CADSystem(int i) {
		super(i + 1);
		for(int j=0; j<lines.length; j++) {
			lines[j] = new Line(j, j*j);
		}
		circle = new Circle(i);
		triangle = new Triangle(i);
		System.out.println("CADSystem constructor");
	}
	
	public void dispose() {
		System.out.println("CADSystem dispose()");
		triangle.dispose();
		circle.dispose();
		for(Line line: lines) {
			line.dispose();
		}
		super.dispose();
	}
	
	public static void main(String[] args) {
		CADSystem cadSystem = new CADSystem(7);
		try {
			
		} finally {
			cadSystem.dispose();
		}
	}
}

class Shap {
	
	Shap(int i) {
		System.out.println("Shap constructor");
	}
	
	void dispose() {
		System.out.println("Shap dispose");
	}
}

class Circle extends Shap {
	
	Circle(int i) {
		super(i);
		System.out.println("Drawing Circle");
	}
	
	void dispose() {
		System.out.println("Erasing Circle");
		super.dispose();
	}
}

class Triangle extends Shap {
	
	Triangle(int i) {
		super(i);
		System.out.println("Drawing Triangle");
	}
	
	void dispose() {
		System.out.println("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shap {
	private int start;
	private int end;
	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing Line : " + start + ", " + end);
	}
	
	void dispose() {
		System.out.println("Erasing Line : " + start + ", " + end);
		super.dispose();
	}
}