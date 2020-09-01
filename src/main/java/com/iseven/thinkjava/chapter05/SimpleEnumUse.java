package com.iseven.thinkjava.chapter05;

/**
 * 枚举
 * @author yangchunming
 *
 */
public class SimpleEnumUse {
	public static void main(String[] args) {
		Spiciness howHot = Spiciness.MEDIUM;
		System.out.println(howHot);
		for(Spiciness s: Spiciness.values()) {
			System.out.println(s + ", ordinal " + s.ordinal());
		}
		
		switchTest(howHot);
		
		System.out.println("==============================");
		//练习21
		for(MoneyEnum m: MoneyEnum.values()) {
			System.out.println(m + ", ordinal " + m.ordinal());
			//练习22
			switchTest2(m);
		}
	}
	
	static void switchTest(Spiciness spiciness) {
		switch(spiciness) {
			case NOT: System.out.println("1"); break;
			case MILD: 
			case MEDIUM: System.out.println("3"); break;
			case HOT: break;
			case FLAMING:
			default: System.out.println("default");
		}
	}
	
	static void switchTest2(MoneyEnum moneyEnum) {
		switch(moneyEnum) {
			case FEN: System.out.println("分"); break;
			case JIAO: System.out.println("角"); break;
			case YUAN: System.out.println("元"); break;
			default: System.out.println("default");
		}
	}
}
