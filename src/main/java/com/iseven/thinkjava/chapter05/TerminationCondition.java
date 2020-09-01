package com.iseven.thinkjava.chapter05;

/**
 * 终结条件
 * @author yangchunming
 *
 */
public class TerminationCondition {
	public static void main(String[] args) {
		Book book = new Book(true);
		book.checkIn();
		new Book(true);
		System.gc();
		//练习10
		new Books();
		//练习11
		System.gc();
		//练习12
		Tank tank1 = new Tank();
		tank1.getState();
		tank1.start();
		tank1.getState();
		tank1.clear();
		tank1.getState();
		//测试发现如果用一个引用接受new的对象，下面就不打印finalize方法的内容
		new Tank().start();
		System.gc();
	}
}

class Book {
	boolean checkedOut = false;
	
	Book(boolean checkOut) {
		checkedOut = checkOut;
	}
	
	void checkIn() {
		checkedOut = false;
	}
	
	protected void finalize() {
		if(checkedOut) {
			System.out.println("error: checked out");
		}
//		super.finalize();
	}
}

class Books {
	Books() {
		System.out.println("Books...");
	}
	protected void finalize() {
		System.out.println("hello");
	}
}

class Tank {
	String state = "empty";
	
	Tank() {
		System.out.println("ss");
	}
	
	void start() {
		state = "full";
	}
	
	void clear() {
		state = "empty";
	}
	
	void getState() {
		System.out.println("state --> " + state);
	}
	
	protected void finalize() {
		if(!"empty".equals(state)) {
			System.out.println("this tank is not empty!");
		}
	}
}