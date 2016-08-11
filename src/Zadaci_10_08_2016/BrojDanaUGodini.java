package Zadaci_10_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati metodu koja vraæa broj dana u godini. 
 * Metoda koristi sljedeæi header: 
 * public static int numberOfDayInAYear(int year). 
 * Napisati program koji pita korisnika da unese poèetnu godinu, 
 * krajnju godinu te ispisuje broj dana za svaku godinu u rasponu.

 */
public class BrojDanaUGodini {

	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Unesi pocetnu godinu:");
		int pocetnaGod =checkIn();
		//petlja za provjeru da li je unesena godina manja od 1
		while(pocetnaGod<1){
			System.out.println("Unesite ponovo pocetnu godinu"
					+"\nKoja je veca 0.");
			pocetnaGod=checkIn();
		}
		
		System.out.println("Unesi krajnju godinu:");
		int krajnjaGod=checkIn();
		//petlja za provjeru da li je krajnja godina manja od pocetne godine
		while (krajnjaGod<pocetnaGod){
			System.out.println("Krajnja godina je manja od pocetne,"
					+ "\nUnesite ponovo krajnju godinu");
			krajnjaGod=checkIn();
		}
		
		for (int i=pocetnaGod; i<=krajnjaGod; i++){
			System.out.println(i+".godina ima "+numberOfDayInAYear(i)+ " dana.");
		}
	}
	
	//metoda za provjeru koliko godina ima dana
	public static int numberOfDayInAYear(int year){
	
		int dan = 0;
		// if uslov za prestupnu godinu 
		if ((year%4==0 && year%100!=0 )|| (year%400==0)){
			dan =366;
		}
		else {
			dan =365;
		}
		return dan;
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
