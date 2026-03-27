package string;

import java.util.TreeSet;

public class SegregateString2 {
	public static void main(String[] args) {
		String s = "bAEdeBcD";
		 getString(s);
		 
		 
		/* TreeSet<Character> set = new TreeSet<>();
		 for(int i =0; i<s.length(); i++) {
			 set.add(s.charAt(i));
		 }
		 System.out.println(set);
		 for(Character ch:set)
		 {
			 System.out.print(ch);
		 }
		 
	}*/
		//System.out.println(res);
	}
 public static void getString(String s) {
	 String res="";
	
	 
	 int[] freq = new int[128];
	 
	 for(int i =0; i<s.length(); i++) {
		 char c = s.charAt(i);
		 freq[c]++;
	 }
	 for(int j=0;j<freq.length;j++) { 
		 if(freq[j]>=0) {
		 int k =0;
        while(k<freq[j]){
        	char ch = (char)j;
        
        	  res= res+ch;
        	     
            k++;
        }
        
     } 
	 }
	 System.out.println(res);
	 }
 }
