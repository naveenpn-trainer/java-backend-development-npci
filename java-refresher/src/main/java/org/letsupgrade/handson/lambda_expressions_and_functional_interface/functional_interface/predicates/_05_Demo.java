package org.letsupgrade.handson.lambda_expressions_and_functional_interface.functional_interface.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
	String name;
	int age;
	String city;

	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

}

public class _05_Demo {

	static Predicate<Person> isAgeGreaterThan30 = p -> p.age > 30;
	static Predicate<Person> livesInBengaluru = p -> "Bengaluru".equals(p.city);
	static Predicate<Person> livesInBengaluruAndAgeGreaterThan30 = isAgeGreaterThan30.and(livesInBengaluru);
	static Predicate<Person> livesInBengaluruOrAgeGreaterThan30 = isAgeGreaterThan30.or(livesInBengaluru);
	static Predicate<Person> shortName = p -> p.name.length() < 4;

	public static List<Person> getSamplePersonList() {
		return Arrays.asList(new Person("Ram", 25, "Bengaluru"), new Person("Krishna", 35, "Bengaluru"),
				new Person("Balaram", 30, "Bengaluru"), new Person("Chaitanya", 55, "Mysore"));

	}

	public static void approach1() {
		List<Person> personList = getSamplePersonList();

		System.out.println("List of persons whose age is greater than 30");
		for (Person person : personList) {
			if (isAgeGreaterThan30.test(person)) {
				System.out.println(person.name + " Is eligible: " + person.age);
			}
		}

		System.out.println("List the person names whose age is greater than 30 and Lives in Bengaluru");
		for (Person person : personList) {
			if (livesInBengaluruAndAgeGreaterThan30.test(person)) {
				System.out.println(person.name + " Is eligible: " + person.age);
			}
		}

		System.out.println("List the person names whose age is greater than 30 or Lives in Bengaluru");
		for (Person person : personList) {
			if (livesInBengaluruOrAgeGreaterThan30.test(person)) {
				System.out.println(person.name + " Is eligible: " + person.age);
			}
		}
	}

	public static void approach2() {
		List<Person> personList = getSamplePersonList();

		System.out.println("List of persons whose age is greater than 30");
		filterBasedOnPredicae(isAgeGreaterThan30, personList);

		System.out.println("List the person names whose age is greater than 30 and Lives in Bengaluru");
		filterBasedOnPredicae(livesInBengaluruAndAgeGreaterThan30, personList);

		System.out.println("List the person names whose age is greater than 30 or Lives in Bengaluru");
		filterBasedOnPredicae(livesInBengaluruOrAgeGreaterThan30, personList);

		System.out.println("List the person names short");
		filterBasedOnPredicae(shortName, personList);
	}

	public static void main(String[] args) {
		approach1();
	}

	public static void filterBasedOnPredicae(Predicate<Person> predicate, List<Person> personList) {
		/*
		 * for (Person person : personList) { if (predicate.test(person)) {
		 * System.out.println(person.name + " Is eligible: " + person.age); } }
		 */
		personList.stream().filter(predicate)
				.forEach(person -> System.out.println(person.name + " is eligible " + person.age));
	}

}
