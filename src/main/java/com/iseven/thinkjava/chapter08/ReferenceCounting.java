package com.iseven.thinkjava.chapter08;

/**
 * 练习13
 * @author yangchunming
 *
 */
public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composings = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
		for(Composing composing: composings) {
			composing.dispose();
		}
	}
}

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared() {
		System.out.println("Creating " + this);
	}
	public void addRef() {
		refcount++;
	}
	protected void dispose() {
		if(--refcount == 0) {
			System.out.println("dispose " + this);
		}
	}
	@Override
	public String toString() {
		return "Shared " + id;
	}
	
	@Override
	protected void finalize() throws Throwable {
		if(refcount > 0) {
			System.out.println("还存在被引用的对象");
		}
		super.finalize();
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose() {
		System.out.println("disposing " + this);
		this.shared.dispose();
	}
	@Override
	public String toString() {
		return "Composing " + id;
	}
}