package Zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati program koji pita korisnika da unese cijeli broj za današnji dan u sedmici 
 * (0 za ponedjeljak, 1 za utorak...) 
 * i da unese broj dana nakon današnjeg dana te mu ispiše koji je to dan u buduænosti. 
 * (Primjer: ako korisnik unese 1 kao današnji dan,
 * a 3 kao dan u buduænosti program mu ispisuje da je danas utorak,
 * a dan u buduænosti je petak.) 
*/
public class BuduciDan {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter day:\n(0-Monday, 1-Tuesday...)");
		int dayNow= checkIn();
		//while provjera da li je uneseni dan manji od 0 ili veci od 6 
		while (dayNow<0 ||dayNow>6){
			System.out.println("Day is incorrect, please enter again:");
			dayNow = in.nextInt();
		}
		//unos za koliko dana zelimo provjerit dan
		System.out.println("Enter the number of days. ");
		int dayNext= checkIn();
		//petlja provjera da li je uneseni broj manji od 0
		while (dayNext<0){
			System.out.println("Incorrect, please enter again:");
			dayNext=checkIn();
			
		}
		//Buduci dan dobivamo tako sto na danasnji dan dodajemo broj dan koji se trazi
		//i za dobivanu sumu izvrsavamo modul od 7, i dobiveni rezultat je buduci dan
		
		System.out.println("Today is " +day(dayNow)+ ", and next day is for "+dayNext
				+" days is "+ day((dayNow+dayNext)%7)+ ".");
		
	}
	//Metoda za vracanje dana
	public static String day (int numDay){
		String day="";
		switch (numDay){
		case 0:
			day="Monday";
			break;
		case 1:
			day="Tuesday";
			break;
		case 2:
			day="Wednesday";
			break;
		case 3:
			day="Thursday";
			break;
		case 4:
			day= "Friday";
			break;
		case 5:
			day="Saturday";
			break;
		case 6:
			day="Sunday";
			break;
		default:
			day= "Incorect enter";
			break;
		}
		return day;
		
	}
	
	//metoda za provjeru da li je unos ispravan cjeli broj
		public static int checkIn(){
			
			int num =0;
			boolean check = true;
			
			/// do while petlja da se izvrsava unos broja sve dok isti ne bude double
			do{
				//try blok koji provjerava unos
				try{
					num = in.nextInt();
					check= false;
				}
				// hvatanje izuzetka
				catch (InputMismatchException e) {
				    System.out.println("Input MIsmatch Exception, unesite ponovo cijeli broj;"); 
				    in.nextLine();
				}
			}while(check);
			
			return num;
		}
}
