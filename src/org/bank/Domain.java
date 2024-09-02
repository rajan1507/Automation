package org.bank;

public class Domain {

	public void loan() {
		
		System.out.println("personal");
	}
    public void occupation() {
    	
    	System.out.println("salaried");
    }
     public void customerType() {
    	 
    	 System.out.println("individual");
     }

     public static void main(String[] args) {
    	 
    	 Domain a=new Domain ();
    	 
    	 a.loan();
    	 a.occupation();
    	 a.customerType();
    	 
     }
}

