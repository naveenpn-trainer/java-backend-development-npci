package org.letsupgrade.exercises;

public class Client {
	public static void main(String[] args) {
		Object[] users = {
				new User(1,"Ram"),
				new User(2,"Krishna"),
				new Employee(3, "Arjun"),
				new Employee(4,"Balaram")
		};
		
		for (Object obj : users) {
			if (obj instanceof User) {
				System.out.println(((User) obj).fullName);
			}
			else {
				System.out.println(((Employee) obj).name);
			}
		}
		
	// Iterate over users object and print only the names
		
	}
}
