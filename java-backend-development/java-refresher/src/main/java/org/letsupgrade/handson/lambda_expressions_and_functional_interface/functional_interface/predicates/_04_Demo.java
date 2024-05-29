package org.letsupgrade.handson.lambda_expressions_and_functional_interface.functional_interface.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _04_Demo {
	public static void main(String[] args) {
		List<String> programmingLanguages = Arrays.asList("C", "C++", "Java", "JavaScript", "Scala");
		Predicate<String> startsWithJ  = language -> language.startsWith("J");
		
		List<String> filteredProgrammingLanguagesWithJ = programmingLanguages.stream().filter(startsWithJ).collect(Collectors.toList());
		
		System.out.println(filteredProgrammingLanguagesWithJ);
	}
}
