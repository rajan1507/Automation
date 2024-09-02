package org.java;

public class StringType {
	
	public static void main(String[] args) {
		
		StringBuffer x = new StringBuffer ("Testing");
		StringBuffer y = new StringBuffer ("Coding");
		StringBuffer z = new StringBuffer ("Deployment");
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
		
		StringBuffer append = z.append(x);
		System.out.println(append);
		
		System.out.println(System.identityHashCode(append));
	}

}
