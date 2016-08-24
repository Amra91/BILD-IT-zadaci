package Zadaci_23_08_2016;

public class TimeTest {
	
	public static void main(String[] args) {

		Time obj = new Time(),obj1 = new Time(555550000);
		
		System.out.println((obj.getHours()+2)+" sati "+" "+obj.getMinutes()+" minuta "+" "+obj.getSecond()+" sekundi.");
		
		System.out.println((obj1.getHours())+" : "+obj1.getMinutes()+" : "+obj1.getSecond());
	}
}
