package PatternProgramming;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class Butterfly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n= sc.nextInt();
		print(n); 
		System.out.println("=================");
		printProgram(n);
		
	}
		public static void print(int n) {
		int sStar = 1; 
		int eStar= n;
		int mid= n/2+1;
		 if(n%2==0) {
			 System.out.println("Pattern is not possible for even rows");
			 return;
		 }
		 for(int i=1; i<=n; i++) {
			 for(int j=1; j<=n; j++) {
				 if(j<=sStar||j>=eStar ) {
					 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
				 
				 if(i<mid) {
					 sStar++;
					 eStar--;
				 } 
				 else {
					 sStar--;
					 eStar++;
				 }
			 System.out.println(); 
		 }
		 
		}
	public static void printProgram(int n){
		int star =1;
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
//			System.out.print("  ");
			star++;
			System.out.println();
		}
	}


}
