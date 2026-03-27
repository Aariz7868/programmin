package PatternProgramming;
/*
28	 
26	 27	 
25	 24	 23	 
19	 20	 21	 22	 
18	 17	 16	 15	 14	 
8	 9	 10	 11	 12	 13	 
7	 6	 5	 4	 3	 2	 1	 

 */
import java.util.Scanner;

public class Program238 {
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int n = sc.nextInt();
		printPattern(n);
		}
		
		public static void printPattern(int n) {
			int star=1; int num=n*(n+1)/2;
			
			for(int i=1; i<=n; i++) {
				
				for(int j=1; j<=i; j++) {
					if(i%2!=0) {
						System.out.print(num+"\t"+" ");
						num--;
				}
				else {
					System.out.print(num+"\t"+" ");
						num++;
					}
					
				}
				if(i%2!=0) {
					
			    num=num-i;
				star++;
				}
				else {
					num=num-(i+1);
				}
				System.out.println();
			}
			
		}
}


