package org.java;

public class Organization {
	
	public Organization(String name) {
		
		System.out.println("Section:"+ name);
		
	}

    public Organization (int z)  {
    	
    	this("Welding");
    	
    	System.out.println("Count:"+ z);
    	
    }
   
    public Organization() {
    	
    	this(250);
    	
    	System.out.println("Head Count");
    }
    
    public static void main(String[] args) {
		
    	Organization a=new Organization();
    
	}

}
