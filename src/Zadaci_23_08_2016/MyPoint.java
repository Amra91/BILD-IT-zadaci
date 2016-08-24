package Zadaci_23_08_2016;

/* (The MyPoint class) 
 * Design a class named MyPoint to represent a point with x- and y-coordinates. The class contains:
 * The data fields x and y that represent the coordinates with getter methods. 
 * A no-arg constructor that creates a point (0, 0). 
 * A constructor that constructs a point with specified coordinates. 
 * A method named distance that returns the distance from this point to a specified point of the MyPoint type. 
 * A method named distance that returns the distance from this point to another point with specified x- and y-coordinates. 
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that creates the two points (0, 0) and (10, 30.5) and displays the distance between them. 
 * 
 */
public class MyPoint {

	private double x,y;
	
	//konstruktor no-args
	MyPoint(){
		this.x =0;
		this.y=0;
	}
	MyPoint(double x, double y){
		this.x=x;
		this.y=y;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	
	//racunanje distance
	public double distance(double x2, double y2) {
        // d = sqrt((x2 - x1)^2 + (y2 - y1)^2)
		return Math.sqrt((Math.pow((this.x - x2), 2) + Math.pow((this.y - y2), 2)));
	}
	
	//za objekat
	public double distance(MyPoint a) {
		double x1 = a.getX() ;
		double y1 = a.getY() ;

		double distanc =distance(x1,y1)  ;

		return distanc ;
		}

		
	public static void main(String[] args) {
		
		MyPoint obj1 = new MyPoint(0,0);
		MyPoint obj2 = new MyPoint (10,30.5);
	
		System.out.println("The distance between "+ obj1.distance(obj2));
		
		System.out.println();
		
	}
}
