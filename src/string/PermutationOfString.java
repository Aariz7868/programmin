package string;

public class PermutationOfString {
	public static void main(String[] args) {
		String s = "acbdc";
		permutation(s);
	}
	public static void permutation(String s) {
		printPermutation("", s);
	}
public static void printPermutation(String prefix, String remaining) {
	if(remaining.length()==0) {
		System.out.println(prefix);
		return;
	}
	for(int i=0; i<remaining.length(); i++) {
		char c = remaining.charAt(i);
		String left = remaining.substring(0, i) + remaining.substring(i+1);
		printPermutation(prefix+c, left);
	}
}
}
