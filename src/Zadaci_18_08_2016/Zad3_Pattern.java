package Zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 7.30 (Pattern recognition: consecutive four equal numbers) 
 * Write the following method that tests whether the array has four consecutive numbers with the same value. 
 * public static boolean isConsecutiveFour(int[] values)
 * Write a test program that prompts the user to enter a series of integers and displays 
 * if the series contains four consecutive numbers with the same value. 
 * Your program should first prompt the user to enter the input size—i.e.,
 *  the number of values in the series.
 */
public class Zad3_Pattern {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Unesi koliko elemenata zelis unijeti");
		int[] array = new int[check()];
		
		System.out.println("Unesi elemente: ");
		//unosimo elemente u niz 
		for(int i=0; i<array.length; i++){
			array[i] = check();
		}
		
		// ako je uslov zadovoljen niz ima 4 uzastopna broja
		
		if(isConsecutiveFour(array)){
			System.out.println("Niz sadrzi 4 uzastopna broja");
		}else{
			System.out.println("Niz ne sadrzi 4 uzastopna broja");
		}
		
	}
	public static boolean isConsecutiveFour(int[] values){
		
		
		boolean status = false;
		
		int first = values[0];
		int count = 1;
		//
		for(int i=1; i<values.length; i++){
			//if uslov ukoliko nisu brojevi jednaki
			if(first != values[i]){
				//sada pocetna vrijednost postaje i-ti elemenat
				first = values[i];
				//restarovanje counta
				count =1;
			}else{
				count++;
			}
			//ako ima 4 jednaka uzastopna broja vraca true
			if(count == 4){
				status = true;
				break;
			}
		}
		
		return status;
	}
	
	//metoda za provjeru da li je unos ispravan decimalni broj
		public static int check(){
			
			int num =0;
			boolean isTrue = true;
			
			/// do while petlja da se izvrsava unos broja sve dok isti ne bude double
			do{
				//try blok koji provjerava unos
				try{
					num = in.nextInt();
					
					isTrue= false;
				}
				// hvatanje izuzetka
				catch (InputMismatchException e) {
				    System.out.println("Input MIsmatch Exception, unesite ponovo cijeli broj;"); 
				    in.nextLine();
				
				}
			}while(isTrue);
			
			return num;
		}

	}

