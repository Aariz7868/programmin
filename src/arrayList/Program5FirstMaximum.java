package arrayList;

public class Program5FirstMaximum {
	public static void main(String[] args) {
		int[] a= {8,12,6,8,20,8,12,8,12,8,6,8};
		//for(int x:a) {
			//System.out.println(x+", ");}
		int firstmaximum =	printFirstMaximum(a);
		System.out.println("First maximum element is :"+ firstmaximum);
		
	}
		public static int printFirstMaximum(int[] a) {
			int n= a.length-1;
			int max= a[0];
			for(int i=0; i<=n; i++) {
				
				if(a[i]>max) {
					max=a[i];
				}
			}
			return max;
		}
	

}
