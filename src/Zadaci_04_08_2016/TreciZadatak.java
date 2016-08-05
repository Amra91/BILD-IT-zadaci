package Zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja 
 * u rastuæem redosljedu: 
 * public static void displaySortedNumbers(double num1, double num2, double num3). 
 * Napisati program koji pita korisnika da unese tri broja 
 * te ispiše ta tri broja u rastuæem redosljedu. 
 */
public class TreciZadatak {
	
	static Scanner unos = new Scanner (System.in);

	public static void main(String[] args) {
	// unos prvog broja
		System.out.println("Unesite prvi broj");
		double br1 = provjera(); //pozivanje metode za unos broja i provjeru da li je broj double
	//unos drugog broja
		System.out.println("Unesite drugi broj");
		double br2 = provjera(); //pozivanje metode za unos broja i provjeru da li je broj double
	//unos treceg broja
		System.out.println("Unesite treci broj");
		double br3 = provjera(); //pozivanje metode za unos broja i provjeru da li je broj double
		
		
		System.out.println("\nUneseni brojevi su :");
		System.out.printf("%4.2f %s %4.2f %s %4.2f %s \n\n",br1,"|",br2,"|",br3, "|");
		System.out.println("Rastuci redosljed brojeva je: ");
		//printanje sortiranih brojeva
		displaySortedNumbers (br1,br2,br3);
		
	}
	public static void displaySortedNumbers( double num1, double num2, double num3){
		// brojeve dodajemo u niz
		double[] array = {num1,num2,num3};
		double temp = 0;
		// petlje za provjeru brojeva
		for(int i = 0; i<array.length; i++){
			for(int j=i; j<array.length; j++){
				// zamjena brojeva sa temp ukoliko je broj i veci od susjednih
				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		// printanje sortiranog niza
		for(int i=0; i<array.length; i++){
			System.out.printf("%4.2f%3s",array[i]," | ");
		}
	
	}

	public static double provjera(){
	
		double broj =0;
		boolean provjera = true;
		
		/// do while petlja da se izvrsava unos broja sve dok isti ne bude double
		do{
			//try blok koji provjerava unos
			try{
				broj = unos.nextDouble();
				
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
