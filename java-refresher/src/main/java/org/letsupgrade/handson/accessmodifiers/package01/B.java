package org.letsupgrade.handson.accessmodifiers.package01;

public class B extends A {

	public void m1() {
//		System.out.println("Private: "+w);
		System.out.println("Default: "+x);
		System.out.println("Protected: "+y);
		System.out.println("Public: "+z);
		
	}
}
