package Inheritance;

public class Loan {

	public static void main(String[] args) {
	String  f = "12";
	
	char first = f.charAt(0);
	if((first >='a'&& first<='z')||(first >= 'A'&& first<= 'Z')){
		System.out.println("character is alphabet");
	}
	
	else if(first >=0 && first<=9) {
		System.out.println("character is number");
	}
	else {
		System.out.println("character is special");
	}
	

	}

}
