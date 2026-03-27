package shirtProject;

import java.util.*;

public class Service {
	
	private List<Shirt> l1 = new ArrayList<>();
	private static Scanner sc=new Scanner(System.in); 
 public void addShirt(Shirt s) {
	 l1.add(s);
	 
 }
 public void displayAllShirts() {
	 for(Shirt s: l1)
		 System.out.println(s);
 }
 public void filterOnBrandAndSize() {
	 System.out.println("Enter the brand: ");
	 String brand=sc.nextLine();
	 System.out.println("Enter the Size: ");
	 int size = sc.nextInt();
	 int count=0;
	 for(Shirt s:l1)
	 if(s.brand.equalsIgnoreCase(brand)&& s.size==size) {
		 System.out.println(s);
		 count++;
		 
	 }
		 System.out.println("No  such item found");
 }
}
