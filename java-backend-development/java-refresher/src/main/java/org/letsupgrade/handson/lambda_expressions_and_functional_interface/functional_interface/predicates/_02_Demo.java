package org.letsupgrade.handson.lambda_expressions_and_functional_interface.functional_interface.predicates;

import java.util.function.Predicate;

public class _02_Demo {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		Predicate<Integer> p1 = (x) ->{
			return x%3==0 && x%5==0;
		};
		
		
		Predicate<Integer> p2 = (x) ->{
			return x%2==0 && x%5==0;
		};
		
		printNumbers(p1, numbers);
		printNumbers(p2, numbers);
		

	}
	public static void printNumbers(Predicate<Integer> p, int [] numbers) {
		for(int number:numbers) {
			if(p.test(number)) {
				System.out.println(number);
			}
		}
	}
	
	public static void m1() {
		
	}
}
