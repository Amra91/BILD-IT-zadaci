package Zadaci_26_08_2016;

import java.util.ArrayList;

/*
 *  (UseArrayList) 
 *  Write a program that creates an ArrayList and adds a Loan object, 
 *  a Date object, a string, and a Circle object to the list, 
 *  and use a loop to display all the elements in the list by invoking the object’s toString() method
 */
public class UseArrayList {

	public static void main(String[] args) {
		
		//kreiranje objekata klasa Loan,Date,Circle
		Loan loan = new Loan (4);
		Date date = new Date();
		Circle circle = new Circle(5);
		
		// arrayLista za objekte
		ArrayList <Object> list = new ArrayList<>();
		//dodavanje objekata
		list.add(loan);
		list.add(date);
		list.add(circle);
		
		//printanje objekata
		for (int i=0; i<list.size(); i++){
			
			System.out.println(list.get(i).toString());
		}
		
		
	}
	
	
}
//klasa Loan
class Loan{
 
	private double interest;
	
	Loan(){
		
	}
	Loan(double interest){
		this.interest=interest;
	}

	@Override
	public String toString() {
		return "Loan [interest=" + interest + "]";
	}
	
}
//klasa Date
class Date{
	
	private java.util.Date date;
	
	Date(){
		date = new java.util.Date(); 
	}
	public java.util.Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Date [date=" + getDate() + "]";
	}
}

//klasa Circle
class Circle{
	
	private double radius;
	
	Circle(){
		
	}
	Circle(double radius){
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}

