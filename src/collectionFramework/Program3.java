package collectionFramework;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Program3 {
	public static void main(String[] args) {
		
		Collection c1 = new LinkedHashSet();
		c1.add(15)	;	
		c1.add(10);
		c1.add(20);
		c1.add(10);
		c1.add(40);
		c1.add(50);
		c1.add(60);
		c1.add(90);
		System.out.println(c1);
	}

}
