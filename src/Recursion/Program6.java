package Recursion;

public class Program6 {
	public static void main(String[] args) {
		int sum = Sum(100);
		System.out.println(sum);
	}
public static int Sum(int n) {
	
	if(n>1) {
		return n*n*n+Sum(n-1);
		
	}
	else
	return n*n*n;
	
}
	}


