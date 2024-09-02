package org.mobilebrand;

public class Nokia {
	
	public Nokia() { // non parameterized constructor
		
		System.out.println("Network Support");
		
	}

	public Nokia(int a) { // parameterized constructor
		
		System.out.println("Network:"+ a);
		
	}
   
	public Nokia (String b) {
		
		System.out.println("Sim Type:"+ b);
	}

    public Nokia (char c) {
    	
        System.out.println("Battery Type:"+ c);	
    }				

    public static void main(String[] args) {
		
    	Nokia x = new Nokia();
    	Nokia a = new Nokia("4g");
    	Nokia b = new Nokia("Manual");
    	Nokia c = new Nokia ("Lithium");
    	    		
	}
}



