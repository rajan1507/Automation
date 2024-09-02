package org.methodoverloading;

public class MainClass {
	
	public void testerDetails (String name) {
		
		System.out.println("Name:"+name);
	}

	public void testerDetails (int designation) {
		
		System.out.println("designation:"+designation);
	}

	public static void main(String[] args) {
		
		MainClass ab=new MainClass();
		ab.testerDetails("Rajan");
		ab.testerDetails("Analyst");
		
	}
}
