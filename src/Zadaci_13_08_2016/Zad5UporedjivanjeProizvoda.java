package Zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita pakovanja. 
 * Želimo napisati program koji uporeðuje cijene ta dva pakovanja. 
 * Program pita korisnika da unese težinu i cijenu oba pakovanja 
 * te ispisuje koje pakovanje ima bolju cijenu.
 */
public class Zad5UporedjivanjeProizvoda {
	
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unesite cijenu za prvi proizvod");
			double price1 = checkIn();		//unos prve cijene
		
		System.out.println("Unesite kolicinu za prvi proizvod");
			double amount1 = checkIn();		//unos prve kolicine
	
		System.out.println("Unesite cijenu za drugi proizvod");
			double price2 = checkIn();		//unos druge cijene
				
		System.out.println("Unesite kolicinu za drugi proizvod");
			double amount2 =checkIn();		//unos druge kolicine
				
			
			//uslov za provjeru da li je bolja prva cijena ili druga cijena
				
		if ((price1/amount1)>(price2/amount2)){
			System.out.println("Bolju cijenu ima prvi proizvod.");
				}
		else if (((price1/amount1)<(price2/amount2))){
			System.out.println("Bolje cijenu ima drugi proizvod.");
		}
		else{
			System.out.println("Cijene za oba proizvoda je ista");
		}
				
						
		
	}
	
	
	//metoda za provjeru da li je unos ispravan 
	public static double checkIn(){

		double num =0;
		boolean check = true;
		
		/// do while petlja da se izvrsava unos broja sve dok isti ne bude double
		do{
			//try blok koji provjerava unos
			try{
				num = in.nextDouble();
				
				check= false;
			}
			// hvatanje izuzetka
			catch (InputMismatchException e) {
			    System.out.println("Input MIsmatch Exception, unesite ponovo cijeli broj;"); 
			    in.nextLine();
			
			}
		}while(check);
		
		
		return num;
	}


}
