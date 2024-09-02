package org.mobilebrand;

public class Samsung {

	public Samsung() {
		this(1230);
		System.out.println("Brand Name");

	}

	public Samsung(int a) {
		this("Model Name: S23Ultra");
		System.out.println(a);
		
	}
	
	public Samsung(String b) {
        this ('L');
        System.out.println(b);
		
	}

    public Samsung(char c) {
    	System.out.println("Display:"+ c);
    	
 }

    public static void main(String[] args) {
		Samsung s=new Samsung();
		
    }

}