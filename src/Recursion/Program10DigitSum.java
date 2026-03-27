package Recursion;

import java.util.Scanner;

public class Program10DigitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int result= digitSum(n);
		System.out.println(result);
	}
 
	public static int digitSum(int n) {
		if(n==0) {
			return 0;
		}
		
		return  n%10 + digitSum(n/10);
		
	}

}
