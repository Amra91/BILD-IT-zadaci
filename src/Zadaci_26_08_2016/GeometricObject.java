package Zadaci_26_08_2016;

import java.util.Date;

public class GeometricObject {

	//data fields
	private String color = "White";
	private java.util.Date dateCreated;
	 private boolean filled; 
	
	 // no args konstruktor
	public GeometricObject(){
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject(String color, Date dateCreated, boolean filled) {
		this.color = color;
		this.dateCreated = dateCreated;
		this.filled = filled;
	}
	//geteri i seteri
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	 public boolean isFilled() { 
		 return filled;
		 } 
	
	 public void setFilled(boolean filled) { 
		 this.filled = filled; 
		 }
	 
	 //to String metoda
	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", dateCreated=" + dateCreated + ", filled=" + filled + "]";
	} 
	 

	
}