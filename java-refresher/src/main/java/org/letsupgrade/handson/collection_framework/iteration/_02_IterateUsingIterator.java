package org.letsupgrade.handson.collection_framework.iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class _02_IterateUsingIterator {
	public static void main(String[] args) {
		List<String> programmingLanguages = new ArrayList(Arrays.asList("Java","Python","Scala"));
		
		Iterator<String> programmingLanguagesIter = programmingLanguages.iterator();
		while(programmingLanguagesIter.hasNext()) {
			System.out.println(programmingLanguagesIter.next());
		}
		
		programmingLanguagesIter.forEachRemaining(language->System.out.println(language));
		
		
		Set<String> weekdays = new TreeSet<String>(Comparator.reverseOrder());
		weekdays.add("Mon");
		weekdays.add("Tue");
		weekdays.add("Wed");
		weekdays.add("Thu");
		weekdays.add("Fri");
		weekdays.add("Sat");
		weekdays.add("Sun");
		weekdays.add("Wed");
		
		Iterator<String> iter = weekdays.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}
}
