package Zadaci_07_09_2016;
/*
 * (Occurrences of a specified character in a string) Write a recursive method that 
 * finds the number of occurrences of a specified letter in a string using the following method header:
 * public static int count(String str, char a)
 * For example, count("Welcome", 'e') returns 2. 
 * Write a test program that prompts the user to enter a string and a character,
 *  and displays the number of occurrences for the character in the string
 */

public class CharacterStringCount {

	public static void main(String[] args) {
		
		java.util.Scanner in = new java.util.Scanner (System.in);
		
		System.out.println("Unesite string: ");
		String str = in.nextLine();
		
		System.out.println("Unesite karakter: ");
		char a = in.next().charAt(0);
		
		System.out.println("Broj ponavljanja  karaktera \""+a +"\" u stringu \""+ str+ "\" je "+ count(str,a) + " puta." );
		
		in.close();
	}
	
	public static int count(String str, char a){
		
		//brojac 
		int count =0;
		
		//uslov ukoliko je karakter 0 indeksa jednak trazenom karakteru
		if (str.charAt(0) ==a){
			count=1;
		}
		
		//uslov zaustavljanja rekurzije
		if  (str.length()==1){
			return count;
		}
		
		//rekurzivan poziv 
		return  count +count(str.substring(1), a);
		
	}
}
