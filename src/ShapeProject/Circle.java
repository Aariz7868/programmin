package ShapeProject;

public class Circle extends TwoDShape {
	
	double r;
	
	Circle(){
		
	}
	Circle(double r){
		this.r = r;}
	
		public void rotate () {
			System.out.println("Rotate 70 degree");	
	}
	public void getArea() {
		System.out.println("Area of Circle is :"+(Math.PI)*r*r);
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Circle is :"+(Math.PI)*2*r);
}
}