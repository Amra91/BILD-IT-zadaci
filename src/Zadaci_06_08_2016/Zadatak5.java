package Zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeæe v, 
možemo izraèunati minimalnu dužinu piste potrebne da avion uzleti 
koristeæi se sljedeæom formulom: dužina = v * v / 2a. 
Napisati program koji pita korisnika da unese v u m/s i a u m/s 
te ispisuje korisniku minimalnu dužinu piste. 
(Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je 514.286)
**/
public class Zadatak5 {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unesite brzinu v u [m/s].");
		//unos brzine i provjera da li je ispravno uneseno
		double brzina = enterValue();
		
		System.out.println("Unesite ubrzanje a u [m/s^2].");
		//unos ubrzanja i provjera da li je isprano uneseno
		double ubrzanje = enterValue();
		
		System.out.printf("%3s%3.3f","Duzina piste iznosi: ",calculateLength(brzina, ubrzanje));
		
	}
	//provjera unosa 
	public static double enterValue(){
		double br = 0;
		boolean status = false;
		do{
			//try blok za izvrsenje da li ima exception
			try{
				 br = in.nextDouble();
				
				status = true;
				//catch hvata izuzetak
			}catch(InputMismatchException ex){
				System.out.println("Unijeli ste nevazeci iznos.\nUnesite ponovo.");
				in.nextLine();
			}
		}while(status != true);
		return br;
	}
	
	//metoda za racunanje minimalne duzine pise
	public static double calculateLength(double brzina, double ubrzanje){
		
		double duzina_piste = ((brzina * brzina)/(2*ubrzanje));
		
		return duzina_piste;
	}



}


