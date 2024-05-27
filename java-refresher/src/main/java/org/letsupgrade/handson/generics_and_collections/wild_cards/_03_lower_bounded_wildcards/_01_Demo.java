package org.letsupgrade.handson.generics_and_collections.wild_cards._03_lower_bounded_wildcards;

import java.util.ArrayList;
import java.util.List;

public class _01_Demo {

	public static void addElement(List<? super Integer> list) {
		list.add(10);
		list.add(20);
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		List<Number> numberList = new ArrayList<>();
		addElement(numberList);
	}
}
