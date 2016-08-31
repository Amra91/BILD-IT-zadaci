package Zadaci_30_08_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 *  (Count characters, words, and lines in a file) 
 *  Write a program that will count the number of characters, words, and lines in a file. 
 *  Words are separated by whitespace characters. 
 *  The file name should be passed as a command-line argument,
 */
public class CountCharactersWordsAndLinesInAFile {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//Kreira se fajl objekta, a koristimo datoteku "dok.txt"
		File file = new File("fajl.txt");
		file.createNewFile();
		// Provjera da li postoji fajl
		if(!file.exists()){
			System.out.println("Fajl ne postoji.");
		}
		else{
		
		//Kreira se scanner objekt za ucitavanje podataka iz odredjenog fajla
		Scanner in  = new Scanner(file);
		
		int line = 0; 			//brojac linija u tekstu
		int character = 0;		//brojac karaktera u tekstu
		int word =0;			//brojac rijeci u tekstu
		
		
		// Metoda hasNextLine() vraca boolean vrijednost ako ima jos karaktera u redovima za citanje	
		while (in.hasNextLine()){
			in.nextLine();
			line++;			// broji linije u tekstu
		}
		in.close(); 
		
		//otvara novi scanner kako bi se mogli ponovo procitati podaci
		in = new Scanner(file);		 
		
		while(in.hasNext()){
			word++;	// brojimo slova u fajlu tako sto se preskace svaki space
			character+=in.next().length();	//brojimo svaki karakter u tekstu, tako sto dodajemo duzinu svake rijeci
			
		}
		in.close();
		
		System.out.println("U datoteci ima: ");
		System.out.println("Karaktera: "+character);
		System.out.println("Linija: "+line);
		System.out.println("Rijeci: "+ word);
	}
	
  }
}

