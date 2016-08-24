package Zadaci_23_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 *  (Displaying the prime factors) 
 *  Write a program that prompts the user to enter a positive integer 
 *  and displays all its smallest factors in decreasing order. 
 *  For example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2. 
 *  Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) 
 *  and retrieve and display them in reverse order. 
 */
public class PrimeFactors {

	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {

		
        System.out.print("Enter a positive integer: ");
        int num = checkIn();
        //uslov za pozitivan unos integera
        while (num<0){
        	num=checkIn();
        }
       
        //kreiranje objekta 
        StackOfIntegers stack = new StackOfIntegers();

        int factor = 2;
        //while petlja za pronalazenje najmanjih faktora
        while (factor <= num) {
        	//if uslov za djeljenje sa najmanjim faktorima
            if (num % factor == 0) {
                stack.push(factor);
                num /= factor;
            } 
            else {
                factor++;
            }
        }
        // while petlja za praznjenje stack prostora LIFO princip
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
	// metoda za provjeru unosa 
	public static int checkIn(){
			
			int num =0;
			boolean checkIn = true;
			
			/// do while petlja da se izvrsava sve dok ne bude korektan unos
			do{
				//try blok provjerava unos
				try{
					num = in.nextInt();
					
					checkIn= false;
				}
				// hvatanje izuzetka
				catch (InputMismatchException e) {
				    System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
				    in.nextLine();
				
				}
			}while(checkIn);
			
			return num;
		}
}
