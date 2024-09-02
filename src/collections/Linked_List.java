package collections;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	
	public static void main(String[] args) {
		
		List<Object> a=new LinkedList<Object>();
		
		a.add(15);
		a.add(20);
		a.add('E');
		a.add("Google");
		a.add(13.15f);
		a.add(20);
		a.add(null);
		a.add(null);
		
		System.out.println(a);
		
		Object Object = a.get(3);
		System.out.println(Object);
		
		int size = a.size();
		System.out.println(size);
		
		a.set(2, 30);
		System.out.println(a);
		
		a.remove(4);
		System.out.println(a);
		
		int indexOf = a.indexOf(20);
		System.out.println(indexOf);
		
		boolean contains = a.contains(null);
		System.out.println(contains);
		
		a.clear();
		System.out.println(a);
		
		
			
	}

}



