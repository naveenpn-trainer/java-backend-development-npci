package org.letsupgrade.handson.accessmodifiers.package02;

import org.letsupgrade.handson.accessmodifiers.package01.A;

public class C extends A {
	public void m1() {
//	System.out.println("Private: "+w);
//		System.out.println("Default: " + x);
		System.out.println("Protected: " + y);
		System.out.println("Public: " + z);

	}

}
