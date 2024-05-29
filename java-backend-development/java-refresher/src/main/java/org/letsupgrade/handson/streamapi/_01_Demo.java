package org.letsupgrade.handson.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _01_Demo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> evenNumberList = usingStreams(numbers);
		System.out.println(evenNumberList);
	}

	public static List<Integer> normalWay(List<Integer> numbers) {
		List<Integer> evenNumberList = new ArrayList();
		for(Integer number:numbers) {
			if(number%2==0) {
				evenNumberList.add(number);
			}
		}
		return evenNumberList;
	}
	
	public static List<Integer> usingStreams(List<Integer> numbers) {
		return numbers.stream().filter((number) -> number % 2 == 0).collect(Collectors.toList());
	}
}
