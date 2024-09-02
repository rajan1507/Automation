package org.java;

 import java.util.Scanner;
 
 public class ScannerDemo {
	 
	 public static void main(String[] args) {
		
		 Scanner z=new Scanner(System.in);
		 
		 System.out.println("Employee Full Name:");
		 String nextLine = z.nextLine();
		System.out.println("Emp Full Name:"+ nextLine);
		 
		 System.out.println("Employee ID:");
		 int n = z.nextInt();
		 System.out.println("Emp ID:"+n);
		 
		 
		 System.out.println("Employee Name:");
		 String name = z.next();
		 System.out.println("Emp Name:"+name);
		 
		 System.out.println("Emp Rating:");
		 float nextFloat = z.nextFloat();
		 System.out.println(nextFloat);
	 
		 
	}

}
