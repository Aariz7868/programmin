package ShapeProject;

public class Square extends TwoDShape {
	
	double side;
	Square(){
		
	}
	Square(double side){
		this.side=side;
		
	}
	public void rotate () {
		System.out.println("Rotate 70 degree");
	}
	
	public void getArea() {

		System.out.println("Area of Square is :" +(side*side));
		
		}
	public void getPerimeter() {

		System.out.println("Perimeter of Square is :" +(4*side));
	}	
}
