package PatternProgramming;

import java.util.Scanner;

public class Program240 {
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int n = sc.nextInt();
		printPattern(n);
		}

public static void printPattern(int n) {
	int star=1; 
	
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=star; j++) {
		System.out.printf("%-3d",getNum(n,i,j));
		
		}
		star++;
		System.out.println();
		
			}
}

  public static int getNum(int n, int row, int col) {
	  int num=0;
		for(int i=0; i<col-1;i++) {
			num=num+n-i;
			}
		if(col%2==1) {
			num=num+n-(row-1);
		}
		else {
			num=num+row-col+1;
		}
		return num;
  }

}
