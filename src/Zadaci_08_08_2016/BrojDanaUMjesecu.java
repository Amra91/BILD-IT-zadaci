package Zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše broj dana u datom mjesecu.
 *  Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, 
 *  program treba ispisati da je Februar 2012 imao 29 dana. 
 *  Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan.
 */
public class BrojDanaUMjesecu {
	
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("Unesite godinu");
		int godina = provjera();//provjera da li je unesen cjeli broj
		
		System.out.println("Unesite mjesec:"
				+ "\n[1-Jaunar; 2-Februar; 3-Mart; 4-April; 5-Maj; 6-Juni; 7-Juli; 8-Avgust; "
				+ "9-Septembar; 10-Oktobar; 11-Novembar; 12-Decembar]");
	
		int mjesec =provjera() ;// provjera da li je unesen cijeli broj
		
		// while petlja za ponovni unos ukoliko je uneseni mjesec veci od 12 i manji od 1
		while(mjesec <1 || mjesec  >12){
			System.out.println("Unijeli ste pogresan mjesec, unesite ponovo.");
			mjesec=provjera();
		}
		
		System.out.println(brojDanaUMjesecu(godina,mjesec));
	}
	
	// metoda za provjeru koji je dan u mjesecu
	public static String brojDanaUMjesecu(int god, int mjesec){
		String opis="";
		//switch za provjeru je mjesec i output je koliko dati mjesec ima dana 
		// 1,2,3,4..12 predstavljaju mjesece 
		switch (mjesec){
			case 1:
				opis= "Januar " + god + " godine, imao je 31 dan.";
				break;
			case 2: 
				if (prestupna(god)){
					opis= "Februar "+ god + " godine, imao je 29 dana.";
					break;
				}
				else{
					opis= "Februar "+ god + " godine, imao je 28 dana.";
					break;
				}
			case 3:
				opis= "Mart "  + god + " godine, imao je 31 dan.";
				break;
			case 4:
				opis= "April " + god+ " godine,imao je 30 dana";
				break;
			case 5:
				opis="Maj " + god+ " godine, imao je 31 dan";
				break;
			case 6:
				opis="Juni " + god + " godine, imao je 30 dana";
				break;
			case 7:
				opis="Juli "+ god + " godine, imao je 31 dan";
				break;
			case 8:
				opis="August "+ god + " godine, imao je 31 dan";
				break;
			case 9:
				opis="Septembar " + god + " godine, imao je 30 dana";
				break;
			case 10:
				opis="Oktobar "+ god + " godine, imao je 31 dan";
				break;
			case 11:
				opis="Novembar " + god + " godine, imao je 30 dana";
				break;
			case 12:
				opis="Decembar "+ god + " godine, imao je 31 dan";
				break;
				
			default:
				opis="Pogresan unos mjeseca.";
				break;
					
				}
			
		return opis;
	}
	//metoda koja provjerava da li je godina prestupna
	public static boolean prestupna(int year){
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	//metoda za provjeru da li je unos ispravan cjeli broj
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