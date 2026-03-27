package string;

public class LengthOfLargestPalindromicSubstring {
	public static void main(String[] args) {
		
		String s = "abcdeedcab";
		int length=lengthOfLargestPalindromicSubstring(s);
		System.out.println(length);
	}
	
	public static int lengthOfLargestPalindromicSubstring(String s) {
		int maxLength = 0;
		for(int i =0; i<=s.length(); i++) {
	
		int oddSize = expandAroundCenter(s,i,i);
		int evenSize = expandAroundCenter(s,i,i+1);
		 int max = oddSize>evenSize?oddSize:evenSize;
		 if(max>maxLength)
			 maxLength=max;
		
		}
		return maxLength;
	
	}
	public static int expandAroundCenter(String s,int start, int end) {
	
		
		while(start>=0 && end <s.length() && s.charAt(start)==s.charAt(end)){
			start--;
			end++;
			
		}
		
		return end - start -1;
	}

}
