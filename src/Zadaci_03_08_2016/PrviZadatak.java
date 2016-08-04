package Zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati metodu koja prima 2 argumenta: 
 * poèetni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.
BONUS: metoda može primati i treæi argument, broj brojeva za isprintati po liniji.
 */
public class PrviZadatak {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int PV=0;
		int KV=0;
		int BPL=0;
		boolean provjera = true;
		// try/ catch blok ukoliko bude pogresan unos
		// do while petlja za unos dok ne bude tacan
		do{
			try{
				System.out.println("Koja je pocetna vrijednost");
				// unos pocetnog broja za provjeru prostih brojeva
				PV= in.nextInt();
		
				System.out.println("Koja je krajnja vrijednost");
				// unos krajnjeg broja za provjeru prostih brojeva
				KV=in.nextInt();
		
				System.out.println("Koliko brojeva po liniji");
				// unos koliko brojeva za isprintat po liniji
				BPL=in.nextInt();
		
				provjera= false;
			}
		// hvatanje Input mismatch exception
				catch (InputMismatchException e) {
				    System.out.println("Input MIsmatch Exception, unesite ponovo;");
				    in.nextLine();
				}
			}while(provjera);
		
		// pozivanje metode
		prostiBrojevi(PV,KV,BPL);
		in.close();
		
		
	}
	public static void prostiBrojevi(int pocetnaVrijednost, int krajnjaVrijednost, int brBrojeva){
		
		
		int brojac =0; // brojac  koliko se isprintalo brojeva
		int ukupnoProstih=0;
		
		boolean prostBroj = true;	// true ako je prost broj
		
		
		
		// provera od pocetne vrijednosti do  krajnje vrednosti(Ukljucujuci i zadnju vrijednost)
		for (int i = pocetnaVrijednost; i<=krajnjaVrijednost; i++){
			// pretpostavka da je prost broj i
			prostBroj = true;  
			
			// petlja koja provjera sve brojeve od 2 do i
			//da li se mogu dijeliti sa i
			for(int j = 2; j < i; j++){
				
				// uslov za provjeru da li je broj i djeljiv sa nekim brojem
				if(i % j == 0){ 
					// ako je djeljiv tada on nije prost broj 
					//i dodjeluje je se varijabli prostBroj false vrijednost
					prostBroj = false; 
					break;
				}
			}
	
			// ispisivanje prostih brojeva:
	
			if(prostBroj) { 		// da li je to prost broj
		
				System.out.print(i + " "); // u pitanju je prost 
						// broj pa se ispisuje
		
				brojac++;
				ukupnoProstih++;
	
			}
			if (brojac==brBrojeva){
				System.out.println();
				brojac=0;
			}
		 
		}
		System.out.println();
		System.out.println("Ukupan broj prostih brojeva u rasponu od "+ pocetnaVrijednost 
				+" do "+ krajnjaVrijednost + " je "+ ukupnoProstih + ".");
	
	}
}

