package Zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun 
 * koji ima godišnju interesnu stopu od 5%. 
 * Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417. 
 * Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 * Nakon treæeg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * Napisati program koji pita korisnika da unese mjeseèni iznos štednje te broj mjeseci 
 * nakon kojeg bi želio znati stanje raèuna. 

 */

public class MjesecnaStednja {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner in = new Scanner (System.in);
		
		double uplata = 0;					//mjesecni iznos stednje koji se unese
		double godKamata = 5;				// fiksna po zadatku
		int ukupnoMjeseci = 0;				//unos broja mjeseci nakon kojeg bi se zeljelo znati stanje racuna
		
		boolean provjera = true;
		
		// do while petlja da se izvrsava unos broja sve dok isti ne bude double
			do{
				//try blok koji provjerava unos
				try{
					System.out.print("Unesite Vasu Mjesecnu uplatu: ");
						uplata = in.nextDouble();
	
					System.out.print("Unesite broj mjeseci: ");
						ukupnoMjeseci= in.nextInt();
				
					provjera= false;
				}
			
				// hvatanje izuzetka ukoliko se desi pogresan unos odnosno INPUT MISMATCH EXCEPTION 
				catch (InputMismatchException e) {
					System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
					in.nextLine();
				}
			}while(provjera);
		
	
		
		// izracunavanje mjesecne kamatne stope;
		double mjesecnaKamata = mjesKamata(godKamata);
	
	
		System.out.println("Ukupno stanje na racunu nakon "+ ukupnoMjeseci + " stednje, iznosi: "
		+ ukupniIznos(ukupnoMjeseci, mjesecnaKamata,uplata ) + " KM");
		
	
		System.out.println("\nPrintanje za svaki mjesec:");
		printanjeSvakogIznosa(ukupnoMjeseci, mjesecnaKamata,uplata);
		
		in.close();
	}
		
		
	//metoda za izracunavanje kamatne stope po mjesecu
	
	public static double mjesKamata (double godisnjaKamata){
		
		
		return (godisnjaKamata/100)/12;
	}
	
	
	// metoda za izracunavanje ukupnog iznos stednje na kraju n mjeseca
	public static double ukupniIznos(int ukupnoMjeseci, double mKamata, double uplata ){
		
		double ukupno =  0;
	 
		// petlja za obracun svakog mjeseca
		for (int i=0; i<ukupnoMjeseci; i++){
				 
			// ukupni rezultat dobivamo tako sto svaki put dodavamo predhodni iznos na pocetnu uplatu 
				 ukupno = (uplata + ukupno) *( 1+ mKamata );
	
		}
	 
	 return ukupno;
	}
	
	
	public static void printanjeSvakogIznosa(int ukupnoMjeseci, double mKamata, double uplata ){
	
		double ukupno =  0;
 
		// petlja za obracun svakog mjeseca
		for (int i=0; i<ukupnoMjeseci; i++){
			 
			// ukupni rezultat dobivamo tako sto svaki put dodavamo predhodni iznos na pocetnu uplatu 
			ukupno = (uplata + ukupno) *( 1+ mKamata );
			
			System.out.printf("%1s %1d %1s %1.3f %1s \n", "Nakon",i+1,"mjeseca vrijednost na raèunu je",ukupno,"KM.");

		}
	}
}
	


	



