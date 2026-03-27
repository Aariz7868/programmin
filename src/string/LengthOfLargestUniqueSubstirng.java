package string;

public class LengthOfLargestUniqueSubstirng {
	public static void main(String[] args) {
		String s = "abbcdegabc";
		int result=largestUniqueSubstring(s);
		System.out.println(result);
	}
 public static int largestUniqueSubstring(String s) {
	  int [] index = new int[128];
	    for(int i=0; i<index.length; i++) {
	    	index[i]=-1;
	    }
	    
	    int maxLen=0, left =0;
	    for(int right=0; right<s.length(); right++) {
	    	char c = s.charAt(right);
	    	if(index[c]>=left) {
	    		left = index[c]+1;	
	    	}
	    	index[c]=right;
	    	int tempLength = right-left+1;
	    	if(tempLength>maxLen) {
	    		maxLen=tempLength;
	    		
	    	}
	    }
	  
	 
	 return maxLen;
 }
}
