package Zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  Napisati program koji pita korisnika da unese 3 cijela broja 
 *  te mu ispiše ta ista tri broja u rastuæem redosljedu. 
 *  Bonus: Napisati metodu koja prima tri cijela broja kao argumente 
 *  te vraæa brojeve u rastuæem redosljedu.
 */
public class Zad4_RastuciRedosljed {

	static Scanner unos = new Scanner (System.in);

	public static void main(String[] args) {
	
		// unos prvog broja
		System.out.println("Unesite prvi broj");
		int br1 = provjera(); 
	
		//unos drugog broja
		System.out.println("Unesite drugi broj");
		int br2 = provjera(); 
	
		//unos treceg broja
		System.out.println("Unesite treci broj");
		int br3 = provjera(); 
		
		
		System.out.println("\nUneseni brojevi su :");
		System.out.println(br1 + ", "+ br2 + ", "+ br3);
		System.out.println("Rastuci redosljed brojeva je: ");
		
		//printanje sortiranih brojeva
		sortiraniBrojevi (br1,br2,br3);
		
	}
	public static void sortiraniBrojevi( int a, int b, int c){
		// brojeve dodajemo u niz
		int[] array = {a,b,c};
		int temp = 0;
		
		// petlje za provjeru brojeva
		for(int i = 0; i<array.length; i++){
			
			for(int j=i; j<array.length; j++){
				
				// zamjena brojeva sa temp ukoliko je broj vecih od susjednih
				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		// printanje sortiranog niza
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+ ", ");
		}
	
	}

	public static int provjera(){
	
		int broj =0;
		boolean provjera = true;
		
		/// do while petlja da se izvrsava sve dok ne bude korektan unos
		do{
			//try blok provjerava unos
			try{
				broj = unos.nextInt();
				
				provjera= false;
			}
			// hvatanje izuzetka
			catch (InputMismatchException e) {
			    System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
			    unos.nextLine();
			
			}
		}while(provjera);
		
		return broj;
	}
}

