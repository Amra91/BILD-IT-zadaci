package Zadaci_07_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese godinu i prva tri slova imena mjeseca (prvo slovo uppercase) 
 * te mu ispiše broj dana u tom mjesecu. 
 * Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.
 */
public class BrojDanaUMjesecuPrvaTriSlova{
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
	 
		System.out.println("Unesite godinu");
		//unos godine i provjera da li je unesena ispravno
		int godina = provjera();
		System.out.println("Unesite mjesec, tako sto ce te unijeti prva tri slova mjeseca,(prvo slovo uppercase) ");
		// unos mjeseca
		String mjesec = in.next();
		
		System.out.println(printUnosa(godina,mjesec));
	}
	
	// metoda za provjeru unosa i printanja mjeseca i broja dana
	public static String printUnosa (int god, String mjesec){
			
		String opis="";
		//switch provjera unosa mjeseca	
			switch (mjesec){
				case "Jan":
					opis= mjesec +" "+ god + " godine, imao je 31 dan.";
					break;
				case "Feb": 
					if (prestupna(god)){
						opis= mjesec +" "+ god + " godine, imao je 29 dana.";
						break;
					}
					else{
						opis= mjesec +" "+ god + " godine, imao je 28 dana.";
						break;
					}
				case "Mar":
					opis= mjesec +" "  + god + " godine, imao je 31 dan.";
					break;
				case "Apr":
					opis=  mjesec+" " + god+ " godine,imao je 30 dana";
					break;
				case "Maj":
					opis= mjesec+" " + god+ " godine, imao je 31 dan";
					break;
				case "Jun":
					opis= mjesec+ " " + god + " godine, imao je 30 dana";
					break;
				case "Jul":
					opis= mjesec+" "+ god + " godine, imao je 31 dan";
					break;
				case "Aug":
					opis= mjesec+" "+ god + " godine, imao je 31 dan";
					break;
				case "Sep":
					opis= mjesec+" " + god + " godine, imao je 30 dana";
					break;
				case "Okt":
					opis=mjesec+" "+ god + " godine, imao je 31 dan";
					break;
				case "Nov":
					opis=mjesec+" " + god + " godine, imao je 30 dana";
					break;
				case "Dec":
					opis=mjesec+" "+ god + " godine, imao je 31 dan";
					break;
				// ukoliko je unos pogresan	
				default:
					opis="Pogresan unos mjeseca.";
					break;
						
					}
				
			return opis;
		
	}
	//metoda za provjeru da li je godina prestupna
	public static boolean prestupna(int year){
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	
	//metoda za provjeru unosa, da li je cjelobrojan broj
	public static int provjera(){
		
		int broj =0;
		boolean provjera = true;
		
		/// do while petlja da se izvrsava unos broja sve dok isti ne bude double
		do{
			//try blok koji provjerava unos
			try{
				broj = in.nextInt();
				
				provjera= false;
			}
			// hvatanje izuzetka
			catch (InputMismatchException e) {
			    System.out.println("Input MIsmatch Exception, unesite ponovo cijeli broj;"); 
			    in.nextLine();
			
			}
		}while(provjera);
		
		return broj;
	}
}
