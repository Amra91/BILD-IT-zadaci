package Zadaci_10_08_2016;

import java.util.Scanner;

/*
 *  Napisati program koji pita korisnika da unese dva stringa te provjerava 
 *  i ispisuje da li je drugi string substring prvog stringa. 
 *  Na primjer, ukoliko korisnik unese ABCD kao prvi string,
 *  a BC kao drugi string program mu ispisuje da je BC substring ABCD stringa.
 */
public class ProvjeraSubstringa {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Unesite prvi string:");
		String a =in.nextLine();	//unos prvog stringa
		
		System.out.println("Unesite drugi string:");
		String b = in.nextLine();	//unos drugog stringa
		
		//String.contains(string) metoda vraca boolean vrijednost ako string je podstring odredjenog stringa
		if (a.contains(b)){
			System.out.println("String "+b + " je supstring " + a + " stringa.");
		}
		else{
			System.out.println("String "+b+ " nije supstring "+ a + " stringa.");
		}
		
		in.close();
	}
}
