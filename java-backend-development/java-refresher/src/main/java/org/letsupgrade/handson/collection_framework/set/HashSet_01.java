package org.letsupgrade.handson.collection_framework.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_01 {
	public static void main(String[] args) {
		Set weekdays = getDays();
		System.out.println(weekdays);
	}
	
	public static Set getDays() {
		// String.CASE_INSENSITIVE_ORDER : lowercase elements will also be considered as duplicates
		Set<String> weekdays = new TreeSet<String>(Comparator.reverseOrder());
		weekdays.add("Mon");
		weekdays.add("Tue");
		weekdays.add("Wed");
		weekdays.add("Thu");
		weekdays.add("Fri");
		weekdays.add("Sat");
		weekdays.add("Sun");
		weekdays.add("Wed");
		return weekdays;
	}
}
