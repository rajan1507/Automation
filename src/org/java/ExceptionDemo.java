package org.java;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
 int a = 15;
 int b = 0;
 
 try {
	  
	System.out.println(a/b);
	
 } catch (NullPointerException e) {
	 
	 System.out.println("Rajan");
	 
 }
 
 finally {
	 
	 System.out.println("Hey");
	 
 }
 
   System.out.println("Hello");

	}
}

