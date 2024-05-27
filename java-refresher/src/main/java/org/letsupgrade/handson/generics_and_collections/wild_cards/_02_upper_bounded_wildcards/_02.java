package org.letsupgrade.handson.generics_and_collections.wild_cards._02_upper_bounded_wildcards;

import java.util.Arrays;
import java.util.List;

interface I1 {
	void invokeMe();
}

class A implements I1 {

	@Override
	public void invokeMe() {
		System.out.println("A-invoked");
	}

}

class B implements I1 {

	@Override
	public void invokeMe() {
		System.out.println("B-invoked");
	}

}

public class _02 {
	public static void callMe01(List<I1> list) {
		list.forEach(e -> e.invokeMe());
	}

	public static void callMe02(List<? extends I1> list) {
		list.forEach(e -> e.invokeMe());
	}

	public static void main(String[] args) {
		List<I1> listOfI1 = Arrays.asList(new A(), new B());
		callMe01(listOfI1);
		callMe02(listOfI1);

		List<A> listOfA = Arrays.asList(new A(), new A());
		callMe02(listOfA);
	}
}
