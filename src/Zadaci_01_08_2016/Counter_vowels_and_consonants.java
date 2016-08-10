package Zadaci_01_08_2016;

import java.util.Scanner;

public class Counter_vowels_and_consonants {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please, input some string?");
		String str = in.nextLine();
		in.close(); 
		
		
		int counter_of_vowels = 0; 				
		int counter_of_consonant = 0;
	
		
		//this loop finds number of vowels and consonants in the string 
		for(int i = 0; i<str.length(); i++){
			
			
			if((str.charAt(i) == 'A' || (str.charAt(i) == 'a')) || (str.charAt(i) == 'E' || (str.charAt(i) == 'e')) || (str.charAt(i) == 'I' || (str.charAt(i) == 'i')) || (str.charAt(i) == 'O' || (str.charAt(i) == 'o')) || (str.charAt(i) == 'U' || (str.charAt(i) == 'u'))){
				//condition who counting vowels in the string.
				counter_of_vowels++;
			}
			
		
			else if(str.charAt(i) != ' ' && Character.isLetter(str.charAt(i))){
				// this condition counter consonants in the string
				 
				counter_of_consonant++;
			}
			
			
			
		}
		
		
		System.out.println("You have: "+ counter_of_vowels + " vowels in your string.."+
					"\nYou have: "+ counter_of_consonant +" consonants in your string.");
	}

}
