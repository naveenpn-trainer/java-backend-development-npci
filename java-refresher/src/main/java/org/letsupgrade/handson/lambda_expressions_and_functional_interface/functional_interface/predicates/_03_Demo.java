package org.letsupgrade.handson.lambda_expressions_and_functional_interface.functional_interface.predicates;

import java.util.function.Predicate;

public class _03_Demo {
	public static void main(String[] args) {
		/*
		 * Predicate<String> isEmptyPredicate = (String s) -> s.isEmpty();
		 * Predicate<String> isEmptyPredicate = (s) -> s.isEmpty();
		 * Predicate<String> isEmptyPredicate = s -> s.isEmpty();
		 * Predicate<String> isEmptyPredicate = String::isEmpty;
		 */
		// Methods Reference
		Predicate<String> isEmptyPredicate = String::isEmpty;
		System.out.println(isEmptyPredicate.test(""));
		
		Predicate<String> isNotEmpty = isEmptyPredicate.negate();
		System.out.println(isNotEmpty.test("abc"));
		
		Predicate<String> isShort  = s -> s.length() < 5;
		
		Predicate<String> isShortAndNotEmpty = isShort.and(isNotEmpty);
		System.out.println(isShortAndNotEmpty.test("xyz"));
	}
}
