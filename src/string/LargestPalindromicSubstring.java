package string;

public class LargestPalindromicSubstring {
	public static void main(String[] args) {
		String s = "abcdeaedcab";
		String result=largestPalindromicSubstring(s);
			
		
		System.out.println(result);
	}
	
	public static String largestPalindromicSubstring(String s) {
		int maxLength = 0;
		int left = 0;
		for(int i =0; i<=s.length(); i++) {
	
		int oddSize = expandAroundCenter(s,i,i);
		int evenSize = expandAroundCenter(s,i,i+1);
		 int max = oddSize>evenSize?oddSize:evenSize;
		 if(max>maxLength) {
			 maxLength=max;
			 left = i/2;
		 }
		}
		return s.substring(left, left+maxLength);
	
	}
	public static int expandAroundCenter(String s,int start, int end) {
	
		
		while(start>=0 && end <s.length() && s.charAt(start)==s.charAt(end)){
			start--;
			end++;
			
		}
		
		return end - start -1;
	}
	}


