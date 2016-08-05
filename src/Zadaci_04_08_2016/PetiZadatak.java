package Zadaci_04_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula prekida unos) 
 * te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih unešenih brojeva 
 * a koliko je bilo brojeva ispod prosjeka. 
 * Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti 100.
 */
public class PetiZadatak {
	
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Unesite brojeve [broj 0 prekida unos]: ");
	
	// kreiranje ArrayListe neodredjenih brojeva
	ArrayList <Integer> list = new ArrayList <>();
	
	int broj=1;  
	int brojac=0;
	int sum = 0;
	
	// petlja se izvrsava sve dok se ne unese 0 ili dostigne limit od 100 brojeva
	while (broj !=0 && brojac<100){
		// unos broja i provjera da li je broj int
		broj = provjera();
		//ako broj nije 0 izvrsava se uslov
		if (broj !=0){
			// broj se dodaje listi
			list.add(broj);
			// sumi se dodaje novi broj
			sum+=broj;
			// inkrement brojaca
			brojac++;
		}
	}
	
	System.out.println("\nLista cijelih brojeva koju ste unijeli:");
	// printanje liste brojeva koja je unesena
	for(int i=0; i<list.size(); i++){
		System.out.print(list.get(i)+ ", ");
		System.out.println(brojac);
	}
	System.out.println("\nProsjek brojeva je "+ sum/list.size()+".");
	System.out.println("Iznad prosjeka je " + iznadProsjeka(list,sum) + " brojeva.");
	System.out.println("Ispod prosjeka je "+ ispodProsjeka(list,sum)+ " brojeva.");
	System.out.println("Jednako prosjeku je "+ jednakoProsjeku(list,sum)+ " brojeva.");
	
	}
	//metoda za racunanje koliko je brojeva uneseno iznad prosjeka
	public static int iznadProsjeka (ArrayList<Integer> list, int suma){
		
		double prosjek =suma/list.size(); // od sume se dijeli velicina niza
		int brojac =0;
		//petlja za provjeru brojeva
		for (int i =0; i< list.size(); i++){
			//uslov za provjeru da li je broj veci od prosjeka
			if (prosjek<list.get(i)){
				//inkrement brojaca
				brojac++;
			}
		}
		//vracanje ukupnog broja brojeva koji su veci iznad prosjeka
		return brojac++;
	}
	
	//metoda za racunanje koliko je brojeva bilo ispod prosjeka
	public static int ispodProsjeka (ArrayList<Integer> list, int suma){
		
		double prosjek =suma/list.size(); // racunanje prosjeka
		int brojac =0; // brojac brojeva manjih od prosjeka
		
		//petlja za provjeru liste brojeva
		for (int i =0; i< list.size(); i++){
			//uslov da li je broj manji od prosjeka
			if (prosjek>list.get(i)){
				//inkrement brojaca
				 brojac++;
			 }
		}
		//vracanje koliko je ukupno brojeva manjih od prosjeka
		return brojac++;
	}
	
	//metoda za provjeru koliko je brojeva jednako prosjeku
	public static int jednakoProsjeku (ArrayList<Integer> list, int suma){
		
		double prosjek =suma/list.size(); // racunanje prosjeka
		int brojac =0; // brojac brojeva jednakih prosjeku
		
		// petlja za provjeru liste brojeva
		for (int i =0; i< list.size(); i++){
			//uslov da li je broj jednak prosjeku
			 if (prosjek==list.get(i)){
				 //inkrement brojaca
				 brojac++;
			 }
		}
		// vracanje ukupnog broja brojeva koji su jednaki prosjeku
		return brojac++;
	}
	
	//metoda za unos brojeva 
	public static int provjera(){
		
		int broj =0;
		boolean provjera = true;
		
		/// do while petlja da se izvrsava unos broja sve dok isti ne bude double
		do{
			//try blok koji provjerava unos
			try{
				broj = in.nextInt();
				
				provjera= false;
			}
			// hvatanje izuzetka ukoliko se desi pogresan unos odnosno INPUT MISMATCH EXCEPTION 
			catch (InputMismatchException e) {
			    System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
			    in.nextLine();
			
			}
		}while(provjera);
		
		// vraca ispravno uneseno vrijednost
		return broj;
	}
}
	

