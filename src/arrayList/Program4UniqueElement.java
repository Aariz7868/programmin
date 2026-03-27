package arrayList;

public class Program4UniqueElement {
	public static void main(String[] args) {
		int[] b = {8,12,6,8,20,8,12,8,12,8,5,15,18,6,8};
		for(int x: b) {
			System.out.print(x+", ");
		}
	System.out.println("\n");
	printUniqueElement(b);
	}
	
	public static void printUniqueElement(int[] a) {
		int n= a.length-1;
		for(int i=0; i<=n; i++) {
			int count = 1;
			for(int j=i+1; j<=n; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=a[n];
					n--;
					j--;
				}
				
			}
			if(count==1)
				System.out.print(a[i]+ ", ");
		}
		
	}
}
