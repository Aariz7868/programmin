
public class EvenNumber {
	public static void main(String []args) {
	int n= 100;	
	int i =1;
	 int count=0;
	while(i<=n/2) {
		if(n%i==0) {
			
			System.out.println(i);
			count++;
		}
		i++;
	}

}
}
