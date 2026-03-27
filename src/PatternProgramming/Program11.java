package PatternProgramming;
/*
 *    A 
    B   B 
  C       C 
D           D 
  C       C 
    B   B 
      A 
 */
import java.util.Scanner;

public class Program11 {
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int n = sc.nextInt();
		printPattern(n);
		}
		
		public static void printPattern(int n) {
			int sStar=n/2+1;  int eStar=n/2+1; int mid=n/2+1; int num=65;
			
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=eStar; j++) {
					if(j==sStar||j==eStar) {
						System.out.print((char)num+" ");
					}
					else {
						System.out.print("  ");
					}
				}
				if(i<mid) {
				sStar--;
				eStar++;
				num++;
				}
				else {
					sStar++;
					eStar--;
					num--;
				}
				System.out.println();
			}
			
		}

	




	
	

}
