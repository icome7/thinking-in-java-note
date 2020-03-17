package com.iseven.thinkjava.chapter02.exercise;

public class FirstExercise {
	int a;
	char b;
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("==============================");
		FirstExercise f = new FirstExercise();
		System.out.println("a = " + f.a + ", b = " + f.b);
		System.out.println("==============================");
		ATypeName aTypeName = new ATypeName();
		aTypeName.printTest();
		System.out.println("==============================");
		DataOnly data = new DataOnly();
		data.printTest();
		System.out.println("===============");
		data.i = 47;
		data.d = 1.1;
		data.b = false;
		data.printTest();
		System.out.println("==============================");
		String s = "storage测试";
		System.out.println(s);
		System.out.println(f.storage(s));
		System.out.println("==============================");
		System.out.println("i = " + StaticTest.i);
		Incrementable incrementable = new Incrementable();
		incrementable.increment();
		System.out.println("i = " + StaticTest.i);
		Incrementable.increment();
		System.out.println("i = " + StaticTest.i);
		System.out.println("==============================");
		StaticTest staticTest1 = new StaticTest();
		StaticTest staticTest2 = new StaticTest();
		staticTest1.i = 100;
		System.out.println(staticTest1.i == staticTest2.i);
		System.out.println("==============================");
		//直接运行下面输出语句会报错，需要在运行参数里加上至少3个参数，例如：a=123 b=abc c=接口
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		System.out.println("==============================");
		AllTheColorsOfTheRainBow allTheColorsOfTheRainBow = new AllTheColorsOfTheRainBow();
		System.out.println(allTheColorsOfTheRainBow.anIntegerRepresentingColors);
		allTheColorsOfTheRainBow.changeTheHueOfTheColor(7);
		System.out.println(allTheColorsOfTheRainBow.anIntegerRepresentingColors);
	}
	
	int storage(String s) {
		return s.length() * 2;
	}
}

class ATypeName {
	void printTest() {
		System.out.println("ATypeName printTest...");
	}
}

class DataOnly {
	int i;
	double d;
	boolean b;
	void printTest() {
		System.out.println("DataOnly printTest...");
		System.out.println("i = " + i);
		System.out.println("d = " + d);
		System.out.println("b = " + b);
	}
}

class StaticTest {
	static int i = 47;
}

class Incrementable {
	static void increment() {
		StaticTest.i++;
	}
}

class WrapperClass {
	Character a = 'x';
	Byte b = 1;
	Short c = 1;
	Integer d = 1;
	Long e = 1L;
	Float f = 1.1f;
	Double g= 1.1d;
	Boolean h = true;
}

class AllTheColorsOfTheRainBow {
	int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue) {
		System.out.println("new hue: " + newHue);
		anIntegerRepresentingColors = newHue;
	}
}
