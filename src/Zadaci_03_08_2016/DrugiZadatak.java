package Zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati metodu koja nalazi najmanji element u nizu 
 * decimalnih vrijednosti koristeæi se sljedeæim headerom:

public static double min(double[ ] array)

Napišite potom test program koji pita korisnika 
da unese deset brojeva te poziva ovu metodu da vrati najmanji element u nizu.
 */
public class DrugiZadatak {
public static void main(String[] args) {
	
	Scanner unos = new Scanner(System.in);
	//kreiranje niza sa 10 elemenata
	double[] niz = new double[10];
	
	System.out.println("Unesite niz od 10 elemenata");
	//unosenje 10 elemenata niza
	
	boolean provjera = true;
	do{
		
		try{
			for (int i =0; i<niz.length; i++){
				niz[i]=unos.nextDouble();
			}
			provjera= false;
		}
		// hvatanje izuzetka
		catch (InputMismatchException e) {
		    System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
		    unos.nextLine();
		
		}
	}while(provjera);
	
	// pozivanje metode
	System.out.println("Najmanji elemenat u nizu "+ min(niz));
	
	//zatvaranje scannera
	unos.close();
	
}

public static double min(double[] array){
	
	double min = array[0]; //incijalizovanje min varijable
	
	for (int i=0; i<array.length; i++){
		//  pronalazak najmanje vrijednosti u nizu
		if (array[i]<min){
			// dodjeljivanje najmanje vrijednosti varijabli min
			min = array[i];
		}
	}
	
	return min; //vracanje najmanjeg elementa u nizu
	
}

}
