package arrayList;

public class ProgramFirstMinimum {
	public static void main(String[] args) {
		int[] a= {8,12,6,8,20,8,12,8,12,8,6,8};
		int firstMin= printFirstMinimum(a);
		System.out.println("First minimum element is :"+ firstMin);
	}
   public static int printFirstMinimum(int[] a) {
	   int min = a[0];
	   int n= a.length-1;
	   for(int i=0; i<=n; i++ ) {
		   
		   if(a[i]<min) {
			  min=a[i] ;
		   }
	   }
	   
	   
	   
	   return min;
   }
}
