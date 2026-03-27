package PatternProgramming;

import java.util.Scanner;

public class Program70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int n = sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		
		int star=1;
		int space=n-1;
		int num=n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for (int j=1;j<=star;j++) {
				System.out.print(num+" ");
			
			}
			num--;
			star+=2;
			space--;
		System.out.println();
				
				
			
		}
		
	}


}
