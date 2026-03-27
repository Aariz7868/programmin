package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class AllNonRepeatingSubstring {
	public static void main(String[] args) {
		String s = "abbcdegabc";
	allNonRepeatingSubstring(s);
		
	}
 public static void allNonRepeatingSubstring(String s) {
	 Set<String> unique = new LinkedHashSet<>();
	  int [] index = new int[128];
	    for(int i=0; i<index.length; i++) {
	    	index[i]=-1;
	    }
	    
	    int left =0; 
	    for(int right=0; right<s.length(); right++) {
	    	char c = s.charAt(right);
	    	if(index[c]>=left) {
	    		left = index[c]+1;
	    		
	    	}
	    	index[c]=right;
	    	String sub = s.substring(left,right+1);
			unique.add(sub);
	    		
	    }
	  
 for(String x: unique)	
		System.out.println(x);
}
}


