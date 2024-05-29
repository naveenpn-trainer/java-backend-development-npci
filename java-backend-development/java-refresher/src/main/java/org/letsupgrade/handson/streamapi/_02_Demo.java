package org.letsupgrade.handson.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Given a list of names, Write a logic to return only names whose length is greater than 5 characters
 */
public class _02_Demo {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Ram", "Krishna");
		Function<String,String> toUpperCase = (str) -> str.toUpperCase();
		List<String> resultList = nameList.stream().map(toUpperCase).collect(Collectors.toList());
		System.out.println(resultList);
	}
}
