package org.letsupgrade.handson.generics_and_collections.wild_cards._02_upper_bounded_wildcards;

import java.util.Arrays;
import java.util.List;

public class _01_Demo {

	public static double sumOfNumbersRefactored(List<? extends Number> list) {
		double sum = 0.0;
		for (Number number : list) {
			sum += number.doubleValue();
		}
		return sum;
	}

	public static void sumOfNumbers(List<? extends Number> list) {
		Number sum = 0;
		for (Number i : list) {
			if (i instanceof Integer) {
				sum = sum.intValue() + i.intValue();
			} else if (i instanceof Double || i instanceof Float) {
				sum = sum.doubleValue() + i.doubleValue();
			}
		}
		System.out.println(sum);
	}


	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4);
		System.out.println((int) sumOfNumbersRefactored(intList));

		List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5, 4.6);
		System.out.println(sumOfNumbersRefactored(doubleList));
		List<String> strList = Arrays.asList("Ram", "Krishna");
	}
}
