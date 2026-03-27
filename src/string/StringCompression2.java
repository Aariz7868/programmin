package string;

public class StringCompression2 {
	public static void main(String[] args) {
		String s1="aaabbeeeehh";
		stringCompression(s1);
	}
	public static void stringCompression(String s) {
	int[] freq = new int[128];
	String res="";
	for(int i =0; i<s.length(); i++) {
		 char c = s.charAt(i);
		 freq[c]++;
	}
	for(int i =0; i<freq.length; i++) {
		if(freq[i]>0) {
			res=res+freq[i]+(char)i;
		}
		
	}
	System.out.println(res);
}
}