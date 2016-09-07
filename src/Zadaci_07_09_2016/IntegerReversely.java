package Zadaci_07_09_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Print the digits in an integer reversely) Write a recursive method that displays an int value reversely on the console using the following header:
 * public static void reverseDisplay(int value)
 * For example, reverseDisplay(12345) displays 54321. Write a test program that prompts the user to enter an integer and displays its reversal.
 */
public class IntegerReversely {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean check =true;
    
    	do{			//do while petlja sve dok ne bude ispravan unos
    		
    		try{
    			System.out.println("Unesite broj: ");
    			
    			int i =in.nextInt();				// unos broja
    			check = false;
    			
    			reverseDisplay (i);
    			
    		}
    		catch(InputMismatchException ex){		//hvatanje izuzetka ako je pogresan unos
    			
    			System.out.println("Pogresan unos, unesite ponovo:" );
    			in.nextLine();
    		}
    	}
    	while (check);

    	in.close();
		
		
	}
	
	public static void reverseDisplay(int value){
		
		//uslov zaustavljanja rekurzije, kada dodje vrijednost do 0
		if (value==0){
			return;
		}
		
		//printanje zadnjeg broja
		System.out.print( value%10);
		
		//rekurzivni poziv 
		reverseDisplay(value/10);
	}
	
	
	
}
