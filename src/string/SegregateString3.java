package string;

public class SegregateString3 {
	public static void main(String[] args) {
		String s = "bAEdeBcD";
		getString(s);
	}
		/*String temp = "";
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c>='A'&&c<='Z') {
				for(int j=0;j<s.length(); j++) {
					if(s.charAt(j)==c+32){
						temp=temp+c+s.charAt(j);
					}
					
				}
				
			}
			
		}
		
		System.out.println(temp);*/
		
		
		
		 
		 
		/* TreeSet<Character> set = new TreeSet<>();
		 for(int i =0; i<s.length(); i++) {
			 set.add(s.charAt(i));
		 }
		 System.out.println(set);
		 for(Character ch:set)
		 {
			 System.out.print(ch);
		 }
		 
	}*/
		//System.out.println(res);
	
public static void getString(String s) {
	 String res="";
	 int[] freq = new int[128];
	 
	 for(int i =0; i<s.length(); i++) {
		 char c = s.charAt(i);
		 freq[c]++;
	 }
	 for(int j=0;j<freq.length;j++) { 
		 if(freq[j]>=0) {
		 int k =0;
       while(k<freq[j]){
       	char ch = (char)j;
       	if(ch>='A'&&ch<='Z') {
       		res=res+ch;
			for(int m=0;m<freq.length; m++) {
				if((char)m==ch+32){
					res=res+ch+(char)m;
				}
       	 
       	     
           k++;
       }

	 }
       	else {
       		res=res+ch;
       	}
		 }
}
		 System.out.println(res);
		 }
	 }}