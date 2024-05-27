package org.letsupgrade.handson.lambda_expressions_and_functional_interface.functional_interface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Item {
	private String name;
	private double price;

	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}

public class _02_Main {
	public static void main(String[] args) {
		List<Item> itemList = Arrays.asList(new Item("Laptop", 1200.0), new Item("Mobile Phone", 1000.0),
				new Item("Mouse", 120.0));
	
		Consumer<Item> displayItemDetails = (i) -> {
			System.out.println("Item Name= "+i.getName()+" Price:$ "+i.getPrice());
		};
		
		Consumer<Item> displayItemName = i->System.out.println(i.getName());
		
		itemList.forEach(displayItemDetails);
	
	}
}
