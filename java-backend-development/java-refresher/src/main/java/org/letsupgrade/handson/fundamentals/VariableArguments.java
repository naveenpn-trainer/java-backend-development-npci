package org.letsupgrade.handson.fundamentals;

public class VariableArguments {

	public static void main(String[] args) {
		System.out.println(add(1,3));
		System.out.println(add(1,3,4));
		System.out.println(add(1,3,6,7));
	}
	
	public static int add(int ...numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum=sum+number;
		}
		return sum;
	}
	
}
