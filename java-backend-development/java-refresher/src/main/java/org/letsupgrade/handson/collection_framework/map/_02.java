package org.letsupgrade.handson.collection_framework.map;

import java.util.Map;
import java.util.TreeMap;

public class _02 {
	public static void main(String[] args) {
		Map<String, Integer> numberMapping = new TreeMap<String, Integer>();

		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put("Four", 4);
		
		System.out.println(numberMapping.keySet());
		System.out.println(numberMapping.values());

	}
}
