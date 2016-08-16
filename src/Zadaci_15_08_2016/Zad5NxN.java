package Zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom: 
 * public static void printMatrix(int n). 
 * Svaki element u matrici je ili 0 ili 1, nasumièno generisana. 
 * Napisati test program koji pita korisnika da unese broj n 
 * te mu ispiše n x n matricu u konzoli.
 */
public class Zad5NxN {
	
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unos zeljene matrice NXN
		System.out.println("Unesite koliku matricu zelite nXn");
		int n = checkIn();
		//metoda za printanje matrice 
		printMatrix (n);
		
	}
	
	//kreiranje matrice nxn i njeno printanje
	public static void printMatrix(int n){
		
		int[][] niz = new int [n][n];
		
		//for petlja za dvodimenzionalni niz koji dodjeljuje 1 i 0 vrijednosti random
		for (int red =0; red<niz.length; red++){
			for (int kolona=0; kolona<niz[red].length; kolona++){
				niz[red][kolona]= (int)(Math.random()*2);
			}
		}
		//for petlja za printanje
		for (int red =0; red<niz.length; red++){
			for (int kolona=0; kolona<niz[red].length; kolona++){
				System.out.print(niz[kolona][red]+ " ");
			}
			System.out.println();
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
