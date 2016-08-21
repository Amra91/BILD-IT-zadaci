package Zadaci_20_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//kreiranje objekta
		Account myAccount = new Account(1122,20000);
		
		myAccount.setAnnualInterestRate(4.5);	//kreranje kamtne stope
	
		
		//podizanje novca sa racuna
		System.out.println("Unesite koliko novca zelite podici sa Vaseg racuna:");
		double podici = check();
		while(podici>myAccount.getBalance()){
			System.out.println("Trazeni iznos je manji od salda vaseg racuna./nUnesite ponovo:");
			podici= check();
		}
		myAccount.withdraw(podici);
		
		//polog novca na racun
		System.out.println("Unesite koliko novca zelite deponovat na Vas racun:");
		double deponovat = check();
		myAccount.deposit(deponovat);
		
		//saldo racuna poziva se metodom getBalance
		System.out.println("Saldo racuna je "+ myAccount.getBalance()+ " KM");
		System.out.println("Mjesecna kamatna stopa je: "+ myAccount.getMonthlyInterstRate()+" %.");
		System.out.println("Kamata za ovaj mjesec je " + myAccount.getMonthlyInterest()+ " KM.");
		System.out.println("Datum kreiranja racuna je "+ myAccount.getDateCreated());
	}
	
	//metoda za provjeru da li je unos ispravan decimalni broj
	public static double check(){
		
		double num =0;
		boolean isTrue = true;
		
		/// do while petlja da se izvrsava unos broja sve dok isti ne bude double
		do{
			//try blok koji provjerava unos
			try{
				num = in.nextDouble();
				
				isTrue= false;
			}
			// hvatanje izuzetka
			catch (InputMismatchException e) {
			    System.out.println("Input MIsmatch Exception, unesite ponovo cijeli broj;"); 
			    in.nextLine();
			
			}
		}while(isTrue);
		
		return num;
	}



}
