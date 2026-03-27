package Recursion;

public class Program2 {
	public static void main(String[] args) {
		printNum(1);
	}
  public static void printNum(int n) {
	  if (n<=10) {
		  printNum(n+1);
		  System.out.println(n);
		  
	  }
  }

}
