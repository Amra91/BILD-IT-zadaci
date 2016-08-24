package Zadaci_23_08_2016;

public class TimeTest {
	
	public static void main(String[] args) {
		//kreiranje objekta za tacno vrijeme, i objekta za preracunavanje milisekundi
		Time obj = new Time(),obj1 = new Time(555550000);
		
		//vraca tacno vrijeme uz dodavanje 2h nase vremenske zone
		System.out.println((obj.getHours()+2)+" sati "+" "+obj.getMinutes()+" minuta "+" "+obj.getSecond()+" sekundi.");
		
		//vraca milisekunde u satima, minutama i sekundama
		System.out.println((obj1.getHours())+" : "+obj1.getMinutes()+" : "+obj1.getSecond());
	}
}
