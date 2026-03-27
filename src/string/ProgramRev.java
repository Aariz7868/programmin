package string;

public class ProgramRev {
	public static void main(String[] args) {
		String s = "Hello World";
		String str=reverseString(s);
		System.out.println(str);
	}
		public static String  reverseString(String s) {
			String rev="";
			for(int i=0; i<s.length(); i++) {
				rev= s.charAt(i)+rev;
				
			}
			return rev;
		}
		
		
	}


