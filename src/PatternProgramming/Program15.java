package PatternProgramming;

import java.util.Scanner;

public class Program15 {
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int n = sc.nextInt();
		printPattern(n);
		}
		
		public static void printPattern(int n) {
			int star=1; int num=1;
			
			for(int i=1; i<=n; i++) {
				
				for(int j=1; j<=i; j++) {
					if(i%2!=0) {
						System.out.print(num+" ");
						num++;
				}
				else {
					System.out.print(num+" ");
						num--;
					}
					
				}
				if(i%2!=0) {
					
			    num=num+i;
				star++;
				}
				else {
					num=num+i+1;
				}
				System.out.println();
			}
			
		}
}


