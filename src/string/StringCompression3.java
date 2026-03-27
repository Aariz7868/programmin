package string;

public class StringCompression3 {
	public static void main(String[] args) {
		String s1="aaabbaaeecceehh";
		stringCompression(s1);
	}
	public static void stringCompression(String s) {
	
	String res="";
	int count=1;
	
	for(int i=0; i<s.length(); i++) {
		for(int j=i+1; j<s.length(); j++) {
			while(s.charAt(j)==s.charAt(i))
				count++;
			break;
		}
		res=res+s.charAt(i)+count;
		}
	System.out.println(res);
}
	}
