package ShapeProject;

import java.util.Scanner;

public class Game {

	Game(){
		System.out.println("==============Game is Start===============");
	}
	public void gameStart() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 ==> for 2D-Shape");
		System.out.println("Enter 2 ==> for 3D-Shape");
		int choice = sc.nextInt();
		if(choice== 1) {
		System.out.println("You have selected 2D-Shape");
		TwoDShape t1= select2DShape();
		t1.rotate();
		t1.getArea();
		t1.getPerimeter();
		}
		else if(choice==2) {
		System.out.println("You have selected 3D-Shape");
		
		ThreeDshape t1= select3DShape();
		             t1.rotate();
		             t1.getVolume();
		             t1.getLSA();
		             t1.getTSA();
		}
		else {
			System.out.println("This is Invalid Option");
			      gameStart();
		}
		
	}

	
	public  TwoDShape select2DShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to select Circle");
		System.out.println("Press 2 to select Rectangle");
		System.out.println("Press 3 to select Square");
		int choice = sc.nextInt();
		if (choice== 1) {
			System.out.println("You have selected Circle");
			System.out.println("Enter the radius");
			double radius = sc.nextDouble();
			Circle c1= new Circle(radius);
			return c1;
		}
		else if(choice==2) {
			System.out.println("You have selected Rectangle");
			System.out.println("Enter the length");
			double length= sc.nextDouble();
			System.out.println("Enter the width");
			double width = sc.nextDouble();
			Rectangle r1 = new Rectangle(length, width);
			return r1;
		}
		else if (choice ==3) {
			System.out.println("You have Selected Square");
			System.out.println("Enter the Side");
			  double side = sc.nextDouble();
			  Square s1= new Square(side);
			  return s1;
		}
		else {
			System.out.println("You have Selected Wrong Choice");
			return select2DShape();
		}
	}
	
	public  ThreeDshape select3DShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to select Cylinder");
		System.out.println("Press 2 to select Cone");
		System.out.println("Press 3 to select Sphere");
		int choice = sc.nextInt();
		if (choice== 1) {
			System.out.println("You have selected Cylinder");
			System.out.println("Enter the radius");
			double radius = sc.nextDouble();
			System.out.println("Enter the height");
			double height = sc.nextDouble();
			 Cylinder c1= new Cylinder(radius,height);
			 return c1;
		}
		else if(choice==2) {
			System.out.println("You have selected Cone");
			System.out.println("Enter the radius");
			double radius= sc.nextDouble();
			System.out.println("Enter the height");
			double height = sc.nextDouble();
			Cone c1 = new Cone(radius, height);
			return c1;
		}
		else if (choice ==3) {
			System.out.println("You have Selected Sphere");
			System.out.println("Enter the Radius");
			double radius = sc.nextDouble();
			System.out.println("Enter the Length");
			double length= sc.nextDouble();
			Sphere s1= new Sphere(radius,length);
			  return s1;
		}
		else {
			System.out.println("You have Selected Wrong Choice");
			return select3DShape();
		}
	}
	
	}
	

