package Zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 
 *  te broji i ispisuje koliko je koji broj puta unijet. 
 *  Pretpostavimo da nula prekida unos brojeva. 
 *  Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 
 *  program nam ispisuje da se broj 2 ponavlja 2 puta, 
 *  broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
 */
public class Zad5_BrojacUnosa {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Unesite niz brojeva [0 prekida unos]:");
		//broj koji se unosi
		int a = provjera();
		
		//brojac unosa
		int k=0;
		
		// kreiranje niza od makismalno 100 elemenata
		int[] niz = new int[100];
		
		//niz u koji spremamo brojac 
		int[] niz_brojaca = new int[100];
		
		//while uslov dok unos ne bude 0 i mogucnost unosa do 100 brojeva
		//uslov k<100 izbjegava ArrayIndexOutOfBoundsException
		while (a!=0 && k<100){
			
			//svaki broj koji se unese sprema se u niz
			niz[k]=a;
			
			//inkrementiranje brojaca
			k++;
			
			//ponovni unos
			a= provjera();
		}
	
		// brojac ponavljanja brojeva
		int counter=0;
	
		// for petlja za spremanje brojaca u novi niz
		for (int i=0; i<niz.length; i++){
			
			for (int j =0; j<niz.length; j++){
				
				//uslov ako je pronadjen isti broj, povecava se brojac za 1;
				if (niz[i]== niz[j]){
					counter++;
					}
			}
			//spremamo brojac u niz .. 
			niz_brojaca[i] = counter;
			counter = 0;
			
		}
		
		// petlja koja brise duple brojeve, dodjeljujuci im vrijednost 0
		for(int i=0; i<niz.length; i++){
			for(int j=0; j<i; j++){
				if(niz[i] == niz[j]){
					niz[i] = 0;
				}
			}
		}
		
		//printanje brojeva
		for(int i=0; i<niz.length; i++){
			if(niz[i] != 0){
			System.out.println("Broj "+niz[i]+" se pojavljuje "+niz_brojaca[i]+ " puta. ");
			
			}
		}
	}
	
	
	public static int provjera(){
		
		int broj =0;
		boolean provjera = true;
		
		/// do while petlja da se izvrsava sve dok ne bude korektan unos
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