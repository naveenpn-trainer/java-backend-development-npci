package org.letsupgrade.handson.fundamentals;

/*
 * 1. Array Declaration
 * 2. Array Instantiation
 * 3. Array Initialization
 */
public class _01_WorkingWithArrays {
	public static void main(String[] args) {
		// Array Declaration, Instantiation and Initialization
		int[] numbers = {10,20,30};
		System.out.println("Array size: "+numbers.length);
		System.out.println("For Loop");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("Enhanced For Loop");
		for(int number:numbers) {
			System.out.println(number);
		}
	}
}
