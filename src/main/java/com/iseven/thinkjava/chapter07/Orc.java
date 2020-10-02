package com.iseven.thinkjava.chapter07;

public class Orc extends Villain {
	private int orcNumber;

	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}

	public void change(String name, int orcNumber) {
		set(name);
		this.orcNumber = orcNumber;
	}

	public String toString() {
		return "Orc orcNumber :" + orcNumber + ", " + super.toString();
	}

	public static void main(String[] args) {
		Orc orc = new Orc("AA", 100);
		System.out.println(orc);
		orc.change("BB", 200);
		System.out.println(orc);
	}
}

class Villain {
	private String name;

	protected void set(String name) {
		this.name = name;
	}

	public Villain(String name) {
		this.name = name;
	}

	public String toString() {
		return "Villian name : " + name;
	}
}