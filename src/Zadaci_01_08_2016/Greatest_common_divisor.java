package Zadaci_01_08_2016;

import java.util.Scanner;

public class Greatest_common_divisor {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		System.out.println("Enter first number: ");
		int num1 = in.nextInt();
		System.out.println("Enter second number: ");
		int num2 = in.nextInt();
		in.close();
		
		System.out.println("The greatest common divisor is " + GreatestCommonDivisor (num1,num2) );
	}
	
	public static int GreatestCommonDivisor (int number1, int number2){
		// The method return the greatest common divisor
		
		int commonDivisor = 0;
		
		for (int i =1; i<=number1 && i<= number2; i++){
			if (number1 %i ==0 && number2%i ==0){
				//finds common divisors
				
				commonDivisor= i;
			}
		}
		return commonDivisor;
				
	}
}
