package org.multilevelinheritance;

public class Banking extends Technology {

	public void retailbanking () {
		
		System.out.println("Individual");
	}

	public void corporatebanking () {
		
		System.out.println("Company");
	}
	
	public void investmentbanking() {
		
		System.out.println("Trading");
		
	}
 
	public static void main(String[] args) {
	
	   Banking b=new Banking ();
	   
	   b.retailbanking();
	   b.corporatebanking();
	   b.investmentbanking();
	   b.development();
	   b.deployment();
	   b.testing();
	   
   } 
	   
}
