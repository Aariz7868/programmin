
package arrayList;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		//int[] a = {10,20,25,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size=sc.nextInt();
		int[] nums=new int[size];
		for(int i=0;i<nums.length;i++){
			System.out.print("Enter the Element "+(i+1)+": ");
			nums[i]=sc.nextInt();
		}
		System.out.println("\nAll Array Elements are: ");
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");		
	}
	}

