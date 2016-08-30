package Zadaci_29_08_2016;
/*
 * (InputMismatchException) 
 * Write a program that prompts the user to read two integers and displays their sum. 
 * Your program should prompt the user to read the number again if the input is incorrect. 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionn {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite prvi broj:");
			int a= checkIn();	//unos broja
			
		System.out.println("Unesite drugi broj:");
			int b=  checkIn();	//unos broja
			
		System.out.println("Suma brojeva: "+ a + " + "+ b + " = "+ (a+b));
	}
	// metoda za provjeru unosa 
	public static int checkIn(){
			int num =0;
			boolean checkIn = true;
			
			/// do while petlja da se izvrsava sve dok ne bude korektan cijeli broj
			do{
				//try blok provjerava unos
				try{
					num = in.nextInt();
					checkIn= false;
				}
				// hvatanje izuzetka
				catch (InputMismatchException e) {
				    System.out.println("Input Mismatch Exception, unesite ponovo;"); 
				    in.nextLine();
				
				}
			}while(checkIn);
			
			return num;
		}
}