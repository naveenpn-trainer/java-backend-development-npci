package org.letsupgrade.handson.generics_and_collections.reasons_to_choose;

/*class TextPrinter {
	private String data;

	public TextPrinter(String data) {
		super();
		this.data = data;
	}

	public void print() {
		System.out.println("Printing: " + data);
	}
}

class NumberPrinter {
	private Integer data;

	public NumberPrinter(Integer data) {
		super();
		this.data = data;
	}

	public void print() {
		System.out.println("Printing: " + data);
	}
}

class DoublePrinter {
	private Double data;

	public DoublePrinter(Double data) {
		super();
		this.data = data;
	}

	public void print() {
		System.out.println("Printing: " + data);
	}
}*/

class Printer<T>{
	private T data;
	public Printer(T data) {
		super();
		this.data = data;
	}

	public void print() {
		System.out.println("Printing: " + data);
	}
}

public class _03_CodeReusability {
	public static void main(String[] args) {
		/*
		 * NumberPrinter numberPrinter = new NumberPrinter(10); numberPrinter.print();
		 * 
		 * TextPrinter textPrinter = new TextPrinter("Hello"); textPrinter.print();
		 * 
		 * DoublePrinter doublePrinter = new DoublePrinter(23.5); doublePrinter.print();
		 */
		
		Printer<String> textPrinter = new Printer<String>("Hello");
		textPrinter.print();
		
		Printer<Double> doublePrinter = new Printer<Double>(23.5);
		doublePrinter.print();
	}
}
