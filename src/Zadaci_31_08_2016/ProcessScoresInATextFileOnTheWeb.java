package Zadaci_31_08_2016;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/*
 *  (Process scores in a text file on the Web) 
 *  Suppose that the text file on the Web http://cs.armstrong.edu/liang/data/Scores.txt 
 *  contains an unspecified number of scores. 
 *  Write a program that reads the scores from the file and displays their total and average. 
 *  Scores are separated by blanks
 */
public class ProcessScoresInATextFileOnTheWeb {

	public static void main(String[] args) {
		
		 try {
	            URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt"); //objekat url
	            Scanner in = new Scanner(url.openStream());	//scanner za citanje url
	            
	            int sum =0;
	            int counter =0;
	           
	            while (in.hasNextInt()) {
	                int scores = in.nextInt();
	                sum+=scores;	//suma svih brojeva
	                counter++;		//inkrement brojaca za svaki int
	                
	            }
	            System.out.println("Sum is  " + sum);
	            System.out.println("Average is "+ ((double)sum/counter));
	            in.close();
	        } 
		 catch(MalformedURLException ex){	//exception ukoliko url nije dobro definisan
				System.out.println(ex.getMessage());
			}
		catch(java.io.IOException ex){		//exception ukoliko ima problem sa citanjem url, prekid konekcije, nedostupan fajl i sl
				System.out.println(ex.getMessage());
			}
	}
}
