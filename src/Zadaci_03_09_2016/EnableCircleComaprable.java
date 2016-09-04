package Zadaci_03_09_2016;


/*
 * (Enable Circle comparable) 
 * Rewrite the Circle class in Listing 13.2 to extend GeometricObject and implement the Comparable interface. 
 * Override the equals method in the Object class. 
 * Two Circle objects are equal if their radii are the same. 
 * Draw the UML diagram that involves Circle, GeometricObject, and Comparable. 
 */
public class EnableCircleComaprable {
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle (2);
		Circle circle2 = new Circle (3);
		
		if (circle1.equals(circle2)){
			System.out.println("Circles radius are equal.");
		}
		int num = circle1.compareTo(circle2);
		
		if (num==1){
			System.out.println(circle1.toString() + " is biger.");
		}
		else if (num==-1){
			System.out.println(circle2.toString()+ " is biger.");
		}
		else{
			System.out.println("Circles area are equal");
		}
	}

}
	class Circle extends GeometricObject implements Comparable<Circle> {
			//data fileds
			private double radius;  
			 
			//no args konstruktor
			public Circle() { 
				 } 
			//konstruktor
			 public Circle(double radius) { 
				 this.radius = radius; 
				 } 
			 //konstruktor
			 public Circle(double radius,String color, boolean filled) { 
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
			//metoda compareTo provjera koja je povrsina kruga veca
				public int compareTo(Circle obj) {
					if (this.getArea() > obj.getArea())
						return 1;
					else if (this.getArea() < obj.getArea())
						return -1;
					else
						return 0;
				}
				
				//metoda koja vraca true ako su isti radijusi, odnosno false ukoliko nisu isti radijusi
				@Override
				public boolean equals(Object obj){
			
					return obj instanceof Circle && radius == ((Circle) obj).radius;
				}
			
		}


