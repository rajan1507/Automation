package org.methodoverriding;

public class ParentClass {
	
	public void stateDetails (String literacy) {
		
		System.out.println("Literacy:"+literacy);
		
	}

	public static void main(String[] args) {
		
		ParentClass ad=new ChildClass();
		ad.stateDetails("Kerala");
				
	}
	
}
