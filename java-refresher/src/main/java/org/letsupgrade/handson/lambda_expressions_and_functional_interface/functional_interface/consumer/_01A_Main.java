package org.letsupgrade.handson.lambda_expressions_and_functional_interface.functional_interface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _01A_Main {
	public static void main(String[] args) {
		Consumer<Integer> consumer = (Integer i) -> System.out.println(i * 2);
		consumer.accept(20);
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7);
		Consumer<Integer> multiplyBy2 = (i) -> System.out.println(i*2);
		
		for(Integer i : numberList) {
			multiplyBy2.accept(i);
		}
		
		
	}
}
