package multithreading;

public class VehicleDriver {
public static void main(String[] args)  {
		
		Vehicle v1=new Vehicle("Car", 10);//Thread Object
		Vehicle v2=new Vehicle("Bus", 20);
		Vehicle v3=new Vehicle("Bike", 5);
		Vehicle v4=new Vehicle("Auto", 8);
		
		v1.start();
		v2.start();
		v3.start();
	
		System.out.println("=====Main Starts=====");
		System.out.println("=====Main Ends=====");
		v4.start();
		System.out.println("====================");
		v1.isDaemon();
}
}
