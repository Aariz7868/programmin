import java.util.Scanner;

public class PrimeNo {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n= sc.nextInt();
    int i=2;
    int count=0;
    
    while(i*i<=n) {
    	if(n%i==0) {
    	System.out.println(i);
    	count++;
    }
     i++;
	}
	if(count==0) {
		System.out.println(n+" is prime number");
	}
	else {
		System.out.println(n+" is not a prime number");
	}
}
}
