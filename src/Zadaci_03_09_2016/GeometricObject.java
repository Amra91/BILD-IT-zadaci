package Zadaci_03_09_2016;

public abstract class GeometricObject {
	//data fileds
	private String color = "white";
	private boolean filled;
	private java.util.Date date;
	
	//no args kontstruktor
	protected GeometricObject() {
		date = new java.util.Date();
	}
	//konstruktor
	protected GeometricObject(String color, boolean filled){
		this.color=color;
		this.filled=filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
	public boolean getFilled(){
		return filled;
	}
	public void setFilled (boolean filled){
		this.filled = filled;
	}
	public java.util.Date date(){
		return date;
	}
	 @Override 
	 public String toString() { 
		 return "created on " + date + "\ncolor: " + color + " and filled: " + filled; 
	 } 
	  // Apstraktna metoda getArea 
	 public abstract double getArea(); 
	 
	 // Apstraktna metoda getPerimeter 
	 public abstract double getPerimeter();  


}
