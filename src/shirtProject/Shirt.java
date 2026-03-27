package shirtProject;

public class Shirt {
	String brand;
	double price;
	String color;
	int size;
	Shirt(){
		
	}
 Shirt(String brand, double price, String color, int size){
	 this.brand=brand;
	 this.price= price;
	 this.color=color;
	 this.size=size;
	 
 }
 public String toString() {
	return "Brand: "+brand+"\tPrice: "+price+"\tColor: "+color+"\tSize: "+size ;
 }
}
