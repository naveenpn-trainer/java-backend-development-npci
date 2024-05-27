package org.letsupgrade.handson.fundamentals;
class A{
	A(){
		System.out.println("Constructor Invoked");
	}

	static {
		System.out.println("Static Block - I");
	}
	
	static {
		System.out.println("Static Block - II");
	}
	
	{
		System.out.println("Instance Block -I");
	}
	{
		System.out.println("Instance Block -II");
	}
}
public class _05 {
	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new A();
		
	}
}
