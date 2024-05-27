package org.letsupgrade.handson.lambda_expressions_and_functional_interface.functional_interface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setTitle() {
		this.name = "Mr.s "+this.getName();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	
}

class TenPercentRaiseConsumer implements Consumer<Employee> {

	@Override
	public void accept(Employee e) {
		double currentSalary = e.getSalary();
		double newSalary = currentSalary * 1.1;
		e.setSalary(newSalary);
		System.out.println(e);
	}

}



public class _03_Explanation_Main {
/*	public static void applying_consumer_way_01(List<Employee> employeeList) {
		Consumer<Employee> tenPercentRaiseConsumer = new TenPercentRaiseConsumer();
		for (Employee employee : employeeList) {
			tenPercentRaiseConsumer.accept(employee);
		}

	}
	
	public static void applying_consumer_way_02(List<Employee> employeeList) {
		Consumer<Employee> tenPercentRaiseConsumer = new TenPercentRaiseConsumer();
		employeeList.forEach(tenPercentRaiseConsumer);

	}
	
	public static void applying_consumer_way_03(List<Employee> employeeList) {
		Consumer<Employee> tenPercentRaiseConsumer = new Consumer<Employee>() {

			@Override
			public void accept(Employee e) {
				double currentSalary = e.getSalary();
				double newSalary = currentSalary * 1.1;
				e.setSalary(newSalary);
				System.out.println(e);
			}
		};
		employeeList.forEach(tenPercentRaiseConsumer);

	}*/
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee("Ram", 100), 
				new Employee("Krishna", 200),
				new Employee("Balaram", 1000)
				);
				
		Consumer<Employee> tenPercentRaiseConsumer = e -> {
				double currentSalary = e.getSalary();
				double newSalary = currentSalary * 1.1;
				e.setSalary(newSalary);
				
		};
		
		
		Consumer<Employee> addTitleConsumer = e -> e.setTitle();
		
		Consumer<Employee> printEmployeeObjectConsumer = System.out::println;
		
		employeeList.forEach(tenPercentRaiseConsumer.andThen(addTitleConsumer).andThen(printEmployeeObjectConsumer));

	}
}
