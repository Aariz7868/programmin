package PatternProgramming;
/*

 * 
 *          * 
          *   * 
        *       * 
      *           * 
    *               * 
  *                   * 
* * * * * * * * * * * * * 

 */
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int n = sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int sStar=n; int eStar=n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=eStar; j++) {
				if(j==sStar||j==eStar||i==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			sStar--; 
			eStar++;
			System.out.println();
		}
	}
}
                          
                  





