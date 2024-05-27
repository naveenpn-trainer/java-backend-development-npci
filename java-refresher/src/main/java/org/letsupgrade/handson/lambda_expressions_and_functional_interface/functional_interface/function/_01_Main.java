package org.letsupgrade.handson.lambda_expressions_and_functional_interface.functional_interface.function;

import java.util.function.Function;

public class _01_Main {

	public static void example_01() {
		Function<String, Integer> verboseFunction = (String s) -> s.length();
		System.out.println(verboseFunction.apply("Lets Upgrade"));
		
		Function<String, Integer> consiseFunction = s -> s.length();
		System.out.println(consiseFunction.apply("Lets Upgrade"));
		
	}
	public static void main(String[] args) {
		example_01();
	}
}
