package string;

public class ReverseSpecificWord {
	
	public static void main(String[] args) {
		String input = "I am from banglore";
		//String output = "I am morf banglore";
		String output =reverseSpecificWord(input);
		System.out.println(output);
		
	}
	public static String reverseSpecificWord(String s) {
		String res= "";
		for(int i=0; i<s.length(); i++) {
			
			if(i>=5&&i<=8) {
				char c = s.charAt(i);
			res= c+res;
			}
			else {
				char c = s.charAt(i);
				res=res+c;
			}
			
			
		}
		
		
		return res;
	}

}
