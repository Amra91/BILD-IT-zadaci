package Zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
Napisati program koji ispisuje sve prijestupne godine, 
10 po liniji, u rasponu godina koje korisnik unese. 
Program pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. 
Razmak izmeðu godina treba biti jedan space. 
**/
public class Zadatak2 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Molimo unesite pocetnu godinu.");
		//provjera pocetne godine prilikom unosa
		int first_year = enterYear();
		
		System.out.println("Molimo unesite krajnju godinu.");
		//provjera posljednje godine prilikom unosa
		int second_year = enterYear();
		
		//metoda za printanje
		System.out.println("Sve prestupne godine su:");
		printLeapYears(first_year, second_year);
	}
	//metoda za provjeru exception
	public static int enterYear(){
		boolean status = false;
		int year = 0;
		do{
			try{
				year = in.nextInt();
				status = true;
			}catch(InputMismatchException ex){
				System.out.println("Nepravilan unos.\nMolimo unesite ponovo");
				in.nextLine();
			}
			
		}while(status != true);
		return year;
	}
	
	
	public static void printLeapYears(int first_year, int second_year){
		int brojac = 0;
		//provjera krece od prve do posljednje, ukljucujuci i prvu i posljednju
		for(int i=first_year; i<=second_year; i++){
			
			if(isLeap(i) == true){
				System.out.print(i+ " ");
				brojac++;
				
			}
			if(brojac == 10){
				System.out.println();
				brojac = 0;
			}
		}
	}
	// metoda za provjeru da li je godina prestupna
	public static boolean isLeap(int i){
		
		if ((i%4==0 && i % 100 !=0)||(i%400 ==0)){
			return true;
		  } 
		else {
		    return false;
		  }
	}
	



}
