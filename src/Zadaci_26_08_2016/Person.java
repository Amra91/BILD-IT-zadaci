package Zadaci_26_08_2016;
/*
* (The Person, Student, Employee, Faculty, and Staff classes) 
* Design a class named Person and its two subclasses named Student and Employee. 
* Make Faculty and Staff subclasses of Employee. 
* A person has a name, address, phone number, and email address. 
* A student has a class status (freshman, sophomore, junior, or senior). 
* Define the status as a constant. 
* An employee has an office, salary, and date hired. 
* Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired. 
* A faculty member has office hours and a rank. A staff member has a title. 
* Override the toString method in each class to display the class name and the person’s name. 
* Draw the UML diagram for the classes and implement them. 
* Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods. 
*/

//super klass Person
public class Person {
	

	//data fields
	private String name ;
	private String address;
	private String phoneNumber;
	private String eMail;
	
	//konstruktori
	Person(){
		
	}
	public Person(String name, String address, String phoneNumber, String eMail) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
	}

	//seteri
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	//geteri
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String geteMail() {
		return eMail;
	}

	//toString metoda
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	

}

class Student extends Person{
	
	 final String FRESHMANN = "Freshmann";
	 final String SOPHOMORE = "Sophomore";
	 final String JUNIOR = "Junior";
	 final String SENIOR = "Senior";
	
	private String status;
	
	Student(){
		
	}
	
	public void setStatus(String status) {
		this.status =status;
	}

	public String getStatus() {
		return status;
	}
	
	@Override
	public String toString() {
		return "Student [ getName()= " + getName() +"]";
	}
}


class Employe extends Person {
	private String office;
	private double salary;
	private java.util.Date date; 
	
	//no args konstruktor
	Employe(){
		date = new java.util.Date ();
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public java.util.Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Employe [getName()=" + getName() + "]";
	}
	
}

class Faculty extends Employe {
	private int officeHour;
	private String rank;
	
	//no args konstruktor
	Faculty(){
		
		
	}

	public int getOfficeHour() {
		return officeHour;
	}

	public void setOfficeHour(int officeHour) {
		this.officeHour = officeHour;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Faculty [ getName()=" + getName() + "]";
	}
	
}

class Staff extends Employe {
	private String title;
	
	//no args konstruktor
	Staff(){
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff [getName()=" + getName() + "]";
	}
	
	
}