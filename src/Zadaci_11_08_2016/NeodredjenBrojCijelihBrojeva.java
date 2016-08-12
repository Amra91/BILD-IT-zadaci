package Zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji uèitava neodreðen broj cijelih brojeva, 
 * odreðuje koliko je pozitivnih brojeva korisnik unijeo, 
 * koliko negativnih te izraèunava ukupnu sumu i prosjek svih unesenih brojeva. 
 * (Korisnik prekida unos tako što unese nulu). 
 * Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše:
 * da je broj pozitivnih brojeva 3, 
 * negativnih brojeva 1, 
 * suma ili zbir su 5.0 
 * a prosjek svih brojeva je 1.25.

 */
public class NeodredjenBrojCijelihBrojeva {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unesite brojeve (broj 0 prekida unos): ");
		
		// incijalizovanje varijabli
		int broj =0;
		int brojacPozitivnih = 0;
		int brojacNegativnih = 0;
		double suma = 0;
		int brojacBrojeva=0;
		
		
		//uslov za unosenje brojeva dok se ne unese 0
		while((broj= provjera() )!=0){
			
			suma +=broj;		//dodavanje svakog broja sumi
			
			//if uslov ako je broj veci od 0 da je pozitivan
			if (broj>0){
				brojacPozitivnih++;
			}
			else {
				brojacNegativnih++;
			}
			brojacBrojeva++; //brojac svih brojeva razlicitih od 0
			
		}
		
		
		System.out.println("Broj pozitivnih brojeva je "+ brojacPozitivnih);
		System.out.println("Broj negativnih brojeva je "+ brojacNegativnih);
		System.out.println("Suma brojeva je "+ suma);
		System.out.println("Prosjek svih brojeva je "+ suma/brojacBrojeva);
		
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
