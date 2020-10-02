package com.iseven.thinkjava.chapter07;

public class Hide {
	public static void main(String[] args) {
		Bart bart = new Bart();
		bart.doh('a');
		bart.doh(1.1f);
		bart.doh(new Milhouse());
	}
}

class Homer {
	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}
	
	float doh(float f) {
		System.out.println("doh(float)");
		return 1.2f;
	}
}


class Milhouse {
	
}

class Bart extends Homer {
	void doh(Milhouse milhouse) {
		System.out.println("doh(Milhouse)");
	}
}

class Lisa extends Homer {
//	@Override
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");
	}
}
