package Zadaci_17_08_2016;

import java.util.Scanner;

/*
 *  Napisati program koji prima karakter te vraæa njegov Unicode. 
 *  Primjer: ukoliko korisnik unese karakter E 
 *   program mu vraæa 69 kao unicode za taj karakter
 */
public class Zad2_Unicode {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Unesite karakter za provjeru koji je unicode za taj karakter:");
		
		
		// kod unosa karaktera uzima se u obzir samo prvi uneseni karakter
		char a = in.next().charAt(0);
		
		int unicode = (int)a;
		System.out.println("Unicode za karakter "+a+ " je: " +unicode);
		
		in.close();
	}
}
