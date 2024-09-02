package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Demo {

	public static void main(String[] args) {
		
		Map<Object, Object> m = new HashMap<Object, Object>();
		
		m.put(91, 'A');
		m.put("Testing", null);
		m.put(82, 15.14);
		m.put('B', null);
		m.put(45,80);
		m.put(null, true);
		m.put(null, 92);
		m.put(12, 'A');
		
		System.out.println(m);
		
		Object Object = m.get(91);
		System.out.println(Object);
		
		int size = m.size();
		System.out.println(size);
		
		Set<Object> KeySet = m.keySet();
		System.out.println(KeySet);
	
		Collection<Object> values = m.values();
		System.out.println(values);
		
		boolean containsKey = m.containsKey('b');
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue(80);
		System.out.println(containsValue);
		
		Set<Entry<Object, Object>> entrySet = m.entrySet();
		System.out.println(entrySet);
		

		
		
 	}
}
