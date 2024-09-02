package org.hierarchialinheritance;

public class Manager extends SeniorManager {
	
		public void midlevel() {
		
		System.out.println("Band5");
		
	}

	public static void main(String[] args) {
		
		Manager b=new Manager();
		
		b.highlevel();
		
		b.midlevel();
		
	}
}