package ShapeProject;

public class Cone extends ThreeDshape {
	double radius;
	double height;
	
	Cone(){
	}	
	Cone( double radius, double height){
		this.radius= radius;
		this.height= height;
		
		
	}
	public void rotate () {
		System.out.println("Rotate 180 degree");
		}
	public void getVolume() {
		System.out.println("Volume of Cone is:"+(Math.PI*radius*radius*height)/3 );
	}
	public void getLSA() {
		System.out.println("LSA of Cone is:"+Math.PI*radius*(Math.sqrt(radius*radius+height*height)));
	}
			public void getTSA() {
				System.out.println("TSA of Cone is:"+Math.PI*radius*(Math.sqrt(radius*radius+height*height)+radius));
			}		
}
