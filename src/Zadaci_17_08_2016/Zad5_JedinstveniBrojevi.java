package Zadaci_17_08_2016;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji uèitava 10 brojeva 
 * te ispisuje koilko je jedinstvenih brojeva unijeto 
 * te sve jedinstvene brojeve koji su unijeti, razmaknute jednim spaceom. 
 * Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom.
 */
public class Zad5_JedinstveniBrojevi {

	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("Unesite 10 brojeva: ");
		
		int[] array = new int[10];
		
		//for petlja za unos brojeva
		for (int i=0; i<array.length; i++){
			array[i]= checkIn();
		}
		//brojac jedinstvenih brojeva
		int count= 0;
		boolean isTrue=true;
		
		for (int i = 0; i < array.length; i++){
		   
			// dodjeljivanje vrijednosti true ukoliko je jedinstven broj
		    isTrue=true;
		    
		    //for petlja za provjeru da li ima broj koji je jednak drugim u nizu
		    for (int j = 0; j < i; j++)  {
		    	
		    	  //if uslov za provjeru da li je broj jednak prehodnim brojevim
		        if (array[i] == array[j]) {
		        	//ako jest jednak prehodnim; vraca se false;
		          isTrue= false;
		          break;
		        	}
		       
		    	}

		    // ako je uslov zadovoljen, printa se broj koji je jedinstven
		    if (isTrue) {
		    	System.out.print(array[i]+" ");
		        count++;
		    }
		    
		}
		
		System.out.println("\nJedinstvenih brojeva ima: " +count);
	}
	
	// metoda za provjeru unosa 
	public static int checkIn(){
		
		int num =0;
		boolean checkIn = true;
		
		/// do while petlja da se izvrsava sve dok ne bude korektan unos
		do{
			//try blok provjerava unos
			try{
				num = in.nextInt();
				
				checkIn= false;
			}
			// hvatanje izuzetka
			catch (InputMismatchException e) {
			    System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
			    in.nextLine();
			
			}
		}while(checkIn);
		
		return num;
	}
}