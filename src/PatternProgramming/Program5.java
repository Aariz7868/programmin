package PatternProgramming;
/*
* * * * * * * * * * * * * 
  *                   * 
    *               * 
      *           * 
        *       * 
          *   * 
            * 
 */
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of row");
	int n = sc.nextInt();
	printPattern(n);
	}
	
	public static void printPattern(int n) {
		int sStar=1;  int eStar=2*n-1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=eStar; j++) {
				if(j==sStar||j==eStar||i==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			sStar++;
			eStar--;
			System.out.println();
		}
		
	}

}
