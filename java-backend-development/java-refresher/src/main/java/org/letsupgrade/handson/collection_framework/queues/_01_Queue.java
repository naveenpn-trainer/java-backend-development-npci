package org.letsupgrade.handson.collection_framework.queues;

import java.util.PriorityQueue;

public class _01_Queue {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
//		queue.add("Arjun");
//		queue.add("Balaram");
//		queue.add("Chaitanya");
//		
		System.out.println(queue);
		
//		String elementRemoving = queue.remove();
		String elementRemoving = queue.poll();
		System.out.println("Element removing: "+elementRemoving);
		System.out.println(queue);
	}
}
