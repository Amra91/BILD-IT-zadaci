package Zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* (Izra�unavanje napojnice) 
 * Napisati program koji u�itava ukupan iznos ra�una koji treba uplatiti 
 * kao i procenat tog ra�una kojeg �elimo platiti kao napojnicu 
 * te izra�unava ukupan ra�un i napojnicu. 
 * Na primjer, ukoliko korisnik unese 10 kao ra�un i 15 % kao procenat za napojnicu 
 * program treba da ispi�e da je ukupan ra�un za uplatiti 11.5 a napojnica 1.5. 
 */
public class Zad1Napojnice {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unesite ukupan iznos racuna:");
		double iznos = checkIn();		//unos iznosa jer moze biti u double vrijednosti
		System.out.println("Unesite procenat napojnice u %:");
		double procenat= checkIn();		//unos procenta napojnice
		
		// dobivanje vrijednosti napojnice
		double napojnica= iznos *procenat/100;
		// varijabla predstavlja ukupan racun za uplatiti
		double racun = iznos+napojnica;
		
		System.out.println("Ukupna uplata je "+ racun+ " KM , a napojnica je "+ napojnica+ " KM.");
	}
	
	public static double checkIn(){
		
		double num =0;
		boolean checkIn = true;
		
		/// do while petlja da se izvrsava sve dok ne bude korektan unos
		do{
			//try blok provjerava unos
			try{
				num = input.nextDouble();
				
				checkIn= false;
			}
			// hvatanje izuzetka
			catch (InputMismatchException e) {
			    System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
			    input.nextLine();
			
			}
		}while(checkIn);
		
		return num;
	}

}

