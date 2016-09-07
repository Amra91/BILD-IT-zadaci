package Zadaci_07_09_2016;

import java.util.Scanner;

/*
 * (Print the characters in a string reversely) Write a recursive method that displays a string reversely on the console using the following header:
 * public static void reverseDisplay(String value)
 * For example, reverseDisplay("abcd") displays dcba. 
 * Write a test program that prompts the user to enter a string and displays its reversal.
 */
public class StringReversely {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter string: ");
		
		String str =in.nextLine();		//unos stringa
		
		System.out.println("Reverse string: ");
		
		reverseDisplay(str);			//poziv metode
		
		in.close();
	
	}
	
	public static void reverseDisplay(String value){
		 
		//uslov zaustavljanje rekurzije
		if (value.length()== 0){
			return;
		}
		//printanje posljednjeg karaktera u stringu 
		System.out.print(value.substring(value.length()-1));
		
		//rekurzivni poziv 
		// novi string je substring glavnog stringa koji je umanjen za posljednji karakter
		reverseDisplay(value.substring(0,value.length()-1));
	 }
}

