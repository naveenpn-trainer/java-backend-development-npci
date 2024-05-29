package org.letsupgrade.handson.collection_framework.iteration;

import java.util.Arrays;
import java.util.List;

public class _01_IterationUsingForLoops {
	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4, 5, 6 };
		List<Integer> numbersList = Arrays.asList(numbers);

		for (int number : numbersList) {
			System.out.println(number);
		}

		numbersList.forEach(number -> {
			System.out.println(number);
		});

		numbersList.forEach(number -> System.out.println(number));
		System.out.println("*****");
		numbersList.forEach(System.out::println);
	}
}
