package Zadaci_03_09_2016;

/*
 * (Enable Rectangle comparable) 
 * Rewrite the Rectangle class in Listing 13.3 to extend GeometricObject and implement the Comparable interface. 
 * Override the equals method in the Object class. 
 * Two Rectangle objects are equal if their areas are the same. 
 * Draw the UML diagram that involves Rectangle, GeometricObject, and Comparable. 
 */
public class EnableRectangleComparable {

public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle (2,2);
		Rectangle rectangle2 = new Rectangle (2,2);
		
		if (rectangle1.equals(rectangle2)){
			System.out.println("Rectangles area are equal.");
		}
		int num = rectangle1.compareTo(rectangle2);
		
		if (num==1){
			System.out.println(rectangle1.toString() + " is biger.");
		}
		else if (num==-1){
			System.out.println(rectangle2.toString()+ " is biger.");
		}
		else{
			System.out.println("Rectangle area are equal");
		}
	}
}
 class Rectangle  extends GeometricObject implements Comparable<Rectangle>{ 
	//data fileds
	private double width;  
	private double height; 
	
	//no args konstruktor
	public Rectangle() {
		
	}
	//konstruktor
	public Rectangle(  double width, double height) { 
		
		this.width = width; 
		this.height = height; 
		} 
	//konstruktor
	public Rectangle( double width, double height, String color, boolean filled) { 
		this.width = width; 
		this.height = height; 
		setColor(color); 
		setFilled(filled); 
		} 

	//geter za sirinu
	public double getWidth() { 
		return width; 
		}
	
	//seter za sirinu
	public void setWidth(double width) { 
		this.width = width; 
		} 
	//geter za visinu
	public double getHeight() {  
		return height; 
		} 
	//seter za visinu
	public void setHeight(double height) { 
		this.height = height; 
		}
	// povrsina, metoda koja je u geometric object apstraktna
	public double getArea() { 
		return width * height; 
		} 

	 //obim, metoda koja je u geometrict object apstraktna
	public double getPerimeter() { 
		return 2 * (width + height); 
		}
	
	public String toString (){
		return "Rectangle [ "+ width + ", "+ height+ " ]" ;
	}
	
	//metoda compareTo provjera koja je povrsina pravougaonika veca
	public int compareTo(Rectangle obj) {
			if (this.getArea() > obj.getArea())
				return 1;
			else if (this.getArea() < obj.getArea())
				return -1;
			else
				return 0;
		}
	
	//metoda vraca true ukoliko su povrsine dva objekta jednake, odnosno false ukoliko povrsine nisu jednake
	@Override
	public boolean equals(Object obj){
		
		return obj instanceof Rectangle && getArea() == ((Rectangle) obj).getArea();
	}
	
	}

