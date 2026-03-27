package ShapeProject;

public class Sphere extends ThreeDshape {
	double radius;
	double length;
	Sphere(){
	}	
	Sphere( double radius,double length){
		this.radius= radius;
		this.length=length;
	}
	public void rotate () {
		System.out.println("Rotate 70 degree");
		}
	public void getVolume() {
		System.out.println("Volume of Sphere is:"+(4*Math.PI*radius*radius*radius)/3 );
	}
	public void getLSA() {
		System.out.println("LSA of Sphere is:"+Math.PI*radius*length);
	}
			public void getTSA() {
				System.out.println("TSA of Sphere is:"+Math.PI*radius*(length+radius));
			}		
}


