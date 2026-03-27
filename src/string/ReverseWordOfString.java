package string;

public class ReverseWordOfString {
	public static void main(String[] args) {
		String s= "How are   you";
		String res = reverseWord(s);
		System.out.println(res);
}
	
	public static String reverseWord(String s) {
		String temp="", word="";
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c!=' ')
				temp=c+temp;
			if(c==' '|| i==s.length()-1) {
				word = word+" " +temp;
				temp="";
			}
		}
	return word.trim();
	}
}