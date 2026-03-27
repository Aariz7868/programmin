package string;

public class SegregateString1 {
	public static void main(String[] args) {
		String s = "ZzbaAaePdebQcd";
		 getString(s);
		//System.out.println(res);
	}
 public static void getString(String s) {
	 String res=""; 
	 int[] freq = new int[128];
	 //char [] ch = new char[freq.length];
	 for(int i =0; i<s.length(); i++) {
		 char c = s.charAt(i);
		 freq[c]++;
	 }
	 for(int j=0;j<freq.length;j++) { 
		 if(freq[j]>=0) {
		 int k =0;
        while(k<freq[j]){	
        
        	char ch = (char)j;
        	res = res + ch;
            k++;
        }
 } 
 }

     System.out.println(res);
	 }
}