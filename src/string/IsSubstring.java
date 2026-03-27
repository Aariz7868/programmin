package string;

public class IsSubstring {
	public static void main(String[] args) {
		String s1="abchdefvsh";
		String s2="chdefv";
		boolean res = isSubstring(s1,s2);
		System.out.println(res);
	}
	
	public  static boolean isSubstring(String s1,String s2) {
		
		for(int i =0; i<=(s1.length()-s2.length()); i++) {
			int j;
		for( j =0; j<s2.length(); j++) {
			if(s1.charAt(i+j)!=s2.charAt(j))
				break;
		}
		if(j==s2.length())
			return true;
		
		
	}
		return false;
}
}