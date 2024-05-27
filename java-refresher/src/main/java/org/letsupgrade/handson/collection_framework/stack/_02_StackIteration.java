package org.letsupgrade.handson.collection_framework.stack;

import java.util.Iterator;
import java.util.Stack;

public class _02_StackIteration {
	public static void main(String[] args) {
		Stack<String> stackOfCards = new Stack();

//	// Push new items to the stack
		stackOfCards.push("Jack");
		stackOfCards.push("Queen");
		stackOfCards.push("King");
		stackOfCards.push("Ace");
		
		stackOfCards.forEach(card -> System.out.println(card));
		System.out.println("Using Iterators");
		Iterator<String> stackOfCardsIterator = stackOfCards.iterator();
		while(stackOfCardsIterator.hasNext()) {
			System.out.println(stackOfCardsIterator.next());
		}
	}
}
