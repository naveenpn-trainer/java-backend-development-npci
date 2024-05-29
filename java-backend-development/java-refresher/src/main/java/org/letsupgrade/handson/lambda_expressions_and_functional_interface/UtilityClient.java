package org.letsupgrade.handson.lambda_expressions_and_functional_interface;


class Utility
{
	@Deprecated
	public void encrypt() {
		System.out.println("Logic");
	}
	
	public void newEncript() {
		System.out.println("New Logic");
	}
}
public class UtilityClient {

	public static void main(String[] args) {
		new Utility().encrypt();
	}
}
