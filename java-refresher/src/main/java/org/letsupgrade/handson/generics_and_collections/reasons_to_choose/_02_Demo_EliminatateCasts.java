package org.letsupgrade.handson.generics_and_collections.reasons_to_choose;

import java.util.ArrayList;
import java.util.List;

public class _02_Demo_EliminatateCasts {
	public static void main(String[] args) {
		List<String> withoutGenerics = new ArrayList();
		withoutGenerics.add("Hello");
		withoutGenerics.add("Hi");

		for (String o : withoutGenerics) {
			System.out.println(o);
		}

	}
}
