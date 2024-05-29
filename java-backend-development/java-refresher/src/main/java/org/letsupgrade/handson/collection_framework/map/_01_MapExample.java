package org.letsupgrade.handson.collection_framework.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _01_MapExample {
	public static void main(String[] args) {
		Map<String, Integer> numberMapping = new TreeMap<String, Integer>();
		
		
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put("Four", 4);
		
		
		numberMapping.putIfAbsent("Five",5);
		System.out.println(numberMapping.get("Four"));
	}
}
