package org.letsupgrade.handson.lambda_expressions_and_functional_interface;

class Greeter1 {
	public void greet() {
		System.out.println("Hello World");
	}

}

public class _01_Greeter {
	public static void main(String[] args) {
		Greeter1 greeter = new Greeter1();
		greeter.greet();
	}
}
