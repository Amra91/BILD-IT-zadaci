package Zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese dva cijela, 
 * pozitivna broja te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
 */
public class Zad2_DvaCijelaBroja {
	
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Unesite dva cijela broja");
		int a = provjera();			//unos prvog broja
		int b = provjera();			//unos drugog broja
		
		// poziv metoda za najmanji i najveci zajednicki djelilac
		najmanjiZajednickiDjelilac(a,b);
		najveciZajednickiDjelilac(a,b);
		
		
		
	}
	
	public static void najmanjiZajednickiDjelilac(int a, int b){
		//varijabla koja oznacava najmanji zajedniki djelilac
		int NZDmin=1;
		
		// for petlja ide od 2 do a, ukljucujuci i a,
		//jer a je zadnji moguci najmanji zajednicki djelilac
		for (int i=2;i<=a; i++){
			if (a%i==0 && b%i==0){
				NZDmin=i;
				//kada se pronadje NMZ prekida se izvrsenje petlje
				break;
			}
		}
		
		//uslov ako je najmanjiZajednicki djelilac =1, znaci da brojevi nemaju NZD
		if (NZDmin==1){
			System.out.println("Brojevi "+a+ " i "+ b + " nemaju najmanji zajednicki djelilac.");
		}
		else{
			System.out.println("Najmanji zajednicki djelilac za brojeve "+ a+ " i "
					+ b + " je " + NZDmin + ".");
		}
	}
	public static void najveciZajednickiDjelilac(int a, int b){
		
		//varijabla koja oznacava najveci zajednicki djelilac
		int NZDmax=1;
		
		// for petlja ide od 2 do a, ukljucujuci i a,
		//jer a je zadnji moguci najveci zajednicki djelilac
		for (int i=2; i<=a; i++){
				if (a%i==0 && b%i==0){
				NZDmax=i;
			}
		}
		//ako nije pronadjen ni jedan zajednicki djelilac osim 1; 
		//znaci da nemaju najveceg zajednickog djelioca
		if (NZDmax==1){
			System.out.println("Brojevi "+a+ " i "+ b + " nemaju najveci zajednicki djelilac.");
		}
		else{
			System.out.println("Najveci zajednicki djelilac za brojeve "+ a+ " i "
					+ b + " je " + NZDmax + ".");
		}
		
	}
	
	//metoda za provjeru unosa 
	public static int provjera(){
		
		int broj =0;
		boolean provjera = true;
		
		/// do while petlja izvrsava provjeru unosa broja sve dok isti ne bude ispravan
		do{
			//try blok provjerava unos
			try{
				broj = in.nextInt();
				
				provjera= false;
			}
			// hvatanje izuzetka
			catch (InputMismatchException e) {
			    System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
			    in.nextLine();
			
			}
		}while(provjera);
		
		return broj;
	}
	
	
}
