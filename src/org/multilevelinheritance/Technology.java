package org.multilevelinheritance;

public class Technology {
	
	public void development () {
		
		System.out.println("Coding");
	}

	public void deployment () {
		
		System.out.println("Environment");
	}
	
	public void testing () {
		
		System.out.println("Execution");
		
	}
 
	public static void main(String[] args) {
	
	   Technology a=new Technology();
	   
	   a.development();
	   a.deployment();
	   a.testing();
	   
   } 
	   
}
