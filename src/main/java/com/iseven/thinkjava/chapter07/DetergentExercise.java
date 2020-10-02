package com.iseven.thinkjava.chapter07;

/**
 * 练习11
 * @author yangchunming
 *
 */
public class DetergentExercise {
	Cleanser cleanser = new Cleanser();
	
	public void dilute() {
		cleanser.dilute();
	}
	
	public void apply() {
		cleanser.apply();
	}
	
	public void scrub() {
		cleanser.scrub();
	}
	
	public String toString() {
		return cleanser.toString();
	}
	
	public static void main(String[] args) {
		DetergentExercise detergentExercise = new DetergentExercise();
		detergentExercise.dilute();
		detergentExercise.apply();
		detergentExercise.scrub();
		System.out.println(detergentExercise.toString());
	}
}
