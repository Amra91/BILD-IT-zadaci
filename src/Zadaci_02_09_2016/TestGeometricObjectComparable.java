package Zadaci_02_09_2016;
/*
 *  (Enable GeometricObject comparable) 
 *  Modify the GeometricObject class to implement the Comparable interface,
 *   and define a static max method in the GeometricObject class for finding the larger of two GeometricObject objects. 
 *   Draw the UML diagram and implement the new GeometricObject class. 
 *   Write a test program that uses the max method to find the larger of two circles and the larger of two rectangles
 */
public class TestGeometricObjectComparable {

	public static void main(String[] args) {
		
		
		GeometricObject rectangle1 = new Rectangle(3, 2);	//kreiranje prvog objekta pravougaonika
			
		GeometricObject rectangle2 = new Rectangle(1, 2);	//kreiranje drugog objekta pravougaonika
		
		GeometricObject circle1 = new Circle2(3);			//kreiranje prvog objekta kruga
		
		GeometricObject circle2 = new Circle2(2);			//kreiranje drugog objekta kruga
			
		//printanje rezultata
		System.out.println(GeometricObject.max(circle1, circle2)+ " is bigger \n");
		
		System.out.println(GeometricObject.max(rectangle1, rectangle2)+ " is bigger");
	}
}
