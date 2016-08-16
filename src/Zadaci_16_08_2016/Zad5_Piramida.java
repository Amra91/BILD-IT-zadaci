package Zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje piramidu svih brojeva do tog broja. 
 * (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, 
 * red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
 */
public class Zad5_Piramida {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//varijabla za unos broja do kojeg ide piramida 
		System.out.println("Enter number:");
		int num =checkIn();
		
		
		//for petlja za redove piramide, ide do num unesenog broja
		for (int row = 1; row <= num; row++) {
			
			/* 
			 * for petlja za prazan prostor, izrsava se sve dok ne dodje do pozicije 
			 * koja treba da se printa, 
			 */
			for (int space = 1; space <= (num - row); space++) {
				System.out.print("     ");
			}
			/*
			 * printanje lijeve strane piramide ukljucujuci i 1, 
			 * nastavlja se na dio gdje zavrsi predhodna petlja 
			 */
			for (int left = row; left >= 1; left--) {
				System.out.printf("%-2d %2s",left, " ");
				
			}
			/*
			 * printanje desne strane piramide, u istom redu
			 * nastavlja se od broja 2 i ide do velicnine i-tog reda
			 */
			for (int right =2; right<=row; right++){
				System.out.printf("%-2d %2s",right, " ");
			}
				 
		System.out.println();// prelazak u novi red
		
		}
		
		
	}
	
	// metoda za provjeru unosa 
	public static int checkIn(){
				
		int num =0;
		boolean checkIn = true;
				
			/// do while petlja da se izvrsava sve dok ne bude korektan unos
			do{
					//try blok provjerava unos
				try{
						num = in.nextInt();
						
						checkIn= false;
					}
					// hvatanje izuzetka
				catch (InputMismatchException e) {
					    System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
					    in.nextLine();
					
					}
				}while(checkIn);
				
			return num;
		}
}
