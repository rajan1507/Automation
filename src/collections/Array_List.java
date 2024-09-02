package collections;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
	
	public static void main(String[] args) {
		
		List<Object> a=new ArrayList<Object>();
		
		a.add(45);
		a.add(60);
		a.add('B');
		a.add("Test");
		a.add(23.15f);
		a.add(60);
		a.add(null);
		a.add(null);
		
		System.out.println(a);
		
		Object Object = a.get(5);
		System.out.println(Object);
		
		int size = a.size();
		System.out.println(size);
		
		a.set(3, 50);
		System.out.println(a);
		
		a.remove(3);
		System.out.println(a);
		
		int indexOf = a.indexOf(60);
		System.out.println(indexOf);
		
		boolean contains = a.contains(null);
		System.out.println(contains);
		
		a.clear();
		System.out.println(a);
		
		
			
	}

}
