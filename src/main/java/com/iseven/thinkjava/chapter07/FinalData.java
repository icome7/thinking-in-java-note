package com.iseven.thinkjava.chapter07;

import java.util.Random;

public class FinalData {
	
	private static Random rand = new Random(47);
	
	private final int valueOne = 9;
	
	private static final int VALUE_TWO = 99;
	
	private final int val3 = rand.nextInt(20);
	
	private static final int VAULE_THREE = rand.nextInt(20);
	
	public static void main(String[] args) {
		//练习18
		FinalData finalData = new FinalData();
//		finalData.valueOne++;
		System.out.println(finalData.val3);
		System.out.println(finalData.VAULE_THREE);
		FinalData finalData1 = new FinalData();
		System.out.println(finalData1.val3);
		System.out.println(finalData1.VAULE_THREE);
	}
}

class Value {
	int i;
	public Value(int i) {
		this.i = i;
	}
}