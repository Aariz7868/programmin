package sorting;

public class QuickSort {
	public static void main(String[] args) {
		int[] a= {12,30,60,18,20,40,25,60,45,55,50};
		System.out.println("===Before Sortig");
		for(int x:a)
			System.out.print(x+" ");
		quickSort(a,0,a.length-1);
		System.out.println("\n===After Sortig");
		for(int x:a)
			System.out.print(x+" ");
		
	}
	public static void quickSort(int[]a, int low, int high) {
		if(low<high) {
			int partitionIndex = partition(a,low,high);
			quickSort(a,low, partitionIndex-1);
			quickSort(a, partitionIndex+1,high);
		}
		
	}
	public static int partition(int[]a, int low, int high) {
		int pivot=a[high];
		int i=low;
		for(int j=low; j<high; j++) {
			if(a[j]<pivot)
				
				swap(a,i++,j);
		}
		swap(a,i, high);
		return i;
	}
	public static void swap(int[]a,int i, int j) {
		int temp= a[i];
		a[i]=a[j];
		a[j]= temp;
	}

}
