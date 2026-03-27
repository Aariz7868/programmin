package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class AllUniqueSubstring {
	
	public static void main(String[] args) {
		
	String s = "abscfgsed";
	allUniqueSubstring(s);
		
	}
	
	public static void allUniqueSubstring(String s) {
	Set<String> unique = new LinkedHashSet<>();
	for(int i = 0; i<s.length(); i++) {
		for(int j=i; j<s.length(); j++) {
			
			String sub = s.substring(i,j+1);
			unique.add(sub);
		}
	}
		for(String x: unique)	
			System.out.println(x);
		
	}

}
