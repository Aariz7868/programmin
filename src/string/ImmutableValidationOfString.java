package string;

public class ImmutableValidationOfString {
	public static void main(String[] args) {
		String s1 = new String("aariz");
		String s2 = "aariz";
		
		s2="anmol";
		
		if(s1==s2) {
		System.out.println("String is mutable");
		}
		else {
			System.out.println("String is immmutable");
		}
	}

}
