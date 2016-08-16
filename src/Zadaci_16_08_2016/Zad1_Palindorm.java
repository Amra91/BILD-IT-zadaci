package Zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  Napisati program koji pita korisnika da 
 *  unese cijeli trocifreni broj te provjerava 
 *  da li je unijeti broj palindrom. 
 *  Broj je palindrom ukoliko se èita isto i sa lijeva na desno 
 *  i sa desna na lijevo npr. 121, 131, itd.
 */
public class Zad1_Palindorm {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		
		
		System.out.println("Unesite cijeli trocifreni broj:");
		
		int entry =checkIn();
		
		//petlja da se moze unijet samo trocifren broj
		while (!(entry>99 && entry<1000)){
			System.out.println("Unesite ponovo, cijeli trocifren broj:");
			entry=checkIn();
		}
		//varijabla koja predstavlja reverse number
		int reverse =0;
		//petlja za zamjenu brojeva
		for(int i = entry; i !=0; i /= 10) {
	        reverse = reverse * 10 + i % 10;
			}  
		//ako je revers number jednak unesenom, broj je palindrom
		if (entry== reverse){
			System.out.println(entry+" is a palindrome.");
		}
		else{
			System.out.println(entry+" is not a palindrome.");
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
