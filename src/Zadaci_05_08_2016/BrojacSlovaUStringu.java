package Zadaci_05_08_2016;

import java.util.Scanner;

/*
 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi header: 
 * public static int countLetters(String s). 
 * Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string ima slova.
 */
public class BrojacSlovaUStringu {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite string: ");
		// unos stringa
			String str = unos.nextLine();
			
		System.out.println(str +" ima " +countLetters(str) + " karaktera." );
		
			unos.close();
		 
		}
		
		public static int countLetters(String s){

			// dodavanje stringu novi red zbog lakseg zaustavljanja petlje
			s = s + '\n';
			
			int count = 0;

		    for (int i = 0; s.charAt(i) != '\n'; i++) {
		    	// uslov ako je karakter u stringu da se brojac povecava
		    	if (Character.isLetter(s.charAt(i))){
		    		count++;
		    	}
		    }

		    return count;
		 }
	}

