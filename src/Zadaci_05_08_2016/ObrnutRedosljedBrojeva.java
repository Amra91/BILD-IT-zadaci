package Zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. 
 */
public class ObrnutRedosljedBrojeva {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner in = new Scanner (System.in);
		
		
		int niz [] = new int [10];
		
		
		boolean provjera = true;
		
		// do while petlja da se izvrsava unos broja sve dok isti ne bude double
			do{
				//try blok koji provjerava unos
				try{
					for (int i = 0; i<niz.length; i++){
						System.out.println("Unesite ["+ i+ "] element niza");
						niz[i] = in.nextInt();
					}
				
					provjera= false;
				}
			
				// hvatanje izuzetka ukoliko se desi pogresan unos odnosno INPUT MISMATCH EXCEPTION 
				catch (InputMismatchException e) {
					System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
					in.nextLine();
				}
			}while(provjera);
		
		
		printArray(niz);
		printReverse(niz);
		
		in.close();
	}
	public static void printArray(int[] niz){
		System.out.println("Niz: ");
		for (int i = 0 ; i<niz.length;  i++){
			System.out.print(niz[i] + " ");
		}
	}
	//metoda za printanje obrnutim redom
	public static void printReverse(int[] niz){
		System.out.println("\nObrnuti redosljed niza je: ");
		for (int i = niz.length-1 ; i>=0;  i--){
			System.out.print(niz[i] + " ");
		}
	}

}
