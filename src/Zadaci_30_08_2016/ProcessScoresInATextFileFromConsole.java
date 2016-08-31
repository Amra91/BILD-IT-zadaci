package Zadaci_30_08_2016;

import java.io.IOException;
import java.util.Scanner;
//ukoliko se zadatak odnosi da treba upisivat sa konzole u fajl (bodove)

public class ProcessScoresInATextFileFromConsole {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("Unesite ime fajla");
		//pozivanje fajla sa relativnnim nazivom datotekom
		java.io.File file = new java.io.File(in.next()+".txt");
		
		//provjera ukoliko fajl postoji
		if(!file.exists()){
			System.out.println("Fajl ne postoji.");
		}
		else{
		
		// writer za pisanje u fajl
		java.io.PrintWriter ime = new java.io.PrintWriter(file);
		
		//Scanner za pisanje sa konzole, enter prekida unos
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of scores:");
		//unos bodova sa konzole
		ime.write(input.nextLine());
		ime.close();
		in.close();
		input.close();
	
		//citanje iz fajla
		Scanner input1 = new Scanner(file);
		double sum =0;
		int counter =0;
			//ukoliko se unesu double vrijedosti
            while (input1.hasNextDouble()) {
            	double  scores=input1.nextDouble();
            	sum+=scores;	
                counter++;
            }
           input1.close();
    
		System.out.println("Sum is "+ sum);
		System.out.println("Average is "+ (sum/counter));
		
		}
	}
}
