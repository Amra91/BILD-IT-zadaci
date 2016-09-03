package Zadaci_02_09_2016;
/*
 *  (The ComparableCircle class) 
 *  Define a class named ComparableCircle that extends Circle and implements Comparable. 
 *  Draw the UML diagram and implement the compareTo method to compare the circles on the basis of area. 
 *  Write a test class to find the larger of two instances of ComparableCircle objects. 
 */

public class ComparableCircle extends Circle1 implements Comparable<ComparableCircle> {
	
	// no args konstruktor
		public ComparableCircle() {
			super();
		}

		// konstruktor
		public ComparableCircle(double radius) {
			super(radius);
		}

		//metoda compareTo provjera koja je povrsina kruga veca
		public int compareTo(ComparableCircle obj) {
			if (this.getArea() > obj.getArea())
				return 1;
			else if (this.getArea() < obj.getArea())
				return -1;
			else
				return 0;
		}

}

class Circle1 {
	
	//data fileds
		private double radius;  
		 
		//no args konstruktor
		public Circle1() { 
			 } 
		//konstruktor
		 public Circle1(double radius) { 
			 this.radius = radius; 
			 } 
		 
		 // geter za radius  
		 public double getRadius() { 
			 return radius; 
			 } 
		 
		 // Seter za radius  
		 public void setRadius(double radius) { 
			 this.radius = radius; 
			 } 
		 
		 // povrsina , metoda koja je u  geometric objectu apstraktna
		 public double getArea() { 
			 return radius * radius * Math.PI; 
			 } 
		  
		 public double getDiameter() { 
			 return 2 * radius;    } 
		 
		 // obim, metoda koja je u geometric objectu apstraktna 
		 public double getPerimeter() { 
			 return 2 * radius * Math.PI; 
			 } 
		 
		 public String toString() {
				return "Circle with radius of: " + this.radius;

			}
}

