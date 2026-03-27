package multithreading;

public class Vehicle extends Thread {
	
		String name;
		int distance;
		Vehicle(){
			
		}
		Vehicle(String name, int distance){
			this.name=name;
			this.distance=distance;
		}
		public void run() {
			drive();
		}
		
		public void drive() {
			System.out.println("========="+name+" has Started===========");
			for(int i=1;i<=distance;i++) {
				System.out.println(name+" has travelled "+i+" Km");
			}
			System.out.println("====="+name+" has Reached Destination====");
		}

	}


