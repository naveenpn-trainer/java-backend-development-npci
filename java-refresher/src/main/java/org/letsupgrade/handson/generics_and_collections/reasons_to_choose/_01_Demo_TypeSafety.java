package org.letsupgrade.handson.generics_and_collections.reasons_to_choose;

import java.util.ArrayList;
import java.util.List;

public class _01_Demo_TypeSafety {
	public static void main(String[] args) {
		List withoutGenerics = new ArrayList();
		withoutGenerics.add("Hello");
		withoutGenerics.add(23.5);
		
		/*
		 * for(Object o:withoutGenerics) { String s = (String)o; System.out.println(s);
		 * }
		 */
		
		List<String> listWithGenerics = new ArrayList<>();
		listWithGenerics.add("Hello");
		listWithGenerics.add("Hi");
		for(String str:listWithGenerics) {
			System.out.println(str);
		}
	}
}
