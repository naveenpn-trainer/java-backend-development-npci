package org.letsupgrade.handson.fundamentals;

import java.util.Arrays;

public class ArraysEquality {
	public static void main(String[] args) {
		int[] numbers1 = { 1, 2, 3, 4 };
		int[] numbers2 = { 1, 2, 3, 4 };
		System.out.println(numbers1==numbers2);
		System.out.println(Arrays.equals(numbers1, numbers2));
	}
}
