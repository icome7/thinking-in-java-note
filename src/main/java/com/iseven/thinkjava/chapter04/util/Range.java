package com.iseven.thinkjava.chapter04.util;

/**
 * 生成指定数组
 * @author iuy
 *
 */
public class Range {
	
	/**
	 * 
	 * @param begin 
	 * @param end
	 * @param step
	 * @return
	 */
	public static int[] range(int begin, int end, int step) {
		int length = (end - begin)/step;
		length = (end - begin)%step == 0 ? length : ++length;
		int[] result = new int[length];
		for(int i=begin, j=0; i<end; i+=step, j++) {
			result[j] = i;
		}
		return result;
	}
	
	/**
	 * 
	 * @param begin
	 * @param end
	 * @return
	 */
	public static int[] range(int begin, int end) {
		return range(begin, end, 1);
	}
	
	/**
	 * 
	 * @param end
	 * @return
	 */
	public static int[] range(int end) {
		return range(0, end, 1);
	}
	
	public static void printArr(int[] arr) {
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printArr(range(11));
		printArr(range(12));
		printArr(range(5, 11));
		printArr(range(7, 12));
		printArr(range(5, 11, 2));
		printArr(range(7, 12, 3));
	}
}
