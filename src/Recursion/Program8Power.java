package Recursion;

import java.util.Scanner;

public class Program8Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int a = sc.nextInt();
		System.out.println("Enter the Second number ");
		int b= sc.nextInt();
		int power = Power( a, b);
		System.out.println(power);
	}
public static int Power(int a, int b) {
	
	if(b>0) {
		return a*Power(a,b-1);
		
	}
	else
	return 1;
	
}
}
