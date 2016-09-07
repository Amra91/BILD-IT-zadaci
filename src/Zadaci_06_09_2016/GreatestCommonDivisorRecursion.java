package Zadaci_06_09_2016;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 
 * (Compute greatest common divisor using recursion) 
 * The gcd(m, n) can alsobe defined recursively as follows:
 * If m % n is 0, gcd(m, n) is n. Otherwise, gcd(m, n) is gcd(n, m % n).Write a recursive method to find the GCD. 
 * Write a test program that prompts the user to enter two integers and displays their GCD.
 */
public class GreatestCommonDivisorRecursion {
	
    static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	        
	      System.out.println("Unesite prvi broj:");
	        int n1 = check();		//unos prvog broja
	      System.out.println("Unesite drugi broj:");
	        int n2 = check();		//unos drugog broja

	      System.out.println("Najveci zajednicki sadrzilac je: " + gcd(n1,n2));
	      in.close();

	    }

	    private static int gcd(int n1, int n2) {
	        
	    	//uslov zaustavljanja rekurzije
	    	if (n1 % n2 == 0){
	    		
	            return n2;
	    	}
	    	else {
	    		
	    		//rekurzivni poziv
	            return gcd(n2, n1 % n2);
	    	}
	    }
	    
	   
	    public static int check (){
	    	
	    	boolean check =true;
	    	int a =0;
	    	
	    	//do while petlja sve dok ne bude ispravan unos
	    	do{
	    		
	    		try{
	    			// unos broja
	    			a =in.nextInt();
	    			check = false;
	    			
	    		}
	    		catch(InputMismatchException ex){		//hvatanje izuzetka ako je pogresan unos
	    			
	    			System.out.println("Pogresan unos, unesite ponovo:");
	    			in.nextLine();
	    		}
	    	}
	    	while (check);
	    	
	    	 return a;
	    }
	    

	}
