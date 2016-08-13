package Zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj 
 *  koji joj je proslijeðen kao argument: 
 *  public static void reverse(int number). 
 *  Na primjer, reverse(3456) treba da vrati 6543. 
 *  Napisati program koji pita korisnika da unese neki cijeli broj 
 *  te mu vrati isti ispisan naopako. 

 */
public class Zad2Reverse {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Unesite broj");
		
		boolean checkIn = true;
		
		/// do while petlja da se izvrsava sve dok ne bude korektan unos
		do{
			//try blok provjerava unos
			try{
				//unos broja
				int num = input.nextInt();
				
				checkIn= false;
				
				System.out.println("Reverse number is: ");
				reverse (num);	//poziv metode
			}
			// hvatanje izuzetka
			catch (InputMismatchException e) {
			    System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
			    input.nextLine();
			
			}
		}while(checkIn);
		
		input.close();
	}

	public static void reverse(int number){
		int i =1;
		while (number !=0){
			i = number %10;
			System.out.print(i);
			number = number/10;
		}

	}
}
