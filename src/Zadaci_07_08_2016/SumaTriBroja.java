package Zadaci_07_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika da unese njihov zbir. 
 * Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da pokuša ponovo.  
 * Ukoliko korisnik unese taèan odgovor, program mu èestita i završava sa radom. 
 */
public class SumaTriBroja {
	
	static Scanner in =  new Scanner (System.in);
	
	public static void main(String[] args) {
	
		// prva tri random cijela broja
		int prviBroj = (int)(Math.random()*100);
		int drugiBroj= (int)(Math.random()*100);
		int treciBroj= (int)(Math.random()*100);
		
		System.out.println("Unesite zbir brojeva: \n"+ prviBroj + " + "+ drugiBroj + " + "+ treciBroj+ " =");
		long start = System.currentTimeMillis(); // varijabla za pocetno vrijeme
		int unos = provjera();
		
		//petlja sve dok unos ne bude tacan
		while (unos != (prviBroj+drugiBroj+ treciBroj)){
			System.out.println("Odgovor nije tacan. ");
			System.out.println("Unesite ponovo zbir brojeva:\n" + prviBroj + " + "+ drugiBroj + " + "+ treciBroj+ "=");
			//unos ponovo sve dok ne bude isti tacan
			unos = provjera();
			
		}
			
		long end = System.currentTimeMillis();	//varijabla za krajnje vrijeme
		System.out.println("Cestitamo pogodili ste\nSuma je: "+ (prviBroj+drugiBroj+treciBroj)+".");
		System.out.println("Vrijeme koje je bilo potrebno za racunanje je: "+ ((end-start)/1000)+ " sekund.");
	}
	//metoda za provjeru unosa da li je cijeli broj
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
