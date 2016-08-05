package Zadaci_04_08_2016;

import java.util.Scanner;

/*ISBN-10 (International Standard Book Number) 
 * se sadrži od 10 brojeva: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. 
 * Posljednji broj, d10, služi kao checksum i njega izraèunavamo 
 * iz prvih devet brojeva koristeæi se sljedeæom formulom: 
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11.
 *  Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. 
 *  Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj. 
 *  (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. 
 *  Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
*/
public class DrugiZadatak {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Unesite devetocifreni broj: ");
		//unosimo broj kao string ..kojeg provjeravamo i pretvaramo u int
		String broj = in.next();
		
		//uslov koji provjerava je li unijeti broj vazeci..
		//ako nije trazi da unesemo ponovo..
		
			while(isValid(broj)!= true){
				System.out.println("Unijeli ste ne vazeci broj.");
				System.out.println("Unesite ponovo: ");
				broj = in.next();
			
			}
			//ako je unijeti broj true a jeste..nastavljamo sa programom
			if(isValid(broj) == true){
			
			//kreiranje niza kojeg smo pretvorili iz string u niz..
			int[] array = pretvorbaStringUNiz(broj);
			
			//uslov koji provjerava da li je rijesnje modulo sa 11 == 10 ako jeste onda je 
			//deseta cifra x sto se i printa
			//ako rijesenje modulo 11 nije == 10 onda se izvrsava else blok
			if(nalazenjeDeseteCifre(array) % 11 == 10){
				//printamo deseti broj
				System.out.println("ISSBN broj je: ");
				for(int e : array){
					System.out.print(e+" | ");
				}
				System.out.print('X');
			}else{
				//else blok printa desetu cifru u obliku nekog broja
				System.out.println("ISSBN broj je: ");
				for(int e : array){
					System.out.print(e+" | ");
				}
				System.out.print((nalazenjeDeseteCifre(array)%11)); //printamo deseti broj
			}
			
		}

	}
	//metoda koja provjerava unijeti broj
	public static boolean isValid(String broj){
		//varijabla koja sluzi za provjeru i kao return tip
		boolean status = true;
		//uslov koji provjerava je li unijeti broj devetocifreni broj
		if(broj.length() != 9){
			status = false;
		}
		
		
		//for petlja koja pretvara unijeti broj[Strinjg tip] u karaktere i ujedno provjerava
		//da li je svaki clan unijetog broja [string tip] ustvari brojcana vrijednost
		for(int i=0; i<broj.length(); i++){
			char s = broj.charAt(i);
			//uslov koji provjerava da li je svaki clan jednak broju
				if(Character.isDigit(s) == false){
					status = false;
					break;
				}
			}
		return status; //vracamo status kao boolean vrijednost
		
		} //kraj metode isValid
		
		//metoda koja pretvara unijeti broj..kojeg smo unijeli kao string tip u int niz
		//metoda vraca niz koji je integer tip
		public static int[] pretvorbaStringUNiz(String numb){
				//deklarisanje integer niza
				int[] array	= new int[numb.length()];
				
				//for petlja koja pretvara svaki string broja u integer vrijednost i sprema tu vrijednost
				//u niz..
				for(int i=0; i<numb.length(); i++){
					char karakter = numb.charAt(i);
					int broj = Character.getNumericValue(karakter);
					array[i] = broj;
				}
				return array;    //vracamo niz koji je integer tip
			}
			
			//metoda koja nalazi desetu cifru..
			//metoda vraca broj koji se dobije po logici...
			//(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)
			public static int nalazenjeDeseteCifre(int[] array){
				int sum = 0;
				//for petlja koja izvrsava logiku zadatka
				//(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)
				for(int i=0; i<array.length; i++){
					//ovdje mnozimo po logici
					//(d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)
					sum += ((i+1) * array[i]);
					
				}
				return sum;		//vracamo broj koji smo izracunali..
			}
	}

