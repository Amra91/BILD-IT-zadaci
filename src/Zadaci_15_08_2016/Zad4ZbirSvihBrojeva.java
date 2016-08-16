package Zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. 
 * Koristite sljedeæi header: public static int sumDigits(long n). 
 * Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) 
 * metoda treba da vrati 9. (2 + 3 + 4 = 9)
 */
public class Zad4ZbirSvihBrojeva {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		System.out.println("Unesite broj:");
		
		boolean checkIn = true;
		
		/// do while petlja da se izvrsava sve dok ne bude korektan unos
		do{
			//try blok provjerava unos
			try{
				//unos long number
				long num = in.nextLong();
				checkIn= false;
				System.out.println("Suma svih brojeva je "+ sumDigits(num));
			}
			// hvatanje izuzetka
			catch (InputMismatchException e) {
				System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
				in.nextLine();
						
				}
		}while(checkIn);
		in.close();
	}
	//metoda za printanje brojeva
	public static int sumDigits(long n){
		// 
		int sum =0;
		// uslov dok ne bude n jednak 0
		while (n!=0){
			//na sumu se dodaje zadnji broj od n
			sum+= n%10;
			n/=10;
		}
			
		return sum;
	}
}
