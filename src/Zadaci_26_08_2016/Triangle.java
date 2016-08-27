package Zadaci_26_08_2016;

/*
 * (The Triangle class) Design a class named Triangle that extends GeometricObject. 
 * The class contains:
    - Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
    - A no-arg constructor that creates a default triangle.
    - A constructor that creates a triangle with the specified side1, side2, and side3. 
    - The accessor methods for all three data fields. 
    - A method named getArea() that returns the area of this triangle. 
    - A method named getPerimeter() that returns the perimeter of this triangle. 
    - A method named toString() that returns a string description for the triangle. 
    
    For the formula to compute the area of a triangle, see Programming Exercise 2.19. 
    The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3; 
Draw the UML diagrams for the classes Triangle and GeometricObject and implement the classes. Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled. The program should create a Triangle object with these sides and set the color and filled properties using the input. The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
 */
public class Triangle extends GeometricObject {

	//data fields sa def vrijednostim
	double side1 = 1;
	double side2 = 1;
	double side3 = 1;
	
	//no-args konstruktor,
	Triangle (){
	super();
		
	}
	Triangle (double s1, double s2, double s3){
		
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		 
	}
	//getermetoda za side 1
	public double getSide1() {
		return side1;
	}
	//geter metoda za side 2
	public double getSide2() {
		return side2;
	}
	//geter metoda za side 3
	public double getSide3() {
		return side3;
	}
	
	// povrsina trokuta
	double getArea(){
		
		double s =(side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
	}
	//obim trokuta
	double getPerimeter(){
		return side1*side2*side3;
	}
	//ovweeide metoda toString
	@Override
	public String toString() {
		return "Triangle [side1 =" + side1 + ", side2 =" + side2 + ", side3 =" + side3 + "]";
	}
}
