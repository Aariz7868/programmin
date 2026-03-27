package ShapeProject;

public class Rectangle extends TwoDShape {
	double l;
	double w;
	Rectangle(){
		
	}
	Rectangle(double l, double w){	
	this.l=l;
	this.w=w;
	}
	public void rotate () {
		System.out.println("Rotate 70 degree");
	}
	
	public void getArea() {

	System.out.println("Area of Rectangle is :" +l*w);
	
	}
	public void getPerimeter() {

		System.out.println("perimeter of Rectangle is :" +2*(l+w));
	}		
}
