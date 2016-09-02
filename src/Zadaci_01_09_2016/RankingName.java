package Zadaci_01_09_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 *  (Baby name popularity ranking) 
 *  The popularity ranking of baby names from years 2001 to 2010 is  downloaded 
 *  from www.ssa.gov/oact/babynames and stored in files named 
 *  babynameranking2001.txt, 
 *  babynameranking2002.txt, . . . , 
 *  babynameranking2010.txt. 
 *  Each file contains one thousand lines. 
 *  Each line contains a ranking, a boy’s name, number for the boy’s name, a girl’s name, and number for the girl’s name. 
 *  For example, the first two lines in the file babynameranking2010.txt are as follows:
 *  
 *  1 Jacob 21,875 Isabella 22,731 
 *  2 Ethan 17,866 Sophia 20,477
 *  
 *  So, the boy’s name Jacob and girl’s name Isabella are ranked #1 
 *  and the boy’s name Ethan and girl’s name Sophia are ranked #2. 
 *  21,875 boys are named Jacob and 22,731 girls are named Isabella. 
 *  Write a program that prompts the user to enter:
 *   the year, 
 *   gender, 
 *   and followed by a name, 
 *   and displays the ranking of the name for the year. 
 */

//za listu koja je ovog oblika na prvoj poziciji rang, druga  ime djecaka, pa broj djecaka, pa ime djevojcice, pa broj djevojcica sa tim imenom 
//1 Jacob 21,875 Isabella 22,731 
//2 Ethan 17,866 Sophia 20,477
//primjer babynameranking2010.txt

public class RankingName {

	public static void main(String[] args) throws FileNotFoundException {
		

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        String year = input.next();

        System.out.print("Enter gender(M/F): ");
        String gender =input.next();

        System.out.print("Enter name: ");
        String name = input.next();
        input.close();
        //provjera da li postoji fajl sa tim imenom
        File file = new File("babynameranking" + year + ".txt");
       
        //if uslov ukoliko fajl ne postoji
        if (!file.exists()) {
            System.out.println("No record for " + year);
        }
        
        else{
        	//rang pozicije imena
        	int rank = 0;
        	
        	//while za pretragu muskog imena
        	if (gender.equals("M")){
        		
        		Scanner in = new Scanner(file);
        		
        		while (in.hasNextLine()) {
        			
            		int ranked = in.nextInt();	//rangirana imena
            		
            		String muskoIme = in.next();	//u fajlu prvo ide musko ime
            		
            		if (name.equals(muskoIme)){	//uslov ako je musko ime jednako trazenom imenu
            			rank =ranked;	//taj rang imena se uzima u obzir
            			break;			//prekid while petlje
            		}
            		in.nextInt();	//citanje ukupnog broja muskih pod tim imenom
            		in.next();		//citanje zenskog imena
            		in.nextInt();	//citanje ukupnog broja zenskih pod tim imenom
            		
            	}
        		in.close();
        	}
        	else if (gender.equals("F")){
        		
        		Scanner in = new Scanner(file);
        	
        		while (in.hasNextLine()) {
        			
            		int ranked = in.nextInt();		//rangirana imena
            	
            		in.next();					//citanje muskog imena iz fajla
            		in.nextInt();				//citanje ukupnog broja muskih pod tim imenom
            		String zenskoIme =in.next();	//citanje zenskog imena
            		
            		if (name.equals(zenskoIme)){	//if uslov ukoliko je uneseno ime jednako datom imenu
            				rank=ranked;			//taj rang imena se uzima u obzir
            				break;					//prekid while petlje
            			}
            		in.nextInt();					//citanje ukupnog broja zenskih pod tim imenom
            		
            	}
        		in.close();
        	}
        	
            
            //ukoliko rank ostaje 0, nije pronadjeno ime u datoteci
         
            if(rank==0){
            	
            	System.out.println("The name " + name +" is not ranked in year " +year);

            }
            else{
            	System.out.println(name +" is ranked #" + rank+ " in year " +  year);

            }
        }
	}
}
