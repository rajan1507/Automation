package collections;

import java.util.HashSet;

public class Hash_Set{
	
	public static void main(String[] args) {
		
		HashSet<Object> a=new HashSet<Object>();
		
		a.add(45);
		a.add(60);
		a.add('B');
		a.add("Test");
		a.add(23.15f);
		a.add(null);
		
	   System.out.println(a);
				
		int size = a.size();
		System.out.println(size);
		
			
		a.remove(1);
		System.out.println(a);
		
		boolean contains = a.contains(null);
		System.out.println(contains);
		
		a.clear();
		System.out.println(a);
		
		
			
	}

}

