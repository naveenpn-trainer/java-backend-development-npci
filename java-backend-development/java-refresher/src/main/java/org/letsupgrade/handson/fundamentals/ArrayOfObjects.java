package org.letsupgrade.handson.fundamentals;

/*
 * 	Create an User Object which has two properties 
 * 	1. id : Int
 *  2. name : String
 *  
 *  
 *  Create Two User objects
 *  User(1,"Ram")
 *  User(2,"Krishna")
 *  
 *  Create an Array which can store the above created objects of type User 
 *  into the array and use for loop to print only the names of users
 */


class User {
	int id;
	String name;

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}

public class ArrayOfObjects {
	public static void main(String[] args) {
		// <DataType> []arrayName = new <DataType>[Size];
		User user1 = new User(1,"Ram");
		User user2 = new User(2,"Krishna");
		User []users = new User[2];
		users[0]=user1;
		users[1]=user2;
		
		for(User user:users) {
			System.out.println(user.name);
		}
	}
}
