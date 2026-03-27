package PatternProgramming;

import java.util.Scanner;

public class MultiplePattern {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of row");
		int n= sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n) {
		
		int star=1;
		int space=n;
		for(int i=1; i<=5*n;i++) {
			if(i<=n) {
			for(int j=1; j<=space;j++) {
				
				System.out.print("  ");
				}
			
					
				
				
				
		for(int j=1; j<=star;j++) {
			
			System.out.print("* ");
			
		}
			
			
			star+=2; 
			space--;
			System.out.println();
			}
			else if( i>n && i<=2*n) {
			for(int j=1; j<=n; j++) {
				
			if(j==n) {
						System.out.print("@ ");
					}
			else {
				
				System.out.print(" ");
				
			}
			System.out.println();
				}
			}
		}	
		}
	}
	
	
	
