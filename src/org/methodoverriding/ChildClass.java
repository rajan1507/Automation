package org.methodoverriding;

public class ChildClass extends ParentClass {
	
	@Override
    public void stateDetails (String Population) {
		
		super.stateDetails(Population);
		
		System.out.println("Population:"+Population);
		
	}

	public static void main(String[] args) {
		
		ChildClass xy=new ChildClass ();
		xy.stateDetails("Tamilnadu");
	}
	
}