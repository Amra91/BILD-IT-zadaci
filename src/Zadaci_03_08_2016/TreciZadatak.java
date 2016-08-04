package Zadaci_03_08_2016;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Nizovi niz1 i niz2 su striktno identièni 
 * ukoliko su svi njihovi elementi na istim pozicijama jednaki. 
 * Napisati metodu koja vraæa true ukoliko su nizovi niz1 i niz2 
 * striktno identièni. Koristiti sljedeæi header:

public static boolean equals(int[ ] niz1, int[ ] niz2)

Napisati testni program koji pita korisnika da unese 
dva niza cijelih brojeva te provjerava da li su striktno identièni.
 */
public class TreciZadatak {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int brojElemenata1=0;
		int brojElemenata2=0;
		
		
		boolean provjera = true;
	
		// do while petlja za unos dok ne bude tacan
		do{
			// try/catch blok ukoliko bude pogresan unos
			try{
				System.out.println("Od koliko elemenata zelite da bude prvi niz:");
				// broj elemenata koliko ce sadrzavati prvi niz
				brojElemenata1 = in.nextInt();
		
				provjera = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Input MIsmatch Exception, unesite ponovo;");
				in.nextLine();
			}
		}while(provjera);
		
		
		
		boolean provjera1 = true;
		
		// do while petlja za unos dok ne bude tacan
		do{
			// try/ catch blok ukoliko bude pogresan unos
			try{
		System.out.println("Od koliko elemenata zelite da bude drugi niz:");
		// broj elemenata koliko ce sadrzavati drugi niz
		brojElemenata2 = in.nextInt();
		
		provjera1 = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Input MIsmatch Exception, unesite ponovo;");
				in.nextLine();
			}
		}while(provjera1);
		
		
		
		
		System.out.println("Unesite prvi niz od "+ brojElemenata1 + " elemenata:");
		//kreiranje prvog niza
		int[] niz1 = new int[brojElemenata1];
		//popunjavanje prvog niza
		
		boolean provjera2= true;
		//do while petlja da se izvrsava dok se ne unesu elementi,ako bude exception
		do{
			try{
				for (int i=0; i<niz1.length; i++){
					niz1[i]=in.nextInt(); // unos elemenata u niz gdje je moguc exception
				}
				provjera2 = false;
			}
			//hvatanje exception
			catch (InputMismatchException e) {
				System.out.println("Input MIsmatch Exception, unesite ponovo;");
				in.nextLine();
			}	
			}while(provjera2);
		
		
		System.out.println("Unesite drugi niz od "+ brojElemenata2 + " elemenata:");
		//kreiranje drugog niza
		int[] niz2 = new int[brojElemenata2];
		//popunjavanje drugog niza
		boolean provjera3= true;
		// do while petlja za izvrsavanje ako se desi exception da krene iz pocetka opet sa unosom
		do{
			try{
				//blok u kojem je moguc exception
				for (int i=0; i<niz2.length; i++){
					niz2[i]=in.nextInt(); //unos elemenata
				}
				provjera3 = false;
			}
			//hvatanje exception sa catch blokom
			catch (InputMismatchException e) {
				System.out.println("Input MIsmatch Exception, unesite ponovo;");
				in.nextLine();
			}
		}while(provjera3);
		
		
		
		// pozivanje metode i printanje 
		if (equals (niz1,niz2)){
			//ako je metoda true
			System.out.println("Dva niza su identicna");
		}
		else{
			//ako je metoda false
			System.out.println("Dva niza nisu identicna");
		}
		in.close();
	}
	
	
	public static boolean equals(int[ ] niz1, int[ ] niz2){
		
		boolean provjera4= true;
		// provjera da li su nizovi iste duzine
		if (niz1.length != niz2.length){
			// ako nisu iste duzine zavrsava metodu sa false
			provjera4 =false;
		}
		else {
			// sa for petljom se izvrsava provjera svakog elemnta u nizu da li su isti
		 for (int i = 0; i < niz2.length; i++) {
             // ako element iste pozicije prvog niza ne odgovara elementu iste pozicije 
			 //drugog niza to zavrsava metodu sa false 
			 if (niz2[i] != niz1[i]) {
                 provjera4 = false;    
                 break;
             }   
		 }
		}
		return provjera4;
	}
}
