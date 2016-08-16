package Zadaci_16_08_2016;

import java.util.Scanner;

/*
 *  Napisati program koji pita korisnika da unese neki string 
 *  te mu ispisuje dužinu tog stringa kao i prvo slovo stringa.
 */
public class Zad2_DuzinaStringaIPrvoSlovo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the string:");
		// unos stringa
		String str =in.nextLine();
		
		//provjerava da li je prvi karakter slovo
		while (!(Character.isLetter(str.charAt(0))) ){
			System.out.println("Enter again, [the first character must be letter]:");
			str = in.nextLine();
		}
		
		// duzina stringa se provjerava sa metodom .length()
		System.out.println("Length of string "+ str + " is "+ str.length()+ ".");
		
		// prvo slovo stringa ispisujemo sa metodom.charAr(0), karakter na nultoj poziciji.
		System.out.println("The first letter is "+ str.charAt(0)+".");
		
		in.close();
		
		
	}
}
