package org.bank;

public class Private {

	public void bankName() {
		
		System.out.println("hdfc");
	}
    public void product() {
    	
    	System.out.println("savings");
    }
     public void customerType() {
    	 
    	 System.out.println("individual");
     }

     public static void main(String[] args) {
    	 
    	 Private a=new Private ();
    	 
    	 a.bankName();
    	 a.product();
    	 a.customerType();
    	 
     }
}


