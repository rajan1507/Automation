package org.interfacetask;

public class Interact implements Appln1, Appln2 {

	@Override
	public void userName2() {
		System.out.println("UserName: Raj_B");
		
	}

	@Override
	public void userName3() {
		System.out.println("Username: Shiv_R");
		
	}

	@Override
	public void userName1() {
	   System.out.println("UserName: Ram_R");
	}

	@Override
	public void password() {
		System.out.println("pwd: Raj123");
		
	}

	public static void main(String[] args) {
		
		Interact a=new Interact();
		a.userName1();
		a.userName2();
		a.userName3();
		a.password();
	}
	
}
