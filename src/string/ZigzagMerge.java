package string;

public class ZigzagMerge {
	public static void main(String[] args) {
		
	
	String s1 = "abcde";
	String s2 = "stuvwxyz";
	String s3=zigzagMerge( s1, s2 );
	System.out.println(s3);
}

	public static String zigzagMerge(String s1, String s2 ) {
		String res="";
		int i=0;
		while(i<s1.length()&&i<s2.length()) {
			
				res=res+s1.charAt(i)+ s2.charAt(i);
				i++;
			}
			if(i<s1.length()) {
				res=res+s1.substring(i);
			}
			if(i<s2.length()) {
				res=res+s2.substring(i);
			}
			
		
		return res;
	}
}
