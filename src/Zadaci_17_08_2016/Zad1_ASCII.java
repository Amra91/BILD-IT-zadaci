package Zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te ispisuje koji je to karakter. 
 * Na primjer, ukoliko korisnik unese 69 kao ASCII kod, 
 * program mu ispisuje da je karakter sa tim brojem karakter E.
 */

public class Zad1_ASCII {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		
		System.out.println("Unesite cijeli broj [izmedju i 127]:");
	
		boolean checkIn = true;
		
		/// do while petlja da se izvrsava sve dok ne bude korektan unos
		do{
			//try blok provjerava unos
			try{
				// koristit cemo byte tim podataka jer ide od -127 do 127
				byte a= in.nextByte();
				checkIn= false;
				
				//while petlja ukoliko unos bude manji od 0
				while (a<0){
					System.out.println("Unesite ponovo [od 0 do 127]");
					a= in.nextByte();
					}
				char b = (char)a;
			
				System.out.println(b);

			}
			// hvatanje izuzetka
			catch (InputMismatchException e) {
			    System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
			    in.nextLine();
			
			}
		}while(checkIn);
		
		in.close();
	}
}
