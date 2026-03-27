import java.util.Scanner;
public class Quadratic {
	public static void main(String[]args) { 
				Scanner sc=new
	Scanner(System.in);
				System.out.println("Enter a: ");
				double a=sc.nextDouble();
				System.out.println("Enter b: " );
				double b=sc.nextDouble();
				System.out.println("Enter c: ");
				double c=sc.nextDouble();
				double d=b*b-4*a*c;
				if(d>0) {
				    System.out.println("Two different roots are posible");
				     double root1=(-b+(Math.sqrt(d)))/2*a;
				     double root2=(-b-(Math.sqrt(d)))/2*a;
				       System.out.println("1st root is: "+root1);
				       System.out.println("2nd root is: "+root2);
				       }
				else if(d==0) {
					System.out.println("Both roots are Same");
					double root=(-b)/2*a;
					System.out.println("Both roots are:"+root);
				}
				else
					System.out.println("Real roots are not possible");
				System.out.println("===========Program Ends");
	}

}
