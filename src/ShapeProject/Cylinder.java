package ShapeProject;

public class Cylinder extends ThreeDshape {
	double radius;
	double height;
	
	Cylinder(){
	}	
	Cylinder( double height, double radius){
		this.height = height;
		this.radius = radius;
		
	}
	public void rotate () {
		System.out.println("Rotate 90 degree");
		}
	public void getVolume() {
		System.out.println("Volume of Cylinder is:"+(Math.PI*radius*radius*height) );
	}
	public void getLSA() {
		System.out.println("LSA of Cylinder is:"+2*Math.PI*radius*height);
	}
			public void getTSA() {
				System.out.println("TSA of Cone is:"+2*Math.PI*radius*(height+radius));
			}		

}

