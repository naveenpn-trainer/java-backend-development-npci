package org.letsupgrade.handson.lambda_expressions_and_functional_interface.functional_interface.predicates;

import java.util.function.Predicate;

public class _01_Demo {
public static void main(String[] args) {
	
	Predicate<String> isEmptyPredicate = (String s) -> s.isEmpty();
	System.out.println(isEmptyPredicate.test("sfds"));
}
}
