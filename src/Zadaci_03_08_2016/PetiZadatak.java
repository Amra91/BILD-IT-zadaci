package Zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Implementirati sljedeæu metodu da sortira redove u 2D nizu.

public static double[ ][ ] sortRows(double[ ][ ] array)

Napisati testni program koji pita korisnika da unese 3x3 matricu 
(ili da pita korisnika koliku matricu želi unijeti) te mu ispisuje 
na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najveæeg.
 */
public class PetiZadatak {
public static void main(String[] args) {
	
	Scanner unos = new Scanner (System.in);
	System.out.println("Koliku matricu zelite [nxn]\nn:");
	int n =0; // incijalizovanje n velicine matrice [nxn]
	
	boolean provjera = true;
	// try/ catch blok ukoliko bude pogresan unos
	// do while petlja za unos dok ne bude tacan
	do{
	try{
	 n = unos.nextInt();
	 provjera = false;
	}
	// hvatanje Input mismatch exception
	catch (InputMismatchException e) {
	    System.out.println("Input MIsmatch Exception, unesite ponovo;");
	    unos.nextLine();
	}
	}while(provjera);
	
	double[][] matrica = new double [n][n];
	
	System.out.println("Unesite matricu ["+ n + "x"+ n+ "]");
	
	boolean provjera1 = true;
	
	
	// do while za ponovno unosenje ukoliko bude exception
	do{
		//try blok za provjeru u slucaju exception
		try{
			for (int red =0; red<matrica.length; red++){
				for (int kolona =0; kolona<matrica[red].length; kolona++){
					matrica[red][kolona] = unos.nextDouble(); // ubacivanje vrijednosti u matricu
				}
			}
			provjera1=false;
		}
		// hvatanje izuzetka 
		catch(InputMismatchException e){
			 System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
			 unos.nextLine();
		}
	}while(provjera1);
	System.out.print("**********************************");
	System.out.println();
	// printanje matrice koju smo kreirali
	System.out.println("Matrica koju smo unijeli:");
	for (int i =0; i<matrica.length; i++){
		for (int j=0; j<matrica[i].length; j++){
			System.out.printf("%8.2f%3s",matrica[i][j],"|");
		}
		System.out.println();
	}
	System.out.println();
	
	// incijalizovanje niz sa matricom iz metode
	double[][] niz=sortRows(matrica);
	System.out.println("Sortirana matrica:");
	
	// printanje sortirane matrice
	for (int i=0; i<niz.length; i++){
		for (int j =0; j<niz[i].length; j++){
			System.out.printf("%8.2f%3s",niz[i][j],"|");
		}
		System.out.println();
	}
	unos.close();
	
}
public static double[][] sortRows(double[ ][ ] array){
	
	// provjera niza sa for petljom 

	for (int i=0; i<array.length; i++){ // petlja za red

		for (int j =0; j<array[0].length; j++){ //  petlja za kolonu
			
			for(int k=j+1; k<array[0].length; k++){ // petlja za provjeru susjednog elementa u koloni i do kraja elemenata
				
				//uslov ako je broj veci od susjednog da se izvrsi zamjena (k= kolona+1)
				if (array[i][j]>array[i][k]){
					double temp = array[i][j]; // temp predstavlja niz [red][kolona]
					array[i][j] = array[i][k]; // izvrsava se zamjena ako je kolona k veca i
					array[i][k]= temp;			// temp zamjenjuje staru vrijednost novom koja je manja
					}
				}
			}
		}
		// vracanje 2D sortiranog niza
		return array;
	
	}
}