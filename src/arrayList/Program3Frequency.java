package arrayList;

public class Program3Frequency {
	public static void main(String[] args) {
		int[] a = {8,12,6,8,20,8,12,8,12,8,6,8};
		
		for(int x:a) {
		System.out.print(" "+x);
		
		}
		System.out.println("\n");
		printFrequency(a);
		
	}
	public static void printFrequency(int[]a) {
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
			System.out.println("Frequency of element are :"+a[i]+" is "+ count);
		}
	}
}


