package Zadaci_07_09_2016;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Sum the digits in an integer using recursion) Write a recursive method that computes the sum of the digits in an integer.
 *  Use the following method header:
 *  public static int sumDigits(long n)
 *  For example, sumDigits(234) returns 2 + 3 + 4 = 9.
 *   Write a test program that prompts the user to enter an integer and displays its sum.
 */
public class SumDigits {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		
		 boolean check =true;
		    
	    	do{			//do while petlja sve dok ne bude ispravan unos
	    		
	    		try{
	    			
	    			System.out.print("Enter a long integer: ");
	    			
	    			long n = in.nextLong();		//unos long broja
	    			
	    			check = false;
	    			
	    			System.out.println("Sum digits "+ n + " are " + sumDigits(n));
	    			
	    			
	    		}
	    		catch(InputMismatchException ex){		//hvatanje izuzetka ako je pogresan unos
	    			
	    			System.out.println("Pogresan unos, unesite ponovo:" );
	    			in.nextLine();
	    		}
	    	}
	    	while (check);
	        
	        in.close();
	}
	
	public static int sumDigits(long n){
		
		//poziv metode koja racuna za long brojeve sumu
		return  (int)sum(n);
		
	}
	
	public static long sum(long n){
		
		//uslov zaustavljanja rekurzije,
		if (n==0){
			return n;
		}
		
		//rekurzivni poziv
		return  n%10+ sumDigits(n/10);
		
	}
}
