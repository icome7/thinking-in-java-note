package com.iseven.thinkjava.chapter07;

public class FinalOverridingIllusion {
	public static void main(String[] args) {
		WithFinals wf = new WithFinals();
//		wf.f();
//		wf.g();
		OverridingPrivate op = new OverridingPrivate();
//		op.f();
//		op.g();
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		System.out.println("==============================");
		//向上转型会体现出差异
		OverridingPrivate op3 = new OverridingPrivate2();
//		op3.f();
		op3.f2();
		OverridingPrivate2 op4 = new OverridingPrivate2();
		op4.f();
		op4.f2();
	}
}

class WithFinals {
	private final void f() {
		System.out.println("WithFinals f()");
	}
	
	private void g() {
		System.out.println("WithFinals g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}
	
	private void g() {
		System.out.println("OverridingPrivate.g()");
	}
	
	private void h() {
		System.out.println("OverridingPrivate.h()");
	}
	
	public final void f1() {
		System.out.println("OverridingPrivate.f1()");
	}
	
	public void f2() {
		System.out.println("OverridingPrivate.f2()");
	}
}
class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}
	
	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
	//练习20
//	@Override
//	public void h() {
//		
//	}
	//练习21
//	public final void f1() {
//		System.out.println("OverridingPrivate2.f1()");
//	}
	
	public void f2() {
		System.out.println("OverridingPrivate2.f2()");
	}
}
