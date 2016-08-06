package Zadaci_06_08_2016;


import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Napisati program koji uèitava iznos investicije, 
 * godišnju interesnu stopu i broj godina 
 * te vraæa buduæu vrijednost investicije koristeæi se sljedeæom formulom: 
 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 * Na primjer:
 *  ukoliko uneste kao iznos investicije 1000, 
 * 3.25 kao godišnju interesnu stopu i 
 * 1 kao broj godina 
 * program vam vraæa 1032.98 kao buducu vrijednost investicije.

 */
public class Zadatak1 {
	static Scanner in = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unos iznosa investicije
		System.out.println("Unesite iznos investicije: ");
		double investicija= enterValues();
		
		//unos godisnje interesne stope
		System.out.println("Unesite godisnju interesnu stopu: ");
		double stopa = enterValues();
		
		//unos broja godina
		System.out.println("Unesite broj godina: ");
		int godine = provjera();
		
		
		System.out.println("Buduca vrijednost investicije za "+ (int)godine + " godinu, iznosi "
		+ BVI(investicija, stopa, godine) + " KM." );
		
}

	// provjera da li je integer broj ispravno unesen i da li ima izuzetaka
	public static double enterValues(){
		boolean status = false;
		double unos = 0;
		do{
			try{
				unos = in.nextDouble();
				status = true;
			}
			catch(InputMismatchException ex){
				System.out.println("Nepravilan unos.\nUnesite ponovo.");
				in.nextLine();
				
			}
			
		}while(status != true);
	
		return unos;
	
	}
	//metoda za provjeru za exception
	public static int provjera(){
		boolean status = false;
		int unos = 0;
		do{
			try{
				unos = in.nextInt();
				status = true;
			}
			catch(InputMismatchException ex){
				System.out.println("Nepravilan unos.\nUnesite ponovo.");
				in.nextLine();
				
			}
			
		}while(status != true);
	
		return unos;
	
	}
	
	// metoda za izracunavanje buduce vrijednosti investicije 
	//metoda prima investicuju, godisnju stopu i godinu
	public static double BVI(double investicija, double stopa, int godine){
	
		//izracunanje mjesecne stope
		double a = (stopa/12)/100;
		// vraca buducu vrijednost investicije
		return (investicija* Math.pow ((1+a),(godine*12)));
			
	}
	
	

}