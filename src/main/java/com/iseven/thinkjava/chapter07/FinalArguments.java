package com.iseven.thinkjava.chapter07;

public class FinalArguments {
	void with(final Gizmo g) {
//		g = new Gizmo();//
	}
	
	void without(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}
	
	int g(final int i) {
		return i+1;
	}
}

class Gizmo {
	public void spin() {}
}
