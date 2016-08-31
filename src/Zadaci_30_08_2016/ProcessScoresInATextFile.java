package Zadaci_30_08_2016;

import java.io.IOException;
import java.util.Scanner;

/*  (Process scores in a text file) 
 *  Suppose that a text file contains an unspecified number of scores separated by blanks. 
 *  Write a program that prompts the user to enter the file, reads the scores from the file, 
 *  and displays their total and average. 
 */
public class ProcessScoresInATextFile {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//pozivanje fajla sa relativnnim nazivom datotekom
		java.io.File file = new java.io.File("scores.txt");
		
		//provjera ukoliko fajl postoji
		if(!file.exists()){
			System.out.println("Fajl ne postoji.");
		}
		else{
			//kreiranje scannera za citanje iz fajla
			Scanner input = new Scanner(file);
			int counter =0; //brojac
			int sum=0;		//suma
		
            while (input.hasNextInt()) {
            	int scores = input.nextInt();
            	//dodavanje svakog broja sumi
            	sum+=scores;
            	//brojac bodova
                counter++;
                
            }
            input.close();
    
            System.out.println("Sum is "+ sum);
            System.out.println("Average is "+ ((double)sum/counter));
		
		}
	}
}
