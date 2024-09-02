package org.java;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		System.out.println("Enter Gross Salary");
		
		Scanner a = new Scanner(System.in);
		
		int salary = a.nextInt();
		
		if (salary >=5000)  {
			
			System.out.println("Entered salary pertains to welder");
			
		} else if (salary ==3000) {
			
			System.out.println("Entered salary pertains to painter");
			
		}
		else {
			
			System.out.println("Entered salary invalid");
		}
	}
}
