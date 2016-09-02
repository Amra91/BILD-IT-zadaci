package Zadaci_01_09_2016;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/* (Process large dataset) 
 * A university posts its employees’ salaries at 
 * http:// cs.armstrong.edu/liang/data/Salary.txt. 
 * Each line in the file consists of a faculty member’s first name, last name, rank, and salary 
 * (see Programming Exercise 12.24). 
 * Write a program to display the total salary for assistant professors, associate professors, full professors, and all faculty, respectively, 
 * and display the average salary for assistant professors, associate professors, full professors, and all faculty, respectively. 
 * 
 */
public class ProcessLargeDataset {

	public static void main(String[] args) {
		  
		try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt"); //objekat url
            Scanner in = new Scanner(url.openStream());	//scanner za citanje url
            
            ArrayList <Double> assistant = new ArrayList <>();		//ArrayList za docenta
            ArrayList <Double> associateProf = new ArrayList<>();	//ArrayList za vanr.profesora
            ArrayList <Double> fullProf = new ArrayList <>();		//ArrayList za redovnog profesora
            
            while (in.hasNext()){
            	in.next();	
                in.next();
                 String rank = in.next();	//upisivanje iz fajla rang profesora
                
                 if (rank.contains("assistant")) {	//if ukoliko je docent
                     assistant.add(in.nextDouble());	//ubacivanje plate u arrayListu
                 } 
                 else if (rank.contains("associate")) {	//if ukoliko je van prof
                     associateProf.add(in.nextDouble());	//ubacivanje plate u arrayListu
                 } 
                 else {
                     fullProf.add(in.nextDouble());	//ukoiko je red prof ubacivanje plate u listu
                 }
            }
            in.close();
            /* Za docenta racunanje ukupne plate i prosjecne plate */
            double sumAssis =0;
            int countAssis=0;
            for (double e: assistant){
            	sumAssis +=e;
            	countAssis++;
            }
            System.out.println("Ukupne plate za docente su "+ sumAssis);
            System.out.println("Prosjecna plata za docente je "+ ((double)sumAssis/countAssis));
            
            /* Za vanrednog profesora racunanje ukupne plate i prosjecne plate*/
            double sumAssoc=0;
            int countAssoc=0;
            for(double e: associateProf){
            	sumAssoc+=e;
            	countAssoc++;
            }
            System.out.println("Ukupne plate za vanredne profesore su "+sumAssoc );
            System.out.println("Prosjecna plata za vanredne profesore je "+ ((double)sumAssoc/countAssoc));
            
            /* Za redovnog profesora racunanje ukupne plate i prosjecne plate */
            double sumFull=0;
            int countFull=0;
            for(double e: fullProf){
            	sumFull+=e;
            	countFull++;
            }
            System.out.println("Ukupne plate za vanredne profesore su "+sumFull );
            System.out.println("Prosjecna plata za vanredne profesore je "+ ((double)sumFull/countFull));
            
            //racunanje ukupnih plata za cijeli fakultet
            System.out.println("Ukupne plate za sve profesore su: "+ sumFull + sumAssoc + sumAssis);
            
            //racunanje ukupnog prosjeka za cijeli fakultet
            System.out.println("Ukupni prosjek za sve profesore je:" 
            + ((double)(sumFull+sumAssoc+sumAssis)/(countFull+countAssoc+countAssis)));
        } 
	 catch(MalformedURLException ex){	//exception ukoliko url nije dobro definisan
			System.out.println(ex.getMessage());
		}
	catch(java.io.IOException ex){		//exception ukoliko ima problem sa citanjem url, prekid konekcije, nedostupan fajl i sl
			System.out.println(ex.getMessage());
		}

	}
}
