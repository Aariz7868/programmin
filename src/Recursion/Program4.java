package Recursion;

public class Program4 {
	public static void main(String[] args) {
		int sum = Sum(5);
		System.out.println(sum);
	}
public static int Sum(int n) {
	
	if(n>1) {
		return n+Sum(n-1);
		
	}
	else
	return n;
	
}
}
