package org.letsupgrade.handson.lambda_expressions_and_functional_interface.functional_interface.suppliers;

import java.util.function.Supplier;

public class _01_Main {
	public static void main(String[] args) {
		Supplier<Double> randomNumberSupplier = () -> Math.random();
		System.out.println(randomNumberSupplier.get());
	}
}
