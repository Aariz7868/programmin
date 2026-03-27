package shirtProject;

public class Driver {
	public static void main(String[] args) {
		Service service = new Service();
		//===========Q1 add Shirt===============
		service.addShirt(new Shirt("Levis", 2300, "White", 40));
		service.addShirt(new Shirt("BB", 2100, "White", 42));
		service.addShirt(new Shirt("Levis", 2400, "Red", 44));
		service.addShirt(new Shirt("PEng", 3300, "Black", 40));
		service.addShirt(new Shirt("Levis", 4300, "White", 42));
		//================Q2 Access all shirts======== 
		service.displayAllShirts();
		
		//===========Q3 Filter on brand============
		
	}

}
