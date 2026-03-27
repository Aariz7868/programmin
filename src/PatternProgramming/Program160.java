package PatternProgramming;

import java.util.Scanner;

public class Program160 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int n = sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n) {
		int star=1;
		int space=n/2;
		int mid=n/2+1;
	    int num=1;
		for(int i=1;  i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			for(int k=1; j<=star;j++) {
			
		
			if(i<mid) {
				
				System.out.print(" ");
				
			}
			else {
				System.out.print("");
			}
		}
         System.out.println();  
		
		if(i<mid) {
			star+=2;
			space--;
		}
		else {
			star-=2;
			space++;
		}
		}
		}



