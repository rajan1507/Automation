package org.hierarchialinheritance;

public class AsstManager extends SeniorManager {
	
		public void lowerlevel() {
		
		System.out.println("Band3");
		
	}

	public static void main(String[] args) {
		
		AsstManager c=new AsstManager();
		
		c.highlevel();
		
		c.lowerlevel();
		
	}
}


