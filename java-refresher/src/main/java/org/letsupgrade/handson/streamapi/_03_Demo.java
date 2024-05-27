package org.letsupgrade.handson.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
	String firstName;
	String lastName;
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Constructor
	
	public String getFullName() {
		return this.firstName+" "+this.lastName;
	}
	
}

public class _03_Demo {
public static void main(String[] args) {
	
	List<Person> personList = Arrays.asList(new Person("Naveen","pn"),new Person("Balaram","B"));
	List<String> fullNames = personList.stream().map(Person::getFullName).collect(Collectors.toList());
	System.out.println(fullNames);
}
}
