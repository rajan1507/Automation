package collections;

import java.util.Vector;
import java.util.List;

public class Vector_List {
	
	public static void main(String[] args) {
		
		List<Object> a=new Vector<Object>();
		
		a.add(115);
		a.add(200);
		a.add('Z');
		a.add("Learning");
		a.add(53.00f);
		a.add(200);
		a.add(null);
		a.add(null);
		
		System.out.println(a);
		
		Object Object = a.get(5);
		System.out.println(Object);
		
		int size = a.size();
		System.out.println(size);
		
		a.set(1, 40);
		System.out.println(a);
		
		a.remove(5);
		System.out.println(a);
		
		int indexOf = a.indexOf(200);
		System.out.println(indexOf);
		
		boolean contains = a.contains(null);
		System.out.println(contains);
		
		a.clear();
		System.out.println(a);
		
		
			
	}

}

