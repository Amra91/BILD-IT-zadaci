package Zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napišite program koji uèitava neodreðen broj cijelih brojeva (unos prekida nula), 
 * pronalazi najveæi od unijetih brojeva te ispisuje koliko se najveæi broj puta ponovio.
 *   Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje
 *    da je najveæi broj 5 te ispisuje da se isti ponavlja 4 puta. 
 */
public class NajveciBroj_ponavljanje {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Unesite brojeve (broj 0 prekida unos): ");
			
			int broj = provjera(); 		// broj koji se unosi
			int najveci=broj;			//varijabla najveci se izjednacava sa prvim unosom broja
			int brojac=0;				//brojac najveceg broja
			
			// petlja se izvrsava sve dok unos ne bude 0
			while(broj != 0){
				//uslov ako je unesni broj veci od najveceg najveci postaje taj broj
				if(broj>najveci){
					najveci = broj;
				} 
				//uslov kada je uneseni broj jednak najvecem 
				else if (broj == najveci){
					//brojac se inkrementira
					brojac++;
				}
				//unosis brojeve
				broj=provjera();
			}
		
			System.out.println("Najveci broj je ukucan "+najveci +" i ukucan je "+brojac);
			in.close();

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