package Recursion;

import java.util.Scanner;

public class Program9DigitCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int result= digitCount(n);
		System.out.println(result);
	}
 
	public static int digitCount(int n) {
		if(n==0) {
			return 0;
		}
		return 1+ digitCount(n/10);
		
	}
}
