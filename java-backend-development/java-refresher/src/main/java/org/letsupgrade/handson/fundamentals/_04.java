package org.letsupgrade.handson.fundamentals;

public class _04 {

	public static void main(String[] args) {
		int [] numbers = {1,2,3};
		System.out.println(numbers[2]);
		modify(numbers);
		System.out.println(numbers[2]);
	}
	
	public static void modify(int []arr) {
		arr[2] = 100;
	}
}
