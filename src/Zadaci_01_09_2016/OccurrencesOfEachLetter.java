package Zadaci_01_09_2016;

import java.io.File;
import java.io.IOException;

/*
 *  (Occurrences of each letter) 
 *  Write a program that prompts the user to enter a file name and displays the occurrences of each letter in the file. 
 *  Letters are case-insensitive. //brojac svakog slova
 */
public class OccurrencesOfEachLetter {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Unesite ime fajla ");
		java.util.Scanner in = new java.util.Scanner (System.in);
		File file = new File (in.nextLine()+ ".txt");
		in.close();
		//if uslov ukoliko fajl postoji
		if (!file.exists()){
			System.out.println("Fajl ne postoji.");
		}
		else{
			//niz koji sprema svako slovo i broji ga
			int[] countLetter = new int[26]; 
		
				java.util.Scanner input = new java.util.Scanner(file);	//citac fajla
			
				while (input.hasNextLine()) {	
					
					String str = (input.next()).toUpperCase();	//kreiranje stringa i pretvaranje u velika slova
					countLetters(countLetter, str);			//metoda za brojanje slova u stringu str
				}
			input.close();

			print(countLetter);
				
		}
	}
	public static void countLetters(int[] count, String str) {
			//for petlja za prolazak kroz cijeli string
			for (int i = 0; i < str.length(); i++) {
				//if uslov ukoliko je karakter slovo
				if (Character.isLetter(str.charAt(i)))
					//inkremnet na odredjenu poziciju datog slova u nizu (65 prestavlja a u ascii kodu)
					count[(int)(str.charAt(i) - 65)]++;
			}
	}
	public static void print (int [] array){
		for (int i = 0; i < array.length; i++) {
			//printanje svakog slova od A do Z
			System.out.println("Broj slova " + (char)(65 + i) + " je: " + array[i]);
		}
	}
}
