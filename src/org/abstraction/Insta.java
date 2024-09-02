package org.abstraction;

public class Insta extends SocialMedia {
	
	@Override
	
	public void password() {
		
		System.out.println("pwd123");
		
	}
    
	public static void main(String[] args) {
		
		Insta a=new Insta();
		a.userName();
		a.password();
				
	}
}
