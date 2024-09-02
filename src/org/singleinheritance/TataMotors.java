package org.singleinheritance;

public class TataMotors {
	
  private void sedan() {
		
		System.out.println("Tigor");
		
	}

	 private void hatchback() {
		 
		 System.out.println("Tiago");
		 
	 }

     private void suv() {
    	 
    	 System.out.println("Harrier");
    	 
     }

     public static void main(String[] args) {
    	 
    	 TataMotors a=new TataMotors();
    	 
    	 a.sedan();
    	 a.hatchback();
    	 a.suv();
       	 
    	 
     }
}



