package Zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  Napisati metode sa sljedeæim headerima: 
 *  public static int reverse(int number) 
 *  i public static boolean isPalindrome(int number). 
 *  Prva metoda prima cijeli broj kao argument i vraæa isti ispisan naopako. 
 *  (npr. reverse(456) vraæa 654.) 
 *  Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko nije. 
 *  Koristite reverse metodu da implementirate isPalindrome metodu. 
 *  Napišite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne. 
 */
public class Zadatak3 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unesite neki broj");
		//provjera da li je broj int
		int number = checkInput();
	
	 System.out.print("Broj koji smo unijeli ");
	 
	 //provjera za printanje da li je palindrom
	 if(isPalindrome(number) == true){
	    	   System.out.println("je palindrom");
	    	   
	    }else{
	    	   System.out.println("nije palindrom");
	   
	      	}
	 System.out.println("Reverse broja "+ number + " je " +reverse(number));
	
	
	}
	// metoda koja vrsi zamjenu
	public static int reverse(int number){
		int novi_broj = 0;
		
		//novi broj postaje reverse broj
		for(int i = number; i !=0; i /= 10) {
		        novi_broj = novi_broj * 10 + i % 10;
		    }
		 
		       
		 return novi_broj;  
	}
	// boolean provjera da li je palindorm na osnovu reverse metode
	public static boolean isPalindrome(int number){
		
		boolean status = false;
		
		//uslov ako je reverse metoda jednaka unesenom broju
		//status je true-broj je palindrom
		if (reverse (number)== number){
			 status = true;
			}
		else {
			status = false;
		}
		
		return status;
	}
	// metoda za provjeru da li je uneseni broj ispravan
	public static int checkInput(){
		boolean status = false;
		int numb = 0;
		do{
			try{
				numb = in.nextInt();
				status = true;
				//hvata input mismatch exception
			}catch(InputMismatchException ex){
				System.out.println("Nevazeci unos.\nUnesite ponovo.");
				in.nextLine();
			}
		
		}while(status != true);
		return numb;
	}
}

