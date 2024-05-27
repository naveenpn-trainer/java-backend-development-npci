package org.letsupgrade.handson.accessmodifiers.package02;

import org.letsupgrade.handson.accessmodifiers.package01.A;

public class Client {
	public static void main(String[] args) {
		A obj = new A();
//	System.out.println("Private: "+w);
//		System.out.println("Default: " + obj.x);
//		System.out.println("Protected: " + obj.y);
		System.out.println("Public: " + obj.z);
	}
}
