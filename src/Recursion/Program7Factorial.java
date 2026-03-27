package Recursion;

import java.util.Scanner;

public class Program7Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int fact = Fact(n);
		System.out.println(fact);
	}
public static int Fact(int n) {
	
	if(n>1) {
		return n*Fact(n-1);
		
	}
	else
	return 1;
	
}
	}
	


