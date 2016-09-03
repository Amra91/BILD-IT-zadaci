package Zadaci_02_09_2016;

public class Circle2 extends GeometricObject {
	//data fileds
		private double radius;  
		 
		//no args konstruktor
		public Circle2() { 
			 } 
		//konstruktor
		 public Circle2(double radius) { 
			 this.radius = radius; 
			 } 
		 //konstruktor
		 public Circle2(double radius,String color, boolean filled) { 
			 this.radius = radius; 
			 setColor(color); 
			 setFilled(filled);
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