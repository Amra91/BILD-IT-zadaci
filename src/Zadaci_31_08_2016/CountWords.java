package Zadaci_31_08_2016;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/*
 *  (Count words) 
 *  Write a program that counts the number of words in President Abraham Lincoln’s Gettysburg address from 
 *  http://cs.armstrong.edu/liang/data/ Lincoln.txt. 
 */
public class CountWords {

	public static void main(String[] args) {
		
		try{
			
			URL url = new URL ("http://cs.armstrong.edu/liang/data/Lincoln.txt"); //kreiranje URL objekata
			Scanner in = new Scanner(url.openStream());      //Scanner za url 
			
			int count=0;
			
			while (in.hasNext()){

				 in.next();
				count++;	//inkrementiranje brojaca sve dok ima rijeci u tekstu
			}
			
			System.out.println("Number of words is "+ count);
			
			System.out.println();
			in.close();
			
		}
		catch(MalformedURLException ex){	//exception ukoliko url nije dobro definisan
			System.out.println(ex.getMessage())	;	
			}
		catch(java.io.IOException ex){		//exception ukoliko ima problem sa citanjem url, prekid konekcije, nedostupan fajl i sl
			System.out.println(ex.getMessage());
		}
	
	}
}
