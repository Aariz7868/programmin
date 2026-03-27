package Recursion;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		printTab(n,1 );
	
	}
  public static void printTab(int n,int i) {

	  if( i<=10) {
		  System.out.println(n+"*"+i+"="+(n*i));
		  printTab( n,(i+1));
		  
	  }
		  
	  return;	 
	  }
  }


