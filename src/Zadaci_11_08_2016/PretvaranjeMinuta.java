package Zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese broj minuta 
 * (npr. 1 milijardu) te ispiše korisniku koliko je to u godinama i danima. 
 * Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.  

 */
public class PretvaranjeMinuta {
	
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		//unos minuta
		System.out.println("Unesite broj minuta:");
		
		long min = provjera();
		
		// provjera da unos ne bude manji od 0
		while (min<0){
			System.out.println("Unos je pogresan, unesite ponovo:");
			min = provjera();
		}
		System.out.println(convert(min));
		
	}
	//metoda za konvertovanje 
	public static String convert  (long min){
	
		//djelilac je 1 godina = 525.600 minuta
		long djelilac = 60*24*365;
		long god = min/djelilac;		//dobivanje godine
		long dan =min%djelilac/(24*60);	//dobivanje dana
		 
		return min+" minuta je " +  god + " godina i " + dan + " dana.";
	}
	
	//metoda za provjeru da li je unos ispravan cjeli broj
		public static long provjera(){
	
			long broj =0;
			boolean provjera = true;
			
			/// do while petlja da se izvrsava unos broja sve dok isti ne bude double
			do{
				//try blok koji provjerava unos
				try{
					broj = in.nextLong();
					
					provjera= false;
				}
				// hvatanje izuzetka
				catch (InputMismatchException e) {
				    System.out.println("Input MIsmatch Exception, unesite ponovo cijeli broj;"); 
				    in.nextLine();
				
				}
			}while(provjera);
			in.close();
			
			return broj;
		}

}
