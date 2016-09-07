package Zadaci_06_09_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
 * Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2)
 * and fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci 
 * numbers. The current Fibonacci number would then be f0 + f1. The algorithm can be described as follows:
 * f0 = 0; // For fib(0)
 * f1 = 1; // For fib(1)
 * for (int i = 1; i <= n; i++) {
 *  currentFib = f0 + f1;
 *   f0 = f1;
 *   f1 = currentFib;
 *   }
 *   // After the loop, currentFib is fib(n)
 *   Write a test program that prompts the user to enter an index and displays its Fibonacci number.
 *   
 *   Fibonnaci brojevi za n = 0, 1, 2 … , su:  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987
 */
public class FibonacciNumbers {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean check =true;
    
    	do{			//do while petlja sve dok ne bude ispravan unos
    		
    		try{
    			System.out.println("Unesite fibonacci indeks: ");
    			
    			int i =in.nextInt();	// unos indeksa
    			check = false;
    			
    			System.out.println("Fibonacci vrijednost je "+ fibonacci(i));
    		}
    		catch(InputMismatchException ex){		//hvatanje izuzetka ako je pogresan unos
    			
    			System.out.println("Pogresan unos, unesite ponovo:" );
    			in.nextLine();
    		}
    	}
    	while (check);

    	in.close();
    	
	 }

	 public static long fibonacci(int index) {

		//uslovi zaustavljanja rekurzije, osnovni slucajevi	
	    if (index == 0){
	           
	       	return 0;
	        }
	    
	    if (index == 1){
	         
	        	return 1;
	        }
	   
	    int f0 = 0;
	    
	    int f1 = 1;
	    
	    //for petlja za racunanje indkesa
	    for (int i = 2; i <= index; i++) {
	    	
	          int  fib = f0 + f1;
	            f0 = f1;
	            f1 = fib;
	        }
	    
	    //vraca fibonaci vrijednost datog indeksa
	    return f1;
	  }
}