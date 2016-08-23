package Zadaci_22_08_2016;

public class Fan {

	final int SLOW ;
	final int MEDIUM;
	final int FAST;
	private int speed;
	private boolean on;
	private double radius;
	String color;
	//no-arg konstruktor 
	public Fan(){
		SLOW = 1;
		MEDIUM = 2;
		FAST = 3;
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	//seteri 
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	public String setColor(String col){
		color = col;
		return col;
	}
	public void setOn(boolean on){
		
		this.on = on;
	}
	//geteri
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean getOn() {
		return on;
	}
	//metoda toString
	public String toString(){
		if(on == true){
			return "Fan is on, fan speed is " + speed + ", color is "+color+" and radius is "+this.radius;
		}
		else{
			return "Fan is off, fan color is "+color+" and radius is "+radius+ ". ";
		}
	}
	public static void main(String[] args) {
		Fan obj1 = new Fan(),obj2 = new Fan();	//Kreiranje dva objekta 
		
		//postavljanje prvog ventilatora(ventilatora)
		
		obj1.setSpeed(obj1.FAST);					//postavljanje brzine 
		obj1.setRadius(10);							//postavljanje radiusa
		obj1.setOn(true);							//ukljucujemo ventilator
		
		//postavljanje drugog objekta(ventilatora)
		
		obj2.setSpeed(obj2.MEDIUM);					//postavljanje brzine 
		obj2.setColor("yellow"); 					//postavljanje boje
		obj2.setOn(false);					     	//iskljucujemo ventilator
		
		
		System.out.println(obj1.toString());		//printamo specifikacije prvog ventilatora
		System.out.println(obj2.toString());		//printamo specifikacije drugog ventilatora
	}
	
	
	

}

