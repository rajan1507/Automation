package org.java;

public class Variable extends Demo {
	
	int b=35;  // class variable
	
	public void data() {
		
		int b=20; // local variable

		System.out.println(b); // 20
		System.out.println(this.b); // 35
		System.out.println(super.z);
	}
	
	public static void main(String[] args) {
		
		Variable s=new Variable();
		s.data();
		
	}

}
