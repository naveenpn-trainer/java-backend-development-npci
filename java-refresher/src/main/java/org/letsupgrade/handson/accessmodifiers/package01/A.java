package org.letsupgrade.handson.accessmodifiers.package01;

public class A {

	private int w;
	int x;
	protected int y;
	public int z;
	
	public void m1() {
		System.out.println("Private: "+w);
		System.out.println("Default: "+x);
		System.out.println("Protected: "+y);
		System.out.println("Public: "+z);
		
	}
	
}
