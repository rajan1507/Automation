package org.multilevelinheritance;

public class MutualFunds extends Banking {
	
	public void portfolio() {
		
		System.out.println("Shares");
	}

	public void stockmarket() {
		
		System.out.println("Mumbai");
	}
	
	public void regulator() {
		
		System.out.println("SEBI");
		
	}
 
	public static void main(String[] args) {
	
	   MutualFunds c=new MutualFunds();
	   
	   c.portfolio();
	   c.stockmarket();
	   c.regulator();
	   c.retailbanking();
	   c.corporatebanking();
	   c.investmentbanking();
	   c.development();
	   c.deployment();
	   c.testing();
	   
	   
   } 
	   
}
