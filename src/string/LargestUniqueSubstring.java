package string;

public class LargestUniqueSubstring {
	public static void main(String[] args) {
		String s = "abbcdegabc";
		String result=largestUniqueSubstring(s);
		System.out.println(result);
	}
 public static String largestUniqueSubstring(String s) {
	  int [] index = new int[128];
	    for(int i=0; i<index.length; i++) {
	    	index[i]=-1;
	    }
	    
	    int maxLen=0, left =0, start=0;
	    for(int right=0; right<s.length(); right++) {
	    	char c = s.charAt(right);
	    	if(index[c]>=left) {
	    		left = index[c]+1;	
	    	}
	    	index[c]=right;
	    	int tempLength = right-left+1;
	    	if(tempLength>maxLen) {
	    		maxLen=tempLength;
	    		start=left;
	    	}
	    }
	  
	 
	 return s.substring(start, start+maxLen);
 }

}
