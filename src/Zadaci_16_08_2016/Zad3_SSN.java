package Zadaci_16_08_2016;

import java.util.Scanner;

/*
 *  Napisati program koji pita korisnika da unese 
 *  Social Security Number (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. 
 *  Program treba da provjerava da li je broj unesešen u ispravnom formatu. 
 *  Ukoliko nije, program pita korisnika da pokuša ponovo. 
 *  Ukoliko jeste unešen u pravom formatu, program završava sa radom.
 */
public class Zad3_SSN {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner in = new Scanner (System.in);
		
		
		boolean check = true;
		
		//izvrsenje do while petlje sve dok se ne unese ispravan SSN
		do{
			
			System.out.println("Enter Social Security Number (SSN) [DDD-DD-DDDD] ");
			String SSB = in.next();
			
			//ukoliko se ispuni if uslov , korektan je unos i zavrsava program
			 if (isTrue(SSB)){
					System.out.println(SSB + " is correct.");
					check = false;
					break;
				}
			
			} while (check);
			in.close();	
		}
	
	//metoda za provjeru unosa
	public static boolean isTrue (String str){
		
		// vraca false ukoliko ima vise od 11 karaktera
		if (str.length()>11){
			return false;
		}
	
		// for petlja za provjeru svakog karaktera stringa
		for (int i=0; i<str.length(); i++){
		
			//  if uslov za 3 i 6 karakter
			 if (i ==3 || i==6 ){
				
				// vraca false ukoliko nije znak na toj poziciji '-'
					if (str.charAt(i)!='-'){
						return false;
					}
				}

			else {
					//vraca false ukoliko karakteri nisu brojevi
				 	if (!(Character.isDigit(str.charAt(i)))){
				 		return false;
				 	}
				}		
		} //zatvaranje for petlje
		
		
		return true;
	}
}


