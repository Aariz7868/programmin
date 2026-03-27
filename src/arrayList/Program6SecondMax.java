package arrayList;

public class Program6SecondMax {
	public static void main(String[] args) {
		int[] a= {8,12,6,8,20,8,12,8,12,8,6,8};
		
	}
 public static int printMax(int[] a) {
	 int max=a[0];
	 int n = a.length;
	 for(int i=0; i<=n; i++) {
		 
		 
		 if(a[i]>max) {
			 max=a[i];
		 }
	 }
	 return max;
 }
 
}
