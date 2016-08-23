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
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public void setOnOf(boolean on){
		
		this.on = on;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	public String setColor(String col){
		color = col;
		return col;
	}
	public String toString(){
		if(on == true){
			return "fan speed is " + this.speed + " color is "+color+" and radius is "+this.radius;
		}
		else{
			return "fan color is "+color+" and radius is "+this.radius+ " fan is off";
		}
	}
	public static void main(String[] args) {
		Fan obj1 = new Fan(),obj2 = new Fan();	//Kreiranje dva objekta 
		
		//postavljanje prvog ventilatora(ventilatora)
		
		obj1.setSpeed(obj1.FAST);					//postavljanje brzine 
		obj1.setRadius(10);							//postavljanje radiusa
		obj1.setOnOf(true);							//ukljucujemo ventilator
		
		//postavljanje drugog objekta(ventilatora)
		
		obj2.setSpeed(obj2.MEDIUM);					//postavljanje brzine 
		obj2.setColor("Yellow"); 					//postavljanje boje
		obj2.setOnOf(false);						//iskljucujemo ventilator
		
		
		System.out.println(obj1.toString());		//printamo specifikacije prvog ventilatora
		System.out.println(obj2.toString());		//printamo specifikacije drugog ventilatora
	}

}

