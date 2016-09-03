package Zadaci_02_09_2016;

public class Rectangle  extends GeometricObject { 
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
	
	}

