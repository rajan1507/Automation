package collections;

import java.util.List;
import java.util.Vector;

public class Vector_Demo {
	
	public static void main(String[] args) {
		
		List<Object> a=new Vector<Object>();
		
		a.add(115);
		a.add(200);
		a.add(330);
		a.add(430);
		
		List<Object> b=new Vector<Object>();
		
		b.add(500);
		b.add(200);
		b.add(600);

        a.addAll(b);
        System.out.println(a);
        
        a.retainAll(b);
        System.out.println(a);
        
        a.removeAll(b);
        System.out.println(a);
 
	}

}
