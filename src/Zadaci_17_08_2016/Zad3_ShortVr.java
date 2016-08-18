package Zadaci_17_08_2016;

import java.util.InputMismatchException;

/*
 * U javi, short vrijednost se sprema u samo 16 bita. 
 * Napisati program koji pita korisnika da unese short broj 
 * te mu ispiše svih 16 bita za dati cijeli broj. 
 * Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje 0000000000000101
 */
public class Zad3_ShortVr {

	static java.util.Scanner in = new java.util.Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Unesite short broj [-32768 do 32767]");
		short val = checkIn();
		
		// ako je broj manji od 0 
		if (val<0){
			//Na osnovu memtode Integer.toBinaryString dobivamo integer (32 bita), 
			// tako da short vrijednost (16 bita) kod krece od 16 indeksa stringa
			String str= Integer.toBinaryString(val).substring(16);
			
			System.out.println(str);
		}
		else{
			//dodavanje prefiksa 0 jer vraca se samo bitni kod bez 0
			System.out.println(String.format("%16s", Integer.toBinaryString(val)).replace(' ', '0'));
		
		}
	}
	
	// metoda za provjeru unosa 
		public static short checkIn(){
			
			short num =0;
			boolean checkIn = true;
			
			/// do while petlja da se izvrsava sve dok ne bude korektan unos
			do{
				//try blok provjerava unos
				try{
					num = in.nextShort();
					
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


	
	

