package org.letsupgrade.handson.generics_and_collections.wild_cards._01_unbounded_wildcard;

import java.util.Arrays;
import java.util.List;

public class _01_Demo {

	
	// Using wildcard
	public static void print(List<?> list) {
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ram","Krishna","Balaram");
		print(names);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		print(numbers);
		
	}
}
